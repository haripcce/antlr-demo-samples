grammar OracleSQL;

options {
	language=Java;
}

tokens {
    T_UNKNOWN ,
    T_RESERVED ,
    // Identifier subtypes AST leafs
    T_TABLE_ALIAS ,
    T_COLUMN_ALIAS ,
    T_COLUMN_NAME ,
    T_TABLE_NAME ,
    T_SCHEMA_NAME ,
    T_FUNCTION_NAME ,
    T_PACKAGE_NAME ,
    T_DBLINK_NAME ,
    T_BINDVAR_NAME ,

    //Alias type(declaration, usage)
    T_DECL ,
    T_USE  ,

    //Tree nodes
    T_WITH ,
    T_SELECT ,
    T_SUBQUERY ,
    T_TABLE_CAST,
    T_COLUMN_LIST ,
    T_SELECT_COLUMN ,
    T_FROM ,
    //T_SELECTED_TABLE ,
    T_WHERE ,
    T_HIERARCHICAL,
    T_GROUP_BY ,
    T_MODEL ,
    T_UNION ,
    T_ORDER_BY_CLAUSE,
    T_FOR_UPDATE_CLAUSE,

    T_OPERATOR_UNARY,
    T_OPERATOR_BINARY,
    T_OPERATOR_PART,
    T_COND_OR,
    T_COND_OR_SEQ,
    T_COND_AND,
    T_COND_AND_SEQ,
    T_COND_NOT,
    T_COND_EXISTS,
    T_COND_IS,
    T_COND_COMPARISON,
    T_COND_GROUP_COMPARISON,
    T_COND_IN,
    T_COND_IS_A_SET,
    T_COND_IS_ANY,
    T_COND_IS_EMPTY,
    T_COND_IS_OF_TYPE,
    T_COND_IS_PRESENT,
    T_COND_LIKE,
    T_COND_MEMEBER,
    T_COND_BETWEEN,
    T_COND_REGEXP_LIKE,
    T_COND_SUBMULTISET,
    T_COND_EQUALS_PATH,
    T_COND_UNDER_PATH,
    T_COND_PAREN
}

@lexer::includes {
#include "macros.h"
#include "error_handler.h"
}

@parser::includes {
#include "macros.h"
#include "error_handler.h"
}

@lexer::apifuncs {
//            RECOGNIZER->displayRecognitionError = myDisplayRecognitionLexerError;
}

@parser::apifuncs {
//            RECOGNIZER->displayRecognitionError = myDisplayRecognitionParserError;
}

start_rule
	: (
            select_statement
        |	update_statement
        |	insert_statement
        |	merge_statement
        |	delete_statement
        )
        (SEMI|EOF)
        ;
/* ================================================================================
   DELETE Statement
   ================================================================================ */
delete_statement
    : r_delete r_from?
        (
            dml_table_expression_clause
        |      k_only LPAREN dml_table_expression_clause RPAREN
        )
        t_alias[T_DECL]? where_clause? returning_clause? error_logging_clause?
    ;

/* ================================================================================
   MERGE Statement
   ================================================================================ */
merge_statement
	: k_merge r_into (schema_name DOT)? table_name t_alias[T_DECL]?
        k_using
        (
            subquery
        |	(schema_name DOT)? table_name
        )
        t_alias[T_DECL]? r_on LPAREN sql_condition RPAREN
        (
            merge_update_clause merge_insert_clause?
        |
            merge_insert_clause merge_update_clause?
        )?
        error_logging_clause?
    ;

merge_update_clause
	: k_when k_matched r_then r_update r_set column_spec EQ (r_default | sql_expression)
        (COMMA column_spec EQ (r_default | sql_expression))*
        where_clause? (r_delete where_clause)?
    ;

merge_insert_clause
	: k_when r_not k_matched r_then r_insert (LPAREN column_specs RPAREN)?
        r_values LPAREN (r_default | sql_expression) (COMMA (r_default | sql_expression))* RPAREN
        where_clause?
    ;

/* ================================================================================
   INSERT Statement
   ================================================================================ */
insert_statement
	: r_insert (single_table_insert | multi_table_insert)
    ;
single_table_insert
	: insert_into_clause ( values_clause returning_clause? | select_statement | subquery ) error_logging_clause?
    ;
insert_into_clause
	: r_into dml_table_expression_clause t_alias[T_DECL]? ( LPAREN column_specs RPAREN )?
	;
values_clause
	: r_values LPAREN ( r_default | sql_expression) ( COMMA (r_default | sql_expression))* RPAREN
    ;
returning_clause
    : ( k_return | k_returning ) sql_expression (COMMA sql_expression)* r_into data_item (COMMA data_item)*
    ;
multi_table_insert
	: (
            r_all ( insert_into_clause values_clause? error_logging_clause? )+
        |   conditional_insert_clause
        )
        subquery
    ;
conditional_insert_clause
	: ( r_all | k_first )?
        ( k_when sql_condition r_then ( insert_into_clause values_clause? )+ )+
        r_else ( insert_into_clause values_clause? )+
    ;
dml_table_expression_clause
	:
		( schema_name DOT)? table_name ( partition_extension_clause | AT_SIGN dblink_name)?
	|	subquery subquery_restricrion_clause? (pivot_clause|unpivot_clause)?
	|	LPAREN subquery subquery_restricrion_clause? RPAREN
	|	table_collection_clause
	;
error_logging_clause
	: k_log k_errors ( r_into (schema_name DOT)? table_name)? (LPAREN simple_expression RPAREN)? (k_reject k_limit (NUMBER | k_unlimited))?
    ;
data_item
	: sql_identifier[T_UNKNOWN,0]
    | bind_variable
    ;

/* ================================================================================
   UPDATE Statement
   ================================================================================ */
update_statement
	: r_update ( k_only LPAREN dml_table_expression_clause RPAREN | dml_table_expression_clause) t_alias[T_DECL]?
		update_set_clause where_clause? returning_clause? error_logging_clause?;

update_set_clause
	: r_set
        (
            k_value LPAREN t_alias[T_DECL] RPAREN EQ ( sql_expression | subquery)
        |	(
                (update_set_clause_part1 | update_set_clause_part2 )
            	(COMMA (update_set_clause_part1 | update_set_clause_part2))*
            )
        )
    ;
update_set_clause_part1
	:	LPAREN column_specs RPAREN EQ subquery
    ;
update_set_clause_part2
	:	column_spec EQ ( r_default | subquery | sql_expression)
	;
/* ================================================================================
   SELECT Statement
   ================================================================================ */
select_statement
	:
	subquery_factoring_clause?
	(
	(
	sel=r_select /*( hint )?*/ ( r_distinct | r_unique| r_union | r_all )? select_list
	( r_into data_item (COMMA data_item)*)?
	r_from
//        ( table_reference_list | join_clause | LPAREN join_clause RPAREN )
	table_reference_list
	( where_clause )?
	( hierarchical_query_clause )?
	( group_by_clause )?
	( model_clause )?
	( union_clause )*
	( fu1=for_update_clause )?
	( order_by_clause )?
	( fu2=for_update_clause )?

    )
    | subquery
	)
	;
/* ================================================================================
   subquery factoring
   ================================================================================ */
subquery_factoring_clause
	:
	with=r_with
// NOTE: these two lines were commented out just to preserve COMMAs in parse tree
//	si1=sql_identifier[T_UNKNOWN,0] (lp1=LPAREN sl1=select_list rp1=RPAREN)? as1=r_as sq1=subquery
//	(COMMA si2=sql_identifier[T_UNKNOWN,0] (lp2=LPAREN sl2=select_list rp2=RPAREN)? as2=r_as sq2=subquery)*
	subquery_factoring_clause_part_first subquery_factoring_clause_part_next*
	search_clause?
	cycle_clause?
    ;
subquery_factoring_clause_part_first
	:	t_alias[T_DECL] (LPAREN select_list RPAREN)? r_as subquery
    ;
subquery_factoring_clause_part_next
	:	COMMA t_alias[T_DECL] (LPAREN select_list RPAREN)? r_as subquery
    ;

search_clause
	: k_search ( k_depth | k_breadth ) k_first r_by
 	( c_alias r_asc ? r_desc ? (k_nulls k_first)? (k_nulls k_last)? )
 	( COMMA c_alias r_asc ? r_desc ? (k_nulls k_first)? (k_nulls k_last)? )*
	r_set sql_identifier[T_UNKNOWN,0]
	;

cycle_clause
	: k_cycle c_alias ( COMMA c_alias)* r_set sql_identifier[T_UNKNOWN,0] r_to literal r_default literal
	;

/* ================================================================================
   Query column list specs (ie. everything between "SELECT" ... "FROM"
   ================================================================================ */
select_list
//	: displayed_column (COMMA displayed_column)*
	: displayed_column_part_first displayed_column_part_next*
	;
displayed_column_part_first
	: displayed_column
    ;
displayed_column_part_next
	: c=COMMA displayed_column
    ;
displayed_column
	: (
        asterisk1=ASTERISK
		| (schema_name d1=DOT)? table=t_alias[T_USE] d2=DOT asterisk2=ASTERISK
		| sql_expression
		)
		c_alias?
    ;
sql_expression
	:	expr_add
	;
expr_add
	:	expr_mul ( ( PLUS | MINUS | doublevertbar ) expr_mul )*
	;
expr_mul
	:	expr_sign ( ( ASTERISK | DIVIDE ) expr_sign )*
	;
expr_sign // in fact this is not "sign" but unary operator
	:	( PLUS | MINUS | r_prior | k_connect_by_root )? expr_expr
	;
expr_expr
	:	extract_datetime_expression
	|	interval_x_to_y
	|	datetime_expression
	|	interval_expression
	|	expr_paren
	|	cursor_expression
	|	cast_expression
	|	special_expression
	|	object_access_expression
	|	case_expression
	|	special_function
	|	analytic_function
	|	aggregate_function
	|	function_expression
//	|	( compound_expression ) => compound_expression
	|	simple_expression
//	|	( select_expression ) => select_expression replaced with subquery
//	|	scalar_subquery_expression
//	|	model_expression
//	|	type_constructor_expression
//	|	variable_expression
//	:	r_null | NUMBER | QUOTED_STRING | IDENTIFIER
	|	subquery
	;
expr_paren
	:	LPAREN nested_expression RPAREN
	;
nested_expression
	:	sql_expression
	;
function_expression
 	:	(function_spec|analytic_function_name) LPAREN call_parameters? RPAREN
	;

call_parameters
	: ASTERISK
	| call_parameter ( COMMA call_parameter )*
	;
call_parameter
	:	 ( parameter_name ARROW )? nested_expression
	;
parameter_name
	:	identifier[T_UNKNOWN,0]
	;
// This rule repsents some of Oracle's internal functions with non-common calling convention
// like: TRIM( BOTH ' ' FROM X)
// look at aggregate_function and analytic_function for other examples
// TODO: VARIANCE, VAR_SAMP, VAR_POP, TREAT, TRANSLATE, SUM, STDDEV_SAMP, STDDEV_POP, STDDEV, ROW_NUMBER,
// REGR_*, RATIO_TO_REPORT, PREDICTION_SET, PREDICTION_PROBABILITY, PREDICTION_DETAILS, PREDICTION_COST,
// PREDICTION_BOUNDS, PREDICTION, NTILE, NTH_VALUE, MIN, MEDIAN, MAX, LNNVL, LISTAGG, LEAD, LAST_VALUE,
// LAST, LAG, FIRST_VALUE, FIRST, FEATURE_VALUE, FEATURE_SET, FEATURE_ID, DECOMPOSE, CUME_DIST, CUBE_TABLEC,
// COVAR_SAMP, COVAR_POP, COUNT, CORR, COLLECT, CLUSTER_SET, CLUSTER_PROBABILITY, CLUSTER_ID, CHR, CAST,
// AVG,
special_function
	:
	(
        k_trim
        LPAREN
			( ( k_leading | k_trailing | k_both)? QUOTED_STRING? r_from )?
			sql_expression
        RPAREN
	)
	| (r_set LPAREN sql_expression RPAREN)
	| (k_lnnvl LPAREN sql_condition RPAREN)
    ;

case_expression
	:	r_case ( simple_case_expression | searched_case_expression ) ( else_case_expression )? k_end
	;
cursor_expression
	:	k_cursor subquery
	;
simple_case_expression
	:	nested_expression ( k_when nested_expression r_then nested_expression )+
	;
searched_case_expression
	:	( k_when sql_condition r_then nested_expression )+
	;
else_case_expression
	:	r_else nested_expression
	;

object_access_expression
	:
	(
		LPAREN sql_expression RPAREN DOT
	|	table_name DOT
	|	function_expression DOT
	)
	(identifier[T_UNKNOWN,0] DOT)*
	function_expression
	;
simple_expression
	:	boolean_literal
	|	k_sql ( FOUND_ATTR | NOTFOUND_ATTR | ISOPEN_ATTR | ROWCOUNT_ATTR | BULK_ROWCOUNT_ATTR )
	|	cell_assignment // this is used only in model_clause s[PROD= 'A' ] = S[ 'a' ] + 1
	|	column_spec
	|	timestamp_expression
	|	quoted_string
	|	NUMBER
	;
query_block
	:	r_select /*( hint )?*/ ( r_distinct | r_unique | r_all )? select_list
		r_from table_reference_list
		( where_clause )?
		( hierarchical_query_clause )?
		( group_by_clause )?
        ( model_clause )?
	;
// a subquery can be followed by same statements like SELECT rule
subquery
	:	LPAREN select_statement RPAREN
        ( group_by_clause )?
        ( model_clause )?
        ( union_clause )*
        ( fu1=for_update_clause )?
        ( order_by_clause )?
        ( fu2=for_update_clause )?
	|	LPAREN subquery RPAREN
        ( group_by_clause )?
        ( model_clause )?
        ( union_clause )*
        ( fu1=for_update_clause )?
        ( order_by_clause )?
        ( fu2=for_update_clause )?
	;

timestamp_expression
	:	(r_date | k_timestamp) quoted_string
    ;
interval_x_to_y
	: k_interval
        (
            (
                ( quoted_string | bind_variable)
                ( k_year | k_month )
                ( LPAREN precision RPAREN )?
                ( k_to (k_year | k_month ))?
            )
        |
            (
                ( quoted_string | bind_variable)
                ( k_day | k_hour | k_minute | k_second )
                (LPAREN precision (COMMA precision)? RPAREN)?
                (k_to ( k_day | k_hour | k_minute | k_second ) (LPAREN precision RPAREN)? )?
            )
        )
	;
precision
	: NUMBER
    | bind_variable
	;

extract_datetime_expression
	:	k_extract
        LPAREN
        (	k_year
        |	k_month
        |	k_day
        |	k_hour
        |	k_minute
        |	k_second
        |	k_timezone_hour
        |	k_timezone_minute
        |	k_timezone_region
        |	k_timezone_abbr
        )
        r_from
        sql_expression
        RPAREN
    ;
datetime_expression
	:
        ( function_expression | cast_expression | simple_expression )
        k_at (k_local | k_time k_zone ( quoted_string | k_dbtimezone | k_sessiontimezone | sql_expression ));

interval_expression
	:
		LPAREN ( function_expression | cast_expression | simple_expression ) MINUS ( function_expression | cast_expression | simple_expression ) RPAREN
		(	k_day (LPAREN NUMBER RPAREN)? r_to k_second (LPAREN NUMBER RPAREN)?
		|	k_year (LPAREN NUMBER RPAREN)? r_to k_month (LPAREN NUMBER RPAREN)?
		)
	;
/* ================================================================================
   Special expressions
   ================================================================================ */
special_expression
	:	cluster_set_clause
	;
cluster_set_clause
	:	k_cluster_set LPAREN column_spec (COMMA column_spec)? (COMMA NUMBER)? k_using (column_specs|ASTERISK) RPAREN
	;

cast_expression
	:	k_cast LPAREN (sql_expression | k_multiset subquery) r_as (datatype_name|column_spec) RPAREN
	;
datatype_name
	:	k_binary_integer
	|	k_binary_float
	|	k_binary_double
	|	k_natural
	|	k_positive
	|	( r_number | k_numeric | r_decimal | k_dec ) ( LPAREN NUMBER ( COMMA NUMBER )? RPAREN )?
	|	r_long ( r_raw)? ( LPAREN NUMBER RPAREN )?
	|	r_raw ( LPAREN NUMBER RPAREN )?
	|	k_boolean
	|	r_date
	|	k_interval k_day ( LPAREN NUMBER RPAREN )? r_to k_second ( LPAREN NUMBER RPAREN )?
	|	k_interval k_year ( LPAREN NUMBER RPAREN )? r_to k_month
	|	( k_time | k_timestamp ) ( LPAREN NUMBER RPAREN )? ( r_with ( k_local )? k_time k_zone )?
	|	r_integer
	|	k_int
	|	r_smallint
	|	r_float ( LPAREN NUMBER RPAREN )?
	|	k_real
	|	k_double k_precision
	|	r_char      ( k_varying )? ( LPAREN NUMBER ( k_byte | r_char )? RPAREN )? ( k_character r_set ( identifier[T_UNKNOWN,0] | column_spec CHARSET_ATTR ) )?
	|	r_varchar                  ( LPAREN NUMBER ( k_byte | r_char )? RPAREN )? ( k_character r_set ( identifier[T_UNKNOWN,0] | column_spec CHARSET_ATTR ) )?
	|	r_varchar2                 ( LPAREN NUMBER ( k_byte | r_char )? RPAREN )? ( k_character r_set ( identifier[T_UNKNOWN,0] | column_spec CHARSET_ATTR ) )?
	|	k_character ( k_varying )? ( LPAREN NUMBER RPAREN )?
	|	k_nchar     ( k_varying )? ( LPAREN NUMBER RPAREN )?
	|	k_nvarchar  ( LPAREN NUMBER RPAREN )?
	|	k_nvarchar2 ( LPAREN NUMBER RPAREN )?
	|	k_national  ( k_character | r_char ) ( k_varying )? ( LPAREN NUMBER RPAREN )?
	|	k_mlslabel
	|	k_pls_integer
	|	k_blob
	|	k_clob ( k_character r_set ( identifier[T_UNKNOWN,0] | column_spec CHARSET_ATTR ) )?
	|	k_nclob
	|	k_bfile
	|	r_rowid
	|	k_urowid ( LPAREN NUMBER RPAREN )?
	;

boolean_literal
	:	r_true | r_false
	;

t_alias[int aliasUsage]
	:	sql_identifier[T_TABLE_ALIAS,aliasUsage]
	;

c_alias
	:	r_as? sql_identifier[T_COLUMN_ALIAS,T_DECL]
	|	r_as
	;

column_spec
	: ((schema_name DOT)? t_alias[T_USE] DOT)? column_name outer_join_sign?
	// In fact with nested objects sequence of identifiers and DOT can be "infinite"
	| schema_name DOT package_name DOT identifier[T_UNKNOWN,0] DOT identifier[T_UNKNOWN,0]
	| pseudo_column
	| bind_variable
	;

//TODO more pseudocolumns here - especially those who are reserved words
pseudo_column
	: r_null
    | r_sysdate
    | r_user
//	| r_rowid
//	| r_rownum
	| r_level				// hierarchical query
	// | k_connect_by_isleaf
	// | k_connect_by_iscycle
	// | k_versions_starttime	// flashback query
	// | k_versions_starscn
	// | k_versions_endtime
	// | k_versions_endscn
	// | k_versions_xid
	// | k_versions_operation
	// | k_column_value	// XMLTABLE query
	// | k_object_id		//
	// | k_object_value	//
	// | k_ora_rowscn		//
	// | k_xmldata
	;

function_name
	: sql_identifier[T_FUNCTION_NAME,0]
    ;

function_spec
 	: schema_name DOT package_name DOT function_name
	| schema_name DOT function_name
	| function_name
	;

identifier[int identifierClass, int usageType]
	:	i=ID                  {  }
	;
// NOTE there can a space between COLON and identifier like ': 2'
bind_variable
 	:	i=BINDVAR             {  }
	|	c=COLON               {  }
		n=NUMBER              {  }
	;

sql_identifier[int identifierClass, int usageType]
	:	i=identifier[identifierClass, usageType]
	|	k=keyword[identifierClass, usageType]
	|	ri=r_rowid
	|	rn=r_rownum
	;

/* ================================================================================
   Query tables specs (ie. everything between "FROM" ... "WHERE"
   ================================================================================ */
table_reference_list
	:	(
			(join_clause|table_reference) (COMMA (join_clause|table_reference))*
		)
//	->('t_from' join_clause? LPAREN? join_clause? RPAREN? table_reference?
//                (COMMA (join_clause|(LPAREN join_clause RPAREN)|table_reference))*
//	)
	;
table_reference
	:	((k_only LPAREN query_table_expression RPAREN)
	|	query_table_expression /*( pivot_clause | unpivot_clause )?*/) flashback_query_clause? t_alias[T_DECL]?
	;
query_table_expression
	:	//query_name
		( schema_name DOT)? table_name ( partition_extension_clause | AT_SIGN dblink_name)? sample_clause? (pivot_clause|unpivot_clause)?
	|	subquery subquery_restricrion_clause? (pivot_clause|unpivot_clause)?
	|	LPAREN subquery subquery_restricrion_clause? (pivot_clause|unpivot_clause)? RPAREN
//TODO add subquery_restricrion_clause into subquery
	|	table_collection_clause (pivot_clause|unpivot_clause)?
	;
flashback_query_clause
	:	( k_versions r_between ( k_scn |k_timestamp) (sql_expression| k_mivalue ) r_and (sql_expression| k_maxvalue ))?
		r_as r_of ( k_scn |k_timestamp) sql_expression
	;
sample_clause
	:	k_sample k_block ? LPAREN sample_percent (COMMA sample_percent)? RPAREN ( k_seed LPAREN seed_value RPAREN)?
	;
partition_extension_clause
	:	k_partition (( LPAREN partition RPAREN ) | ( r_for LPAREN partition_key_value (COMMA partition_key_value)* RPAREN))
    |	k_subpartition (( LPAREN partition RPAREN ) | ( r_for LPAREN subpartition_key_value (COMMA subpartition_key_value)* RPAREN))
	;
subquery_restricrion_clause
	:	r_with ((k_read k_only) | (r_check r_option ( k_constraint constraint)?))
	;
table_collection_clause
	:	( r_table | k_the ) /*LPAREN*/ collection_expression /*RPAREN*/ outer_join_sign?
    ;
join_clause
	:	(LPAREN join_clause RPAREN|table_reference) (inner_cross_join_clause|outer_join_clause)+
    |   LPAREN join_clause RPAREN
	;
inner_cross_join_clause
	:	k_inner? k_join table_reference ((r_on sql_condition)|(k_using LPAREN column_specs RPAREN))*
    |	(k_cross | k_natural k_inner?) (k_join table_reference)
	;
outer_join_clause
	:	( query_partition_clause )?
		(	outer_join_type k_join
		|	k_natural ( outer_join_type )? k_join
		)
		table_reference ( query_partition_clause )? ( r_on sql_condition | k_using LPAREN column_specs RPAREN )?
	;
query_partition_clause
	:	k_partition r_by expression_list
	;
outer_join_type
 	:	( k_full | k_left | k_right ) ( k_outer )?
	;

sample_percent
	:	NUMBER
	|	bind_variable
	;
seed_value
	:	NUMBER
	|	bind_variable
	;
outer_join_sign
	:	LPAREN PLUS RPAREN
	;
table_name
	:	sql_identifier[T_TABLE_NAME,0]
	;
schema_name
	:	sql_identifier[T_SCHEMA_NAME,0]
	;
package_name
	:	sql_identifier[T_PACKAGE_NAME,0]
	;
dblink_name
 	:	sql_identifier[T_DBLINK_NAME,0]
 	;
column_specs
	:	column_spec ( COMMA column_spec )*
	;
partition
	:	identifier[T_UNKNOWN,0]
	;
partition_key_value
	:	identifier[T_UNKNOWN,0] | NUMBER
	;
subpartition_key_value
	:	identifier[T_UNKNOWN,0] | NUMBER
	;
constraint
	:	sql_identifier[T_UNKNOWN,0]
	;
collection_expression
	: subquery
    | LPAREN (cast_expression|function_expression) RPAREN
    | LPAREN column_spec RPAREN /* TODO collection constructor (+) */
	;

// here start original JOIN related rules
// I left them for historical reasons. For example I could not find any reference
// for the keyword "THE" in the latest 11gR2 SQL reference
// table_reference_list
// 	:	selected_table ( COMMA selected_table )* (pivot_clause|unpivot_clause)?
// 	;
// join_clause
// 	:	table_name c_alias? ( inner_cross_join_clause | outer_join_clause )+
// 	;
// inner_cross_join_clause
// 	:	( k_inner )? k_join table_name c_alias? ( r_on sql_condition | k_using LPAREN column_specs RPAREN )
// 	|	( k_cross | k_natural ( k_inner ) ) k_join table_name c_alias?
// 	;
// outer_join_clause
// 	:	( query_partition_clause )?
// 		(	outer_join_type k_join
// 		|	k_natural ( outer_join_type )? k_join
// 		)
// 		table_name c_alias? ( query_partition_clause )?
// 		( r_on sql_condition | k_using LPAREN column_specs RPAREN )?
// 	;
// column_specs
// 	:	column_spec ( COMMA column_spec )*
// 	;
// query_partition_clause
// 	:	k_partition r_by expression_list
// 	;
// outer_join_type
// 	:	( k_full | k_left | k_right ) ( k_outer )?
// 	;
// outer_join_sign
// 	:	LPAREN PLUS RPAREN
// 	;
// selected_table
// 	:	( table_spec | ( r_table | k_the )? subquery ) (alias|alias_name=sql_identifier[T_UNKNOWN])?
//         -> ^('selected_table' table_spec? r_table? k_the? subquery? alias? $alias_name? )
// 	;

// table_spec
// 	:	( schema_name DOT )? table_name ( AT_SIGN link_name )?
// 		-> ^('selected_table' schema_name? DOT? table_name? AT_SIGN? link_name?)
// 	|	table_cast
// 		-> ^('selected_table' table_cast)
// 	;

// schema_name
// 	:	sql_identifier[T_UNKNOWN]
// 	;
// table_name
// 	:	sql_identifier[T_UNKNOWN]
// 	;
// table_alias
// 	:	( schema_name DOT )? table_name ( AT_SIGN link_name )? ( alias )?
// 	;
// link_name
// 	:	sql_identifier[T_UNKNOWN]
// 	;
// table_cast
// 	:	r_table LPAREN (simple_expression | select_expression | cast_expression) RPAREN
//     ;

/* ================================================================================
   where clause
   ================================================================================ */
where_clause
	:	r_where sql_condition
	;
/* ================================================================================
   hierarchical query clause
   ================================================================================ */
hierarchical_query_clause
	:	r_connect r_by ( k_nocycle )? connect1=sql_condition ( r_start r_with start1=sql_condition )?
	|	( r_start r_with start2=sql_condition ) r_connect r_by ( k_nocycle )? connect2=sql_condition
	;

/* ================================================================================
   group by clause
   ================================================================================ */
group_by_clause
    :	( h1=r_having c1=sql_condition (g1=r_group b1=r_by e1=group_by_exprs)? )
    |	( g2=r_group b2=r_by e2=group_by_exprs (h2=r_having c2=sql_condition)? )
	;
group_by_exprs
	:	group_by_expr ( COMMA group_by_expr )*
	;
group_by_expr
	:	rollup_cube_clause
	|	grouping_sets_clause
	|	grouping_expression_list
	;
rollup_cube_clause
	:	( k_rollup | k_cube ) LPAREN grouping_expression_list RPAREN
	;
grouping_sets_clause
	:	k_grouping k_sets LPAREN grouping_sets_expression_list RPAREN
	;
grouping_sets_exprs
	:	grouping_sets_expr ( COMMA grouping_sets_expr )*
	;
grouping_sets_expr
	:	rollup_cube_clause | grouping_expression_list
	;
sql_condition
	:	condition_or
	;
condition_or
	:	condition_and ( r_or condition_and )*
//	:	condition_and ( r_or condition_and )+ ->^(T_COND_OR_SEQ ^(T_COND_OR condition_not r_or)*)
//	|	condition_and
	;
condition_and
	:	condition_not ( r_and condition_not )*
//	:	condition_not ( r_and condition_not )+ ->^(T_COND_AND_SEQ ^(T_COND_AND condition_not r_and)*)
//	|	condition_not
	;
condition_not
	:	r_not condition_expr
	|	condition_expr
	;
condition_expr
	:	condition_exists
//	|	(LPAREN+ sql_condition) => condition_paren
	|	condition_paren
	|	condition_is
    |	condition_comparison
	|	condition_group_comparison
	|	condition_in
	|	condition_is_a_set
	|	condition_is_any
	|	condition_is_empty
	|	condition_is_of_type
	|	condition_is_present
	|	condition_like
	|	condition_memeber
	|	condition_between
	|	condition_regexp_like
	|	condition_submultiset
	|	condition_equals_path
	|	condition_under_path
	|	condition_paren
	;

condition_exists
	:	r_exists subquery
	;
condition_is
	:	column_spec outer_join_sign? r_is ( r_not )? ( k_nan | k_infinite | r_null )
	|	sql_expression  r_is ( r_not )? ( k_nan | k_infinite | r_null )
	;
condition_comparison
@after {
 	//pANTLR3_BASE_TREE pRoot = retval.tree;
  //   if(retval.start != 0 && pRoot != 0) {  }
}
	:
        LPAREN sql_expressions RPAREN o1=outer_join_sign? ( EQ | not_equal ) subquery o2=outer_join_sign?
    |
        rp1=r_prior? se1=sql_expression o1=outer_join_sign? ( EQ | not_equal | GTH | geq | LTH | leq ) rp2=r_prior? ( se2=sql_expression | LPAREN select_statement RPAREN ) o2=outer_join_sign?
	;
condition_group_comparison
	:	LPAREN sql_expressions RPAREN ( EQ | not_equal ) ( r_any | k_some | r_all ) LPAREN ( grouping_expression_list | select_statement ) RPAREN
	|	sql_expression ( EQ | not_equal | GTH | geq | LTH | leq ) ( r_any | k_some | r_all ) LPAREN ( sql_expressions | select_statement ) RPAREN
	;
condition_in
 	:	LPAREN sql_expressions RPAREN ( r_not )? r_in LPAREN ( grouping_expression_list | select_statement ) RPAREN
	|	sql_expression ( r_not )? r_in LPAREN ( expression_list | select_statement ) RPAREN
	|	sql_expression ( r_not )? r_in sql_expression
	;
condition_is_a_set
	:	nested_table_column_name r_is ( r_not )? k_a r_set
	;
condition_is_any
	:	( column_name r_is )? r_any
	;
condition_is_empty
	:	nested_table_column_name r_is ( r_not )? k_empty
	;
condition_is_of_type
	:	sql_expression r_is (r_not)? r_of ( k_type )? LPAREN type_names RPAREN
	;
// condition_is_of_type_names
// 	:	condition_is_of_type_name ( COMMA condition_is_of_type_name )*
// 	;
// condition_is_of_type_name
// 	:	( k_only )? type_name
// 	;
condition_is_present
	:	cell_reference r_is k_present
	;
condition_like
	:	sql_expression ( r_not )? ( r_like | k_likec | k_like2 | k_like4 ) sql_expression ( k_escape sql_expression )?
	;
condition_memeber
	:	sql_expression ( r_not )? k_member ( r_of )? (function_expression|nested_table_column_name)
	;
condition_between
	:	sql_expression ( r_not )? r_between sql_expression r_and sql_expression
	;
condition_regexp_like
 	:	k_regexp_like LPAREN call_parameters RPAREN
 	;
condition_submultiset
	:	nested_table_column_name ( r_not )? k_submultiset ( r_of )? nested_table_column_name
	;
condition_equals_path
	:	k_equals_path LPAREN column_name COMMA path_string ( COMMA correlation_integer )? RPAREN
	;
condition_under_path
	:	k_under_path LPAREN column_name ( COMMA levels )? COMMA path_string ( COMMA correlation_integer )? RPAREN
	;
levels
	:	integer
	;
correlation_integer
	:	integer
	;
path_string
	:	quoted_string
	;
type_names
	:	k_only? (schema_name DOT)? identifier[T_UNKNOWN,0]
		( k_only? (schema_name DOT)? identifier[T_UNKNOWN,0] )*
	;
integer
	:	NUMBER
	;
column_name
	:	sql_identifier[T_COLUMN_NAME,0]
	;
nested_table
	:	sql_identifier[T_TABLE_ALIAS,T_USE]
	;
nested_table_column_name
	:	( schema_name DOT )? (table_name DOT)? (nested_table DOT)? column_name
	;
sql_expressions
	:	sql_expression ( COMMA sql_expression )*
	;
// In this case Oracle SQL reference is not true enough
grouping_sets_expression_list
	:
	(

        LPAREN RPAREN
	|	LPAREN sql_expressions RPAREN
	|	sql_expression
	)
	( COMMA
		( LPAREN RPAREN
	 	| LPAREN sql_expressions RPAREN
		| sql_expression
		)
	)*
	;
grouping_expression_list
	:	expression_list ( COMMA expression_list )*
	;
expression_list
	:	LPAREN sql_expressions RPAREN
	|	sql_expressions
	;
cell_reference
	:	sql_identifier[T_UNKNOWN,0]
	;

condition_paren
	:	LPAREN sql_condition RPAREN
	;

/* ================================================================================
   MODEL clause
   ================================================================================ */
model_clause
	:	k_model main_model
        ( cell_reference_options )?
		( return_rows_clause )?
		( reference_model )* //main_model
	;
cell_reference_options
	:	( ( k_ignore | k_keep ) k_nav )?
		( r_unique ( k_dimension | k_single k_reference ) )?
	;
return_rows_clause
	:	k_return ( k_updated | r_all ) r_rows
	;
reference_model
	:	k_reference reference_model_name r_on LPAREN subquery RPAREN
		model_column_clauses ( cell_reference_options )
	;
reference_model_name
	:	identifier[T_UNKNOWN,0]
	;
main_model
	:	( k_main main_model_name )? model_column_clauses
		( cell_reference_options ) model_rules_clause
	;
main_model_name
	:	identifier[T_UNKNOWN,0]
	;
model_column_clauses
	:	( query_partition_clause ( column_spec )? )?
		k_dimension r_by LPAREN model_columns RPAREN
		k_measures LPAREN model_columns RPAREN
	;
model_columns
	:	model_column ( COMMA model_column )*
	;
model_column
	:	sql_expression ( ( r_as )? column_spec )?
	;
model_rules_clause
	:	( k_rules ( r_update | k_upsert ( r_all )? )? ( ( k_automatic | k_sequential ) r_order )? )?
		( k_iterate LPAREN NUMBER RPAREN ( k_until LPAREN sql_condition RPAREN )? )?
		LPAREN model_rules_exprs RPAREN
	;
model_rules_exprs
	:	model_rules_expr ( COMMA model_rules_expr )*
	;
model_rules_expr
	:	( r_update | k_upsert ( r_all )? )? cell_assignment ( order_by_clause )? EQ sql_expression
	;
cell_assignment
	:	measure_column LBRACK ( multi_column_for_loop | cell_assignment_exprs ) RBRACK
	;
cell_assignment_exprs
	:	cell_assignment_expr ( COMMA cell_assignment_expr )*
	;
cell_assignment_expr
	:	sql_condition | sql_expression | single_column_for_loop
	;
measure_column
	:	column_name
	;
single_column_for_loop
	:	r_for column_name
		(	r_in LPAREN ( literals | subquery ) RPAREN
		|	( r_like pattern )? r_from literal r_to literal ( r_increment | k_decrement ) literal
		)
	;
pattern
	:	quoted_string
	;
literal
	:	( PLUS | MINUS )? NUMBER
	|	quoted_string
	;
literals
	:	literal ( COMMA literal )*
	;
multi_column_for_loop
	:	r_for LPAREN column_specs RPAREN r_in LPAREN ( bracket_literals_list | subquery ) RPAREN
	;
bracket_literals
	:	LPAREN literals RPAREN
	;
bracket_literals_list
	:	bracket_literals ( COMMA bracket_literals )*
	;

/* ================================================================================
   UNION clause
   ================================================================================ */
union_clause
    :
	(	r_union ( r_all )?
 	|	r_intersect
 	|	r_minus
 	)
 	(	select_statement |	subquery )
	;

/* ================================================================================
   ORDER BY clause
   ================================================================================ */
order_by_clause
//TODO use search_clause here
	:	r_order k_siblings ? r_by order_by_clause_part_first order_by_clause_part_next*
	;
// NOTE: these two here here only to preserve COMMAs in parse tree
order_by_clause_part_first
	:	sql_expression r_asc ? r_desc ? (k_nulls k_first)? (k_nulls k_last)?
	;
order_by_clause_part_next
	:	COMMA sql_expression r_asc ? r_desc ? (k_nulls k_first)? (k_nulls k_last)?
	;

/* ================================================================================
   Analytic query part
   ================================================================================ */
analytic_function_name
	:
	// | k_avg	| k_corr	| k_covar_pop	| k_covar_samp	| k_count	| k_cume_dist	| k_dense_rank
	// | k_first	| k_first_value	| k_lag	| k_last	| k_last_value	| k_lead	| k_max	| k_min
	// | k_ntile	| k_percent_rank	| k_percentile_cont	| k_percentile_disc	| k_rank	| k_ratio_to_report
	// | k_regr_slope	| k_regr_intercept	| k_regr_count	| k_regr_r2	| k_regr_avgx	| k_regr_avgy
	// | k_regr_sxx	| k_regr_syy	| k_regr_sxy	| k_row_number	| k_stddev	| k_stddev_pop
	// | k_stddev_samp	| k_sum	| k_var_pop	| k_var_samp	| k_variance
	function_name
    ;

analytic_function_call
	: analytic_function_name LPAREN ( r_distinct | r_unique | r_all)? sql_expression? (COMMA sql_expression)* ( ( k_respect | k_ignore) k_nulls )? RPAREN
	;

analytic_function
	: dense_rank_analytic
    | percent_rank_analytic
    | percent_cont_disc_analytic
    | first_last
	| listagg
    | analytic_function_call ( ( k_respect | k_ignore) k_nulls )?  k_over LPAREN analytic_clause RPAREN
	;

count_function
	: k_count LPAREN ( ASTERISK | (r_distinct | r_unique | r_all)? sql_expression) RPAREN
        ( k_over LPAREN analytic_clause RPAREN)?
    ;
analytic_clause
	: query_partition_clause? (order_by_clause windowing_clause?)?
	;

windowing_clause_part
	: ( k_unbounded ( k_preceding | k_following ))
    | ( r_current r_row )
    | ( sql_expression ( k_preceding | k_following ) )
	;

windowing_clause
	: (r_rows | k_range )
	  ( windowing_clause_part | ( r_between windowing_clause_part r_and windowing_clause_part) )
	;

/* ================================================================================
   Aggregate functions
   ================================================================================ */
aggregate_function_name
	: (k_count | function_spec) // TODO use real list of aggregate function names here
	;
aggregate_function
	: dense_rank_aggregate
    | percent_rank_aggregate
	| first_last
	| listagg
	| aggregate_function_name LPAREN ( ASTERISK | (r_distinct | r_unique | r_all)? sql_expression) RPAREN ( k_over LPAREN analytic_clause RPAREN)?
    ;

/* ================================================================================
   Special functions
   ================================================================================ */
percent_rank_aggregate
	:	k_percent_rank LPAREN expression_list RPAREN k_within r_group
        LPAREN r_order r_by sql_expression (r_asc | r_desc)? (k_nulls (k_first | k_last))?
        (COMMA sql_expression (r_asc | r_desc)? (k_nulls (k_first | k_last))?)*
    ;
dense_rank_aggregate
	: k_dense_rank LPAREN expression_list RPAREN k_within r_group
        LPAREN r_order r_by sql_expression (r_asc | r_desc)? (k_nulls (k_first | k_last))?
        (COMMA sql_expression (r_asc | r_desc)? (k_nulls (k_first | k_last))?)*
    ;

percent_rank_analytic
	: k_percent_rank LPAREN RPAREN k_over LPAREN query_partition_clause RPAREN
    ;

percent_cont_disc_analytic
	: (k_percentile_disc | k_percentile_cont)
	LPAREN sql_expression RPAREN k_within r_group LPAREN order_by_clause RPAREN
        (k_over LPAREN query_partition_clause RPAREN)?
	;

dense_rank_analytic
	: k_dense_rank LPAREN RPAREN k_over LPAREN query_partition_clause RPAREN
    ;

first_last
	: aggregate_function_name LPAREN ( ASTERISK | (r_distinct | r_unique |r_all)? sql_expression) RPAREN k_keep
        LPAREN k_dense_rank (k_first|k_last) order_by_clause RPAREN ( k_over LPAREN analytic_clause RPAREN)?
    ;
listagg
	: k_listagg LPAREN sql_expression (COMMA quoted_string)? RPAREN k_within r_group LPAREN order_by_clause RPAREN
        (k_over LPAREN query_partition_clause RPAREN)?
    ;
/* ================================================================================
    FOR UPDATE CLAUSE
   ================================================================================ */
for_update_clause
	: r_for r_update ( r_of for_update_clause_part_first for_update_clause_part_next* )? (r_nowait | k_wait NUMBER | k_skip k_locked)?
	;
for_update_clause_part_first
	: (sch1=schema_name dot1a=DOT)? (tbl1=table_name dot1b=DOT)? col1=column_name
	;
for_update_clause_part_next
	: COMMA (sch1=schema_name dot1a=DOT)? (tbl1=table_name dot1b=DOT)? col1=column_name
	;

/* ================================================================================
    PIVOT CLAUSE
   ================================================================================ */
pivot_clause
	:	k_pivot k_xml? LPAREN aggregate_function c_alias? (COMMA aggregate_function c_alias?)*
		pivot_for_clause pivot_in_clause RPAREN
	;
pivot_for_clause
	:	r_for column_spec | ( LPAREN column_specs RPAREN )
	;
pivot_in_clause
	:	r_in
        LPAREN
        (
            select_statement
        |	r_any (COMMA r_any)*
        |	expression_list c_alias? (COMMA expression_list c_alias?) /*!!!*/
        )
        RPAREN
	;
unpivot_clause
	:	k_unpivot (( k_exclude | k_include ) k_nulls)?
		LPAREN (column_spec | (LPAREN column_specs RPAREN)) pivot_for_clause unpivot_in_clause RPAREN
	;
unpivot_in_clause
	:	r_in
		LPAREN
		(column_spec | (LPAREN column_specs RPAREN)) (r_as (constant | (LPAREN constant RPAREN)))?
		(COMMA (column_spec | (LPAREN column_specs RPAREN)) (r_as (constant | (LPAREN constant RPAREN)))?)*
		RPAREN
	;
constant
	:	NUMBER | quoted_string
	;	// TODO fixme

/* ================================================================================
   Oracle reserved words
   cannot by used for name database objects such as columns, tables, or indexes.
   ================================================================================ */
r_access : r='ACCESS' {   }  ;
r_add : r='ADD' {   }  ;
r_all : r='ALL' {   }  ;
r_alter : r='ALTER' {  }  ;
r_and : r='AND' {  }  ;
r_any : r='ANY' {   }  ;
r_arraylen : r='ARRAYLEN' {  }  ;
r_as : r='AS' {  }  ;
r_asc : r='ASC' {   }  ;
r_audit : r='AUDIT' {   }  ;
r_between : r='BETWEEN' {  }  ;
r_by : r='BY' {   }  ;
r_case : r='CASE' {  }  ; //PL/SQL
r_char : r='CHAR' {  }  ;
r_check : r='CHECK' {   }  ;
r_cluster : r='CLUSTER' {  }  ;
r_column : r='COLUMN' {  }  ;
r_comment : r='COMMENT' {  }  ;
r_compress : r='COMPRESS' {   }  ;
r_connect : r='CONNECT' {  }  ;
r_create : r='CREATE' {  }  ;
r_current : r='CURRENT' {  }  ;
r_date : r='DATE' {   }  ;
r_decimal : r='DECIMAL' {  }  ;
r_default : r='DEFAULT' {   }  ;
r_delete : r='DELETE' {  }  ;
r_desc : r='DESC' {  }  ;
r_distinct : r='DISTINCT' {   }  ;
r_drop : r='DROP' {  }  ;
r_else : r='ELSE' {   }  ;
r_exclusive : r='EXCLUSIVE' {  }  ;
r_exists : r='EXISTS' {  }  ;
r_false : r='FALSE' {   }  ; //PL/SQL
r_file : r='FILE' {   }  ;
r_float : r='FLOAT' {  }  ;
r_for : r='FOR' {   }  ;
r_from : r='FROM' {   }  ;
r_grant : r='GRANT' {   }  ;
r_group : r='GROUP' {   }  ;
r_having : r='HAVING' {   }  ;
r_identified : r='IDENTIFIED' {   }  ;
r_immediate : r='IMMEDIATE' {  }  ;
r_in : r='IN' {  }  ;
r_increment : r='INCREMENT' {  }  ;
r_index : r='INDEX' {  }  ;
r_initial : r='INITIAL' {   }  ;
r_insert : r='INSERT' {  }  ;
r_integer : r='INTEGER' {   }  ;
r_intersect : r='INTERSECT' {   }  ;
r_into : r='INTO' {   }  ;
r_is : r='IS' {   }  ;
r_level : r='LEVEL' {   }  ;
r_like : r='LIKE' {   }  ;
r_lock : r='LOCK' {   }  ;
r_long : r='LONG' {   }  ;
r_maxextents : r='MAXEXTENTS' {   }  ;
r_minus : r='MINUS' {   }  ;
r_mode : r='MODE' {   }  ;
r_modify : r='MODIFY' {   }  ;
r_noaudit : r='NOAUDIT' {   }  ;
r_nocompress : r='NOCOMPRESS' {   }  ;
r_not : r='NOT' {   }  ;
r_notfound : r='NOTFOUND' {  }  ;
r_nowait : r='NOWAIT' {   }  ;
r_null : r='NULL' {   }  ;
r_number : r='NUMBER' {   }  ;
r_of : r='OF' {   }  ;
r_offline : r='OFFLINE' {   }  ;
r_on : r='ON' {  }  ;
r_online : r='ONLINE' {   }  ;
r_option : r='OPTION' {   }  ;
r_or : r='OR' {  }  ;
r_order : r='ORDER' {   }  ;
r_pctfree : r='PCTFREE' {  }  ;
r_prior : r='PRIOR' {  }  ;
r_privileges : r='PRIVILEGES' {  }  ;
r_public : r='PUBLIC' {   }  ;
r_raw : r='RAW' {  }  ;
r_rename : r='RENAME' {  }  ;
r_resource : r='RESOURCE' {   }  ;
r_revoke : r='REVOKE' {  }  ;
r_row : r='ROW' {   }  ;
r_rowid : r='ROWID' {   }  ;
r_rowlabel : r='ROWLABEL' {  }  ;
r_rownum : r='ROWNUM' {   }  ;
r_rows : r='ROWS' {  }  ;
r_select : r='SELECT' {  }  ;
r_session : r='SESSION' {   }  ;
r_set : r='SET' {   }  ;
r_share : r='SHARE' {  }  ;
r_size : r='SIZE' {  }  ;
r_smallint : r='SMALLINT' {   }  ;
r_sqlbuf : r='SQLBUF' {   }  ;
r_start : r='START' {  }  ;
r_successful : r='SUCCESSFUL' {   }  ;
r_synonym : r='SYNONYM' {   }  ;
r_sysdate : r='SYSDATE' {   }  ;
r_table : r='TABLE' {   }  ;
r_then : r='THEN' {  }  ;
r_to : r='TO' {  }  ;
r_trigger  : r='TRIGGER' {   }  ;
r_true  : r='TRUE' {   }  ; // PL/SQL
r_uid : r='UID' {  }  ;
r_union : r='UNION' {   }  ;
r_unique : r='UNIQUE' {  }  ;
r_update : r='UPDATE' {   }  ;
r_user  : r='USER' {  }  ;
r_validate : r='VALIDATE' {   }  ;
r_values : r='VALUES' {   }  ;
r_varchar : r='VARCHAR' {   }  ;
r_varchar2 : r='VARCHAR2' {   }  ;
r_view : r='VIEW' {   }  ;
r_whenever : r='WHENEVER' {   }  ;
r_where : r='WHERE' { }  ;
r_with : r='WITH' {   }  ;

// reserved_word options { backtrack=false; }
// 	: r=( 'ACCESS'	| 'ADD'	| 'ALL'	| 'ALTER'	| 'AND'	| 'ANY'	| 'ARRAYLEN'	| 'AS'	| 'ASC'	| 'AUDIT'
// 	| 'BETWEEN'	| 'BY'
// 	| 'CASE'
// 	| 'CHAR'	| 'CHECK'	| 'CLUSTER'	| 'COLUMN'	| 'COMMENT'	| 'COMPRESS'	| 'CONNECT'	| 'CREATE'	| 'CURRENT'
// 	| 'DATE'	| 'DECIMAL'	| 'DEFAULT'	| 'DELETE'	| 'DESC'	| 'DISTINCT'	| 'DROP'
// 	| 'ELSE'	| 'EXCLUSIVE'	| 'EXISTS'
// 	| 'FILE'	| 'FLOAT'	| 'FOR'	| 'FROM'
// 	| 'GRANT'	| 'GROUP'
// 	| 'HAVING'
// 	| 'IDENTIFIED'	| 'IMMEDIATE'	| 'IN'	| 'INCREMENT'	| 'INDEX'	| 'INITIAL'	| 'INSERT'	| 'INTEGER'
// 	| 'INTERSECT'	| 'INTO'	| 'IS'
// 	| 'LEVEL'	| 'LIKE'	| 'LOCK'	| 'LONG'
// 	| 'MAXEXTENTS'	| 'MINUS'	| 'MODE'	| 'MODIFY'
// 	| 'NOAUDIT'	| 'NOCOMPRESS'	| 'NOT'	| 'NOTFOUND'	| 'NOWAIT'	| 'NULL'	| 'NUMBER'
// 	| 'OF'	| 'OFFLINE'	| 'ON'	| 'ONLINE'	| 'OPTION'	| 'OR'	| 'ORDER'
// 	| 'PCTFREE'	| 'PRIOR'	| 'PRIVILEGES'	| 'PUBLIC'
// 	| 'RAW'	| 'RENAME'	| 'RESOURCE'	| 'REVOKE'	| 'ROW'	| 'ROWID'	| 'ROWLABEL'	| 'ROWNUM'	| 'ROWS'
// 	| 'SELECT'	| 'SESSION'	| 'SET'	| 'SHARE'	| 'SIZE'	| 'SMALLINT'	| 'SQLBUF'
// 	| 'START'	| 'SUCCESSFUL'	| 'SYNONYM'	| 'SYSDATE'
// 	| 'TABLE'	| 'THEN'	| 'TO'	| 'TRIGGER'
// 	| 'UID'	| 'UNION'	| 'UNIQUE'	| 'UPDATE'	| 'USER'
// 	| 'VALIDATE'	| 'VALUES'	| 'VARCHAR'	| 'VARCHAR2'	| 'VIEW'
// 	| 'WHENEVER'	| 'WHERE'	| 'WITH'
// 	) //{   }
// 	  //{ $type = T_RESERVED; }
// 	// -> ^(T_RESERVED[$r])
// 	;

/* ================================================================================
   Oracle keywords
   can by used for name database objects such as columns, tables, or indexes.
   ================================================================================ */

//k_as : { !(LT(1)->getText(LT(1))->compare8(LT(1)->getText(LT(1)), "AS")) }? ID;
//k_as : { !(strcasecmp(LT(1)->getText(LT(1))->chars, "AS")) }? r=ID {   }  ;

// k_a  : r='A' {   }  ;
// k_admin : r='ADMIN' {   }  ;
// k_after : r='AFTER' {   }  ;
// k_allocate : r='ALLOCATE' {   }  ;
// k_analyze : r='ANALYZE' {   }  ;
// k_archive : r='ARCHIVE' {   }  ;
// k_archivelog : r='ARCHIVELOG' {   }  ;
// k_at  : r='AT' {   }  ;
// k_authorization : r='AUTHORIZATION' {   }  ;
// k_automatic : r='AUTOMATIC' {   }  ;
// k_avg	 : r='AVG' {   }  ;
// k_backup : r='BACKUP' {   }  ;
// k_become : r='BECOME' {   }  ;
// k_before : r='BEFORE' {   }  ;
// k_begin : r='BEGIN' {   }  ;
// k_bfile : r='BFILE' {   }  ;
// k_binary_double : r='BINARY_DOUBLE' {   }  ;
// k_binary_float : r='BINARY_FLOAT' {   }  ;
// k_binary_integer : r='BINARY_INTEGER' {   }  ;
// k_blob : r='BLOB' {   }  ;
// k_block : r='BLOCK' {   }  ;
// k_body	 : r='BODY' {   }  ;
// k_boolean : r='BOOLEAN' {   }  ;
// k_breadth : r='BREADTH' {   }  ;
// k_byte : r='BYTE' {   }  ;
// k_cache : r='CACHE' {   }  ;
// k_cancel : r='CANCEL' {   }  ;
// k_cascade : r='CASCADE' {   }  ;
// k_cast : r='CAST' {   }  ;
// k_change : r='CHANGE' {   }  ;
// k_character : r='CHARACTER' {   }  ;
// k_checkpoint : r='CHECKPOINT' {   }  ;
// k_clob : r='CLOB' {   }  ;
// k_close	 : r='CLOSE' {   }  ;
// k_cluster_set : r='CLUSTER_SET' {   }  ;
// k_cobol : r='COBOL' {   }  ;
// k_column_value : r='COLUMN_VALUE' {   }  ;
// k_commit : r='COMMIT' {   }  ;
// k_compile : r='COMPILE' {   }  ;
// k_connect_by_iscycle : r='CONNECT_BY_ISCYCLE' {   }  ;
// k_connect_by_isleaf : r='CONNECT_BY_ISLEAF' {   }  ;
// k_connect_by_root : r='CONNECT_BY_ROOT' {   }  ;
// k_constraint : r='CONSTRAINT' {   }  ;
// k_constraints : r='CONSTRAINTS' {   }  ;
// k_contents : r='CONTENTS' {   }  ;
// k_continue	 : r='CONTINUE' {   }  ;
// k_controlfile : r='CONTROLFILE' {   }  ;
// k_corr : r='CORR' {   }  ;
// k_count : r='COUNT' {   }  ;
// k_covar_pop : r='COVAR_POP' {   }  ;
// k_covar_samp : r='COVAR_SAMP' {   }  ;
// k_cross : r='CROSS' {   }  ;
// k_cube : r='CUBE' {   }  ;
// k_cume_dist : r='CUME_DIST' {   }  ;
// k_cursor : r='CURSOR' {   }  ;
// k_cycle	 : r='CYCLE' {   }  ;
// k_database : r='DATABASE' {   }  ;
// k_datafile : r='DATAFILE' {   }  ;
// k_day : r='DAY' {   }  ;
// k_dba : r='DBA' {   }  ;
// k_dbtimezone : r='DBTIMEZONE' {   }  ;
// k_dec : r='DEC' {   }  ;
// k_declare : r='DECLARE' {   }  ;
// k_decrement : r='DECREMENT' {   }  ;
// k_dense_rank : r='DENSE_RANK' {   }  ;
// k_depth : r='DEPTH' {   }  ;
// k_dimension : r='DIMENSION' {   }  ;
// k_disable : r='DISABLE' {   }  ;
// k_dismount : r='DISMOUNT' {   }  ;
// k_double : r='DOUBLE' {   }  ;
// k_dump	 : r='DUMP' {   }  ;
// k_each : r='EACH' {   }  ;
// k_empty : r='EMPTY' {   }  ;
// k_enable : r='ENABLE' {   }  ;
// k_end : r='END' {   }  ;
// k_equals_path : r='EQUALS_PATH' {   }  ;
// k_errors : r='ERRORS' {   }  ;
// k_escape : r='ESCAPE' {   }  ;
// k_events : r='EVENTS' {   }  ;
// k_except : r='EXCEPT' {   }  ;
// k_exceptions : r='EXCEPTIONS' {   }  ;
// k_exclude : r='EXCLUDE' {   }  ;
// k_exec : r='EXEC' {   }  ;
// k_execute	 : r='EXECUTE' {   }  ;
// k_explain : r='EXPLAIN' {   }  ;
// k_extent : r='EXTENT' {   }  ;
// k_externally	 : r='EXTERNALLY' {   }  ;
// k_fetch : r='FETCH' {   }  ;
// k_first : r='FIRST' {   }  ;
// k_first_value : r='FIRST_VALUE' {   }  ;
// k_flush : r='FLUSH' {   }  ;
// k_following : r='FOLLOWING' {   }  ;
// k_force : r='FORCE' {   }  ;
// k_foreign : r='FOREIGN' {   }  ;
// k_fortran : r='FORTRAN' {   }  ;
// k_found : r='FOUND' {   }  ;
// k_freelist : r='FREELIST' {   }  ;
// k_freelists : r='FREELISTS' {   }  ;
// k_full : r='FULL' {   }  ;
// k_function	 : r='FUNCTION' {   }  ;
// k_go : r='GO' {   }  ;
// k_goto : r='GOTO' {   }  ;
// k_grouping : r='GROUPING' {   }  ;
// k_groups : r='GROUPS' {   }  ;
// k_ignore : r='IGNORE' {   }  ;
// k_include : r='INCLUDE' {   }  ;
// k_including : r='INCLUDING' {   }  ;
// k_indicator : r='INDICATOR' {   }  ;
// k_infinite : r='INFINITE' {   }  ;
// k_initrans : r='INITRANS' {   }  ;
// k_inner : r='INNER' {   }  ;
// k_instance : r='INSTANCE' {   }  ;
// k_int	 : r='INT' {   }  ;
// k_interval : r='INTERVAL' {   }  ;
// k_iterate : r='ITERATE' {   }  ;
// k_join : r='JOIN' {   }  ;
// k_keep : r='KEEP' {   }  ;
// k_key	 : r='KEY' {   }  ;
// k_lag : r='LAG' {   }  ;
// k_language : r='LANGUAGE' {   }  ;
// k_last : r='LAST' {   }  ;
// k_last_value : r='LAST_VALUE' {   }  ;
// k_layer : r='LAYER' {   }  ;
// k_lead : r='LEAD' {   }  ;
// k_left : r='LEFT' {   }  ;
// k_limit : r='LIMIT' {   }  ;
// //k_link : r='LINK' {   }  ;
// k_like2 : r='LIKE2' {   }  ;
// k_like4 : r='LIKE4' {   }  ;
// k_likec : r='LIKEC' {   }  ;
// k_lists : r='LISTS' {   }  ;
// k_local	 : r='LOCAL' {   }  ;
// k_locked	 : r='LOCKED' {   }  ;
// k_log : r='LOG' {   }  ;
// k_logfile	 : r='LOGFILE' {   }  ;
// k_main : r='MAIN' {   }  ;
// k_manage : r='MANAGE' {   }  ;
// k_manual : r='MANUAL' {   }  ;
// k_matched : r='MATCHED' {   }  ;
// k_max : r='MAX' {   }  ;
// k_maxdatafiles : r='MAXDATAFILES' {   }  ;
// k_maxinstances : r='MAXINSTANCES' {   }  ;
// k_maxlogfiles : r='MAXLOGFILES' {   }  ;
// k_maxloghistory	 : r='MAXLOGHISTORY' {   }  ;
// k_maxlogmembers : r='MAXLOGMEMBERS' {   }  ;
// k_maxtrans : r='MAXTRANS' {   }  ;
// k_maxvalue : r='MAXVALUE' {   }  ;
// k_measures : r='MEASURES' {   }  ;
// k_member : r='MEMBER' {   }  ;
// k_merge : r='MERGE' {   }  ;
// k_min : r='MIN' {   }  ;
// k_minextents : r='MINEXTENTS' {   }  ;
// k_minvalue : r='MINVALUE' {   }  ;
// k_mivalue : r='MIVALUE' {   }  ;
// k_mlslabel : r='MLSLABEL' {   }  ;
// k_model : r='MODEL' {   }  ;
// k_module : r='MODULE' {   }  ;
// k_month	 : r='MONTH' {   }  ;
// k_mount	 : r='MOUNT' {   }  ;
// k_multiset : r='MULTISET' {   }  ;
// k_nan : r='NAN' {   }  ;
// k_national : r='NATIONAL' {   }  ;
// k_natural : r='NATURAL' {   }  ;
// k_nav : r='NAV' {   }  ;
// k_nchar : r='NCHAR' {   }  ;
// k_nclob : r='NCLOB' {   }  ;
// k_new : r='NEW' {   }  ;
// k_next : r='NEXT' {   }  ;
// k_noarchivelog : r='NOARCHIVELOG' {   }  ;
// k_nocache : r='NOCACHE' {   }  ;
// k_nocycle : r='NOCYCLE' {   }  ;
// k_nomaxvalue : r='NOMAXVALUE' {   }  ;
// k_nominvalue : r='NOMINVALUE' {   }  ;
// k_none	 : r='NONE' {   }  ;
// k_noorder : r='NOORDER' {   }  ;
// k_noresetlogs : r='NORESETLOGS' {   }  ;
// k_normal : r='NORMAL' {   }  ;
// k_nosort : r='NOSORT' {   }  ;
// k_ntile : r='NTILE' {   }  ;
// k_nulls : r='NULLS' {   }  ;
// k_numeric	 : r='NUMERIC' {   }  ;
// k_nvarchar : r='NVARCHAR' {   }  ;
// k_nvarchar2 : r='NVARCHAR2' {   }  ;
// k_object_id : r='OBJECT_ID' {   }  ;
// k_object_value : r='OBJECT_VALUE' {   }  ;
// k_off : r='OFF' {   }  ;
// k_old : r='OLD' {   }  ;
// k_only : r='ONLY' {   }  ;
// k_open : r='OPEN' {   }  ;
// k_optimal : r='OPTIMAL' {   }  ;
// k_ora_rowscn : r='ORA_ROWSCN' {   }  ;
// k_outer : r='OUTER' {   }  ;
// k_over : { !(strcasecmp(LT(1)->getText(LT(1))->chars, "OVER")) }? r=ID {   }  ;
// k_own	 : r='OWN' {   }  ;
// k_package : r='PACKAGE' {   }  ;
// k_parallel : r='PARALLEL' {   }  ;
// k_partition : r='PARTITION' {   }  ;
// k_pctincrease : r='PCTINCREASE' {   }  ;
// k_pctused : r='PCTUSED' {   }  ;
// k_percent_rank : r='PERCENT_RANK' {   }  ;
// k_percentile_cont : r='PERCENTILE_CONT' {   }  ;
// k_percentile_disc : r='PERCENTILE_DISC' {   }  ;
// k_pivot : r='PIVOT' {   }  ;
// k_plan : r='PLAN' {   }  ;
// k_pli : r='PLI' {   }  ;
// k_pls_integer : r='PLS_INTEGER' {   }  ;
// k_positive : r='POSITIVE' {   }  ;
// k_preceding : r='PRECEDING' {   }  ;
// k_precision : r='PRECISION' {   }  ;
// k_present : r='PRESENT' {   }  ;
// k_primary : r='PRIMARY' {   }  ;
// k_private : r='PRIVATE' {   }  ;
// k_procedure : r='PROCEDURE' {   }  ;
// k_profile	 : r='PROFILE' {   }  ;
// k_quota	 : r='QUOTA' {   }  ;
// k_range : r='RANGE' {   }  ;
// k_rank : r='RANK' {   }  ;
// k_ratio_to_report : r='RATIO_TO_REPORT' {   }  ;
// k_read : r='READ' {   }  ;
// k_real : r='REAL' {   }  ;
// k_recover : r='RECOVER' {   }  ;
// k_reference : r='REFERENCE' {   }  ;
// k_references : r='REFERENCES' {   }  ;
// k_referencing : r='REFERENCING' {   }  ;
// k_regexp_like : r='REGEXP_LIKE' {   }  ;
// k_regr_avgx : r='REGR_AVGX' {   }  ;
// k_regr_avgy : r='REGR_AVGY' {   }  ;
// k_regr_count : r='REGR_COUNT' {   }  ;
// k_regr_intercept : r='REGR_INTERCEPT' {   }  ;
// k_regr_r2 : r='REGR_R2' {   }  ;
// k_regr_slope : r='REGR_SLOPE' {   }  ;
// k_regr_sxx : r='REGR_SXX' {   }  ;
// k_regr_sxy : r='REGR_SXY' {   }  ;
// k_regr_syy : r='REGR_SYY' {   }  ;
// k_reject : r='REJECT' {   }  ;
// k_resetlogs : r='RESETLOGS' {   }  ;
// k_respect : r='RESPECT' {   }  ;
// k_restricted : r='RESTRICTED' {   }  ;
// k_return : r='RETURN' {   }  ;
// k_returning : r='RETURNING' {   }  ;
// k_reuse	 : r='REUSE' {   }  ;
// k_right : r='RIGHT' {   }  ;
// k_role : r='ROLE' {   }  ;
// k_roles : r='ROLES' {   }  ;
// k_rollback	 : r='ROLLBACK' {   }  ;
// k_rollup : r='ROLLUP' {   }  ;
// k_row_number : r='ROW_NUMBER' {   }  ;
// k_rules : r='RULES' {   }  ;
// k_sample : r='SAMPLE' {   }  ;
// k_savepoint : r='SAVEPOINT' {   }  ;
// k_schema : r='SCHEMA' {   }  ;
// k_scn : r='SCN' {   }  ;
// k_search : r='SEARCH' {   }  ;
// k_second : r='SECOND' {   }  ;
// k_section : r='SECTION' {   }  ;
// k_seed : r='SEED' {   }  ;
// k_segment : r='SEGMENT' {   }  ;
// k_sequence : r='SEQUENCE' {   }  ;
// k_sequential : r='SEQUENTIAL' {   }  ;
// k_sessiontimezone : r='SESSIONTIMEZONE' {   }  ;
// k_sets : r='SETS' {   }  ;
// k_shared : r='SHARED' {   }  ;
// k_siblings : r='SIBLINGS' {   }  ;
// k_single : r='SINGLE' {   }  ;
// k_skip : r='SKIP' {   }  ;
// k_snapshot	 : r='SNAPSHOT' {   }  ;
// k_some : r='SOME' {   }  ;
// k_sort : r='SORT' {   }  ;
// k_sql : r='SQL' {   }  ;
// k_sqlcode : r='SQLCODE' {   }  ;
// k_sqlerror : r='SQLERROR' {   }  ;
// k_sqlstate : r='SQLSTATE' {   }  ;
// k_statement_ID : r='STATEMENT' {   }  ;
// k_statistics : r='STATISTICS' {   }  ;
// k_stddev : r='STDDEV' {   }  ;
// k_stddev_pop : r='STDDEV_POP' {   }  ;
// k_stddev_samp : r='STDDEV_SAMP' {   }  ;
// k_stop : r='STOP' {   }  ;
// k_storage : r='STORAGE' {   }  ;
// k_submultiset : r='SUBMULTISET' {   }  ;
// k_subpartition : r='SUBPARTITION' {   }  ;
// k_sum : r='SUM' {   }  ;
// k_switch : r='SWITCH' {   }  ;
// k_system	 : r='SYSTEM' {   }  ;
// k_tables : r='TABLES' {   }  ;
// k_tablespace : r='TABLESPACE' {   }  ;
// k_temporary : r='TEMPORARY' {   }  ;
// k_the : r='THE' {   }  ;
// k_thread : r='THREAD' {   }  ;
// k_time : r='TIME' {   }  ;
// k_timestamp : r='TIMESTAMP' {   }  ;
// k_tracing : r='TRACING' {   }  ;
// k_transaction : r='TRANSACTION' {   }  ;
// k_triggers	 : r='TRIGGERS' {   }  ;
// k_truncate	 : r='TRUNCATE' {   }  ;
// k_type : r='TYPE' {   }  ;
// k_unbounded : r='UNBOUNDED' {   }  ;
// k_under : r='UNDER' {   }  ;
// k_under_path : r='UNDER_PATH' {   }  ;
// k_unlimited : r='UNLIMITED' {   }  ;
// k_unpivot : r='UNPIVOT' {   }  ;
// k_until : r='UNTIL' {   }  ;
// k_updated : r='UPDATED' {   }  ;
// k_upsert : r='UPSERT' {   }  ;
// k_urowid : r='UROWID' {   }  ;
// k_use : r='USE' {   }  ;
// k_using	 : r='USING' {   }  ;
// k_value : r= 'VALUE' {   }  ;
// k_var_pop : r='VAR_POP' {   }  ;
// k_var_samp : r='VAR_SAMP' {   }  ;
// k_variance : r='VARIANCE' {   }  ;
// k_varying : r='VARYING' {   }  ;
// k_versions : r='VERSIONS' {   }  ;
// // k_versions_endscn : r='VERSIONS_ENDSCN' {   }  ;
// // k_versions_endtime : r='VERSIONS_ENDTIME' {   }  ;
// // k_versions_operation : r='VERSIONS_OPERATION' {   }  ;
// // k_versions_starscn : r='VERSIONS_STARSCN' {   }  ;
// // k_versions_starttime : r='VERSIONS_STARTTIME' {   }  ;
// // k_versions_xid : r='VERSIONS_XID' {   }  ;
// k_wait : r='WAIT' {   }  ;
// k_when : r='WHEN' {   }  ;
// k_work : r='WORK' {   }  ;
// k_write	 : r='WRITE' {   }  ;
// k_xml : r='XML' {   }  ;
// k_xmldata : r='XMLDATA' {   }  ;
// k_year : { !(strcasecmp(LT(1)->getText(LT(1))->chars, "YEAR")) }? r=ID {   }  ;
// k_zone	 : r='ZONE' {   }  ;

//k_a : r='A' {   }  ;
//k_a : { !(LT(1)->getText(LT(1))->compare8(LT(1)->getText(LT(1)), "AS")) }? ID;
k_a	:  r=ID {   }  ;

k_at                    : r='AT' {   }  ;
//k_at                  : { !(strcasecmp((const char*)LT(1)->getText(LT(1))->chars, "AT")) }? r=ID {   }  ;
k_automatic             :  r=ID {   }  ;
//k_avg                 :  r=ID {   }  ;
k_bfile                 :  r=ID {   }  ;
k_binary_double         :  r=ID {   }  ;
k_binary_float          :  r=ID {   }  ;
k_binary_integer        :  r=ID {   }  ;
k_blob                  :  r=ID {   }  ;
k_block                 :  r=ID {   }  ;
k_boolean               :  r=ID {   }  ;
k_both                  :  r=ID {   }  ;
k_breadth               :  r=ID {   }  ;
k_byte                  :  r=ID {   }  ;
k_cast                  : r='CAST' {   }  ;
//k_cast                :  r=ID {   }  ;
k_character             :  r=ID {   }  ;
k_clob                  :  r=ID {   }  ;
k_cluster_set           : r='CLUSTER_SET' {   }  ;
//k_cluster_set         :  r=ID {   }  ;
//k_column_value        :  r=ID {   }  ;
//k_connect_by_iscycle  :  r=ID {   }  ;
//k_connect_by_isleaf   :  r=ID {   }  ;
k_connect_by_root       : r='CONNECT_BY_ROOT' {   }  ;
//k_connect_by_root     :  r=ID {   }  ;
k_constraint            :  r=ID {   }  ;
//k_corr                :  r=ID {   }  ;
k_count                 : r='COUNT' {   }  ;
//k_count               :  r=ID {   }  ;
//k_covar_pop           :  r=ID {   }  ;
//k_covar_samp          :  r=ID {   }  ;
k_cross                 :  r=ID {   }  ;
k_cube                  : r='CUBE' {   }  ;
//k_cube                :  r=ID {   }  ;
//k_cume_dist           :  r=ID {   }  ;
k_cursor                : r='CURSOR' {   }  ;
//k_cursor              :  r=ID {   }  ;
k_cycle                 : r='CYCLE' {   }  ;
//k_cycle               :  r=ID {   }  ;
k_day                   :  r=ID {   }  ;
k_dbtimezone            :  r=ID {   }  ;
k_dec                   :  r=ID {   }  ;
k_decrement             :  r=ID {   }  ;
k_dense_rank            :  r=ID {   }  ;
k_depth                 :  r=ID {   }  ;
k_dimension             : r='DIMENSION' {   }  ;
//k_dimension           :  r=ID {   }  ;
k_double                :  r=ID {   }  ;
k_empty                 :  r=ID {   }  ;
k_end                   : r='END' {   }  ;
//k_end                 :  r=ID {   }  ;
k_equals_path           :  r=ID {  }  ;
k_errors                :  r=ID {   }  ;
k_escape                : r='ESCAPE' {   }  ;
//k_escape              :  r=ID {   }  ;
k_exclude               :  r=ID {   }  ;
k_extract               : r='EXTRACT' {   }  ;
//k_extract             :  r=ID {   }  ;
k_first                 : r='FIRST' {   }  ;
//k_first :  r=ID {   }  ;
//k_first_value :  r=ID {   }  ;
k_following : r='FOLLOWING' {   }  ;
//k_following :  r=ID {   }  ;
k_full : r='FULL' {   }  ;
//k_full :  r=ID {   }  ;
k_grouping : r='GROUPING' {   }  ;
//k_grouping :  r=ID {   }  ;
k_hour :  r=ID {   }  ;
k_ignore : r='IGNORE' {   }  ;
//k_ignore :  r=ID {   }  ;
k_include :  r=ID {   }  ;
k_infinite : r='INFINITE' {   }  ;
//k_infinite :  r=ID {   }  ;
k_inner :  r=ID {   }  ;
k_int :  r=ID {   }  ;
k_interval : r='INTERVAL' {   }  ;
//k_interval :  r=ID {   }  ;
k_iterate :  r=ID {   }  ;
k_join : r='JOIN' {   }  ;
//k_join :  r=ID {   }  ;
k_keep :  r=ID {   }  ;
//k_lag :  r=ID {   }  ;
k_last : r='LAST' {   }  ;
//k_last :  r=ID {   }  ;
//k_last_value :  r=ID {   }  ;
//k_lead :  r=ID {   }  ;
k_leading :  r=ID {   }  ;
k_left : r='LEFT' {   }  ;
//k_left :  r=ID {   }  ;
k_like2 : r='LIKE2' {   }  ;
//k_like2 :  r=ID {   }  ;
k_like4 : r='LIKE4' {  }  ;
//k_like4 :  r=ID {   }  ;
k_likec : r='LIKEC' {   }  ;
//k_likec :  r=ID {   }  ;
k_limit                 :  r=ID {   }  ;
k_listagg               :  r=ID {   }  ;
k_lnnvl                 :  r=ID {   }  ;
k_local                 :  r=ID {   }  ;
k_locked                :  r=ID {   }  ;
k_log                   :  r=ID {   }  ;
k_main                  : r='MAIN' {   }  ;
//k_main                :  r=ID {   }  ;
k_matched               :  r=ID {   }  ;
//k_max                 : r='MAX' {   }  ;
//k_max                 :  r=ID {   }  ;
k_maxvalue              :  r=ID {   }  ;
k_measures              :  r=ID {   }  ;
k_member                : r='MEMBER' {   }  ;
//k_member              :  r=ID {   }  ;
k_merge                 :  r=ID {   }  ;
//k_min                 :  r=ID {   }  ;
k_minute                :  r=ID {   }  ;
k_mivalue               :  r=ID {   }  ;
k_mlslabel              :  r=ID {   }  ;
k_model :  r='MODEL' {   }  ;
// i_model : {
//     (strcasecmp((const char*)LT(2)->getText(LT(2))->chars, "MAIN")) &&
//     (strcasecmp((const char*)LT(2)->getText(LT(2))->chars, "PARTITION")) &&
//     (strcasecmp((const char*)LT(2)->getText(LT(2))->chars, "DIMENSION"))
//    }? r='MODEL' {   }  ;
//k_model : r='MODEL' {   }  ;
//k_model :  r=ID {   }  ;
k_month :  r=ID {   }  ;
k_multiset : r='MULTISET' {   }  ;
//k_multiset :  r=ID {   }  ;
k_nan : r='NAN' {   }  ;
//k_nan :  r=ID {   }  ;
k_national :  r=ID {   }  ;
k_natural :  r=ID {   }  ;
k_nav : r='NAV' {   }  ;
//k_nav :  r=ID {   }  ;
k_nchar :  r=ID {   }  ;
k_nclob :  r=ID {   }  ;
k_nocycle :  r=ID {   }  ;
//k_ntile :  r=ID {   }  ;
k_nulls : r='NULLS' {   }  ;
//k_nulls :  r=ID {   }  ;
k_numeric :  r=ID {   }  ;
k_nvarchar :  r=ID {   }  ;
k_nvarchar2 :  r=ID {   }  ;
//k_object_id :  r=ID {   }  ;
//k_object_value :  r=ID {   }  ;
k_only :  r=ID {   }  ;
//k_ora_rowscn :  r=ID {   }  ;
k_outer : r='OUTER' {   }  ;
//k_outer :  r=ID {   }  ;
//k_over : r=ID {   }  ;
k_over :  r=ID {   }  ;
k_partition : r='PARTITION' {   }  ;
//k_partition :  r=ID {   }  ;
k_percent_rank :  r=ID {   }  ;
k_percentile_cont :  r=ID {   }  ;
k_percentile_disc :  r=ID {   }  ;
k_pivot : r='PIVOT' {   }  ;
//k_pivot :  r=ID {   }  ;
k_pls_integer :  r=ID {   }  ;
k_positive :  r=ID {   }  ;
k_preceding : r='PRECEDING' {   }  ;
//k_preceding :  r=ID {   }  ;
k_precision :  r=ID {   }  ;
k_present :  r=ID {   }  ;
k_range : r='RANGE' {   }  ;
//k_range :  r=ID {   }  ;
//k_rank :  r=ID {   }  ;
//k_ratio_to_report :  r=ID {   }  ;
k_read :  r=ID {   }  ;
k_real :  r=ID {   }  ;
k_reference : r='REFERENCE' {   }  ;
//k_reference :  r=ID {   }  ;
k_regexp_like :  r=ID {   }  ;
//k_regr_avgx :  r=ID {   }  ;
//k_regr_avgy :  r=ID {   }  ;
//k_regr_count :  r=ID {   }  ;
//k_regr_intercept :  r=ID {   }  ;
//k_regr_r2 :  r=ID {   }  ;
//k_regr_slope :  r=ID {   }  ;
//k_regr_sxx :  r=ID {   }  ;
//k_regr_sxy :  r=ID {   }  ;
//k_regr_syy :  r=ID {   }  ;
k_reject :  r=ID {   }  ;
k_respect : r='RESPECT' {   }  ;
//k_respect :  r=ID {   }  ;
k_return : r='RETURN' {   }  ;
//k_return :  r=ID {   }  ;
k_returning : r='RETURNING' {   }  ;
//k_returning :  r=ID {   }  ;
k_right : r='RIGHT' {   }  ;
//k_right :  r=ID {   }  ;
k_rollup : r='ROLLUP' {   }  ;
//k_rollup :  r=ID {   }  ;
//k_row_number :  r=ID {   }  ;
k_rules :  r=ID {   }  ;
k_sample :  r=ID {   }  ;
k_scn :  r=ID {   }  ;
k_search : r='SEARCH' {   }  ;
//k_search :  r=ID {   }  ;
k_second :  r=ID {   }  ;
k_seed :  r=ID {   }  ;
k_sequential :  r=ID {   }  ;
k_sessiontimezone :  r=ID {   }  ;
k_sets : r='SETS' {   }  ;
//k_sets :  r=ID {   }  ;
k_siblings :  r=ID {   }  ;
k_single :  r=ID {   }  ;
k_skip :  r=ID {   }  ;
k_some : r='SOME' {   }  ;
//k_some :  r=ID {   }  ;
k_sql : r='SQL' {   }  ;
//k_sql :  r=ID {   }  ;
//k_stddev :  r=ID {   }  ;
//k_stddev_pop :  r=ID {   }  ;
//k_stddev_samp :  r=ID {   }  ;
k_submultiset : r='SUBMULTISET' {   }  ;
//k_submultiset :  r=ID {   }  ;
k_subpartition :  r=ID {   }  ;
//k_sum :  r=ID {   }  ;
k_the : r='THE' {   }  ;
//k_the :  r=ID {   }  ;
k_time :  r=ID {   }  ;
k_timestamp : r='TIMESTAMP' {   }  ;
//k_timestamp :  r=ID {   }  ;
k_timezone_hour :  r=ID {   }  ;
k_timezone_minute :  r=ID {   }  ;
k_timezone_region :  r=ID {   }  ;
k_timezone_abbr :  r=ID {   }  ;
k_to                    : r='TO' {   }  ;
//k_to                  :  r=ID {   }  ;
k_trailing              :  r=ID {   }  ;
k_trim                  :  r=ID {   }  ;
//k_type                : r='TYPE' {   }  ;
k_type                  :  r=ID {   }  ;
k_unbounded             : r='UNBOUNDED' {   }  ;
//k_unbounded           :  r=ID {   }  ;
k_under_path            :  r=ID {   }  ;
k_unlimited             :  r=ID {   }  ;
k_unpivot               : r='UNPIVOT' {   }  ;
//k_unpivot             :  r=ID {   }  ;
k_until                 :  r=ID {   }  ;
k_updated               :  r=ID {   }  ;
k_upsert                :  r=ID {   }  ;
k_urowid                :  r=ID {   }  ;
k_using                 : r='USING' {   }  ;
//k_using               :  r=ID {   }  ;
k_value                 :  r=ID {   }  ;
//k_var_pop             :  r=ID {   }  ;
//k_var_samp            :  r=ID {   }  ;
//k_variance            :  r=ID {   }  ;
k_varying               :  r=ID {   }  ;
k_versions              : r='VERSIONS' {   }  ;
//k_versions            :  r=ID {   }  ;
// k_versions_endscn    : r='VERSIONS_ENDSCN' {   }  ;
// k_versions_endtime   : r='VERSIONS_ENDTIME' {   }  ;
// k_versions_operation : r='VERSIONS_OPERATION' {   }  ;
// k_versions_starscn   : r='VERSIONS_STARSCN' {   }  ;
// k_versions_starttime : r='VERSIONS_STARTTIME' {   }  ;
// k_versions_xid       : r='VERSIONS_XID' {   }  ;
k_wait                  :  r=ID {   }  ;
k_when                  : r='WHEN' {   }  ;
//k_when                :  r=ID {   }  ;
k_within                :  r=ID {   }  ;
k_xml                   :  r=ID {   }  ;
//k_xmldata             :  r=ID {   }  ;
k_year                  :  r=ID {   }  ;
k_zone                  :  r=ID {   }  ;

keyword[int identifierClass, int usageType]
:	k=(
		//'A'	// note: this one is not listed in the docs but is a part of "IS A SET" condition clause
		'AT'
//         | 'AUTOMATIC'
//         | 'AVG'
//         | 'BFILE'
//         | 'BINARY_DOUBLE'
//         | 'BINARY_FLOAT'
//         | 'BINARY_INTEGER'
//         | 'BLOB'
//         | 'BLOCK'
//         | 'BOOLEAN'
//         | 'BREADTH'
//         | 'BYTE'
//         | 'CAST'
// NOTE!!! CASE is reserved word in Oracle but still can be used as identifier
         | 'CASE'
//         | 'CHARACTER'
//         | 'CLOB'
//         | 'CLUSTER_SET'
//         | 'COLUMN_VALUE'
//         | 'CONNECT_BY_ISCYCLE'
//         | 'CONNECT_BY_ISLEAF'
//         | 'CONNECT_BY_ROOT'
//         | 'CONSTRAINT'
//         | 'CORR'
         | 'COUNT'
//         | 'COVAR_POP'
//         | 'COVAR_SAMP'
//         | 'CROSS'
         | 'CUBE'
//         | 'CUME_DIST'
//             //| 'CURSOR'
         | 'CYCLE'
//         | 'DAY'
//         | 'DBTIMEZONE'
//         | 'DEC'
//         | 'DECREMENT'
//             //| 'DENSE_RANK'
//         | 'DEPTH'
//         | 'DIMENSION'
//         | 'DOUBLE'
//         | 'EMPTY'
//         | 'END'
//         | 'EQUALS_PATH'
//         | 'ERRORS'
         | 'ESCAPE'
//         | 'EXCLUDE'
           | 'EXTRACT'
        | 'FIRST'
//         | 'FIRST_VALUE'
//         | 'FOLLOWING'
//             //| 'FULL'
         | 'GROUPING'
//         | 'IGNORE'
//         | 'INCLUDE'
         | 'INFINITE'
//         | 'INNER'
//         | 'INT'
         | 'INTERVAL'
//         | 'ITERATE'
//             //| 'JOIN'
//         | 'KEEP'
//         | 'LAG'
         | 'LAST'
//         | 'LAST_VALUE'
//         | 'LEAD'
//             //| 'LEFT'
         | 'LIKE2'
         | 'LIKE4'
         | 'LIKEC'
//         | 'LIMIT'
//         | 'LISTAGG'
//         | 'LOCAL'
//         | 'LOCKED'
//         | 'LOG'
//         | 'MAIN'
//         | 'MATCHED'
//         | 'MAX'
//         | 'MAXVALUE'
//         | 'MEASURES'
         | 'MEMBER'
//         | 'MERGE'
//         | 'MIN'
//         | 'MIVALUE'
//         | 'MLSLABEL'
//           //| 'MODEL'
//        | i_model
//         | 'MONTH'
//             //| 'MULTISET'
         | 'NAN'
//         | 'NATIONAL'
//         | 'NATURAL'
//         | 'NAV'
//         | 'NCHAR'
//         | 'NCLOB'
//         | 'NOCYCLE'
//         | 'NTILE'
         | 'NULLS'
//         | 'NUMERIC'
//         | 'NVARCHAR'
//         | 'NVARCHAR2'
//         | 'OBJECT_ID'
//         | 'OBJECT_VALUE'
//         | 'ONLY'
//         | 'ORA_ROWSCN'
             | 'OUTER'
//         | 'OVER'
//             //| 'PARTITION'
//             //| 'PERCENT_RANK'
//             //| 'PERCENTILE_CONT'
//             //| 'PERCENTILE_DISC'
         | 'PIVOT'
//         | 'PLS_INTEGER'
//         | 'POSITIVE'
//         | 'PRECEDING'
//         | 'PRECISION'
//         | 'PRESENT'
//         | 'RANGE'
//         | 'RANK'
//         | 'RATIO_TO_REPORT'
//         | 'READ'
//         | 'REAL'
         | 'REFERENCE'
//         | 'REGEXP_LIKE'
//         | 'REGR_AVGX'
//         | 'REGR_AVGY'
//         | 'REGR_COUNT'
//         | 'REGR_INTERCEPT'
//         | 'REGR_R2'
//         | 'REGR_SLOPE'
//         | 'REGR_SXX'
//         | 'REGR_SXY'
//         | 'REGR_SYY'
//         | 'REJECT'
//         | 'RESPECT'
         | 'RETURN'
//         | 'RETURNING'
//             //| 'RIGHT'
         | 'ROLLUP'
//         | 'ROW_NUMBER'
//         | 'RULES'
//         | 'SAMPLE'
//         | 'SCN'
         | 'SEARCH'
//         | 'SECOND'
//         | 'SEED'
//         | 'SEQUENTIAL'
//         | 'SESSIONTIMEZONE'
//         | 'SETS'
//         | 'SIBLINGS'
//         | 'SINGLE'
//         | 'SKIP'
//         | 'SOME'
         | 'SQL'
//         | 'STDDEV'
//         | 'STDDEV_POP'
//         | 'STDDEV_SAMP'
//         | 'SUBMULTISET'
//         | 'SUBPARTITION'
//         | 'SUM'
//         | 'THE'
//         | 'TIME'
         | 'TIMESTAMP'
//         | 'TO'
//         | 'TYPE'
//         | 'UNBOUNDED'
//         | 'UNDER_PATH'
//         | 'UNLIMITED'
         | 'UNPIVOT'
//         | 'UNTIL'
//         | 'UPDATED'
//         | 'UPSERT'
//         | 'UROWID'
//             //| 'USING'
//         | 'VALUE'
//         | 'VAR_POP'
//         | 'VAR_SAMP'
//         | 'VARIANCE'
//         | 'VARYING'
//         | 'VERSIONS'
//             // | 'VERSIONS_ENDSCN'
//             // | 'VERSIONS_ENDTIME'
//             // | 'VERSIONS_OPERATION'
//             // | 'VERSIONS_STARSCN'
//             // | 'VERSIONS_STARTTIME'
//             // | 'VERSIONS_XID'
//         | 'WAIT'
		| 'WHEN'
//         | 'WITHIN'
//         | 'XML'
//         | 'XMLDATA'
//         | 'YEAR'
//         | 'ZONE'
		) {  }
	;

quoted_string
	:	QUOTED_STRING | QSTRING
	;

QUOTED_STRING
	:	( 'n'|'N' )? '\'' ( '\'\'' | ~('\'') )* '\''
	;

/* Perl-style quoted string */
QSTRING             : ('q'|'Q') ( QS_ANGLE | QS_BRACE | QS_BRACK | QS_PAREN | QS_OTHER) ;
fragment QS_ANGLE   : QUOTE '<' .*? '>' QUOTE ;
fragment QS_BRACE   : QUOTE '{' .*? '}' QUOTE ;
fragment QS_BRACK   : QUOTE '[' .*? ']' QUOTE ;
fragment QS_PAREN   : QUOTE '(' .*? ')' QUOTE ;

fragment QS_OTHER_CH: ~('<'|'{'|'['|'('|' '|'\t'|'\n'|'\r');
fragment QS_OTHER
		//@declarations {
    //		ANTLR3_UINT32 (*oldLA)(struct ANTLR3_INT_STREAM_struct *, ANTLR3_INT32);
		//}
		//@init {

		//	oldLA = INPUT->istream->_LA;
    //        INPUT->setUcaseLA(INPUT, ANTLR3_FALSE);
		//}
		:
		QUOTE QS_OTHER_CH
/* JAVA Syntax */
 		//(   . )*
 		(   . ) QUOTE
/* C Syntax */
	//	( { LA(1) != QS_OTHER_CH->getText(delimiter)->chars[0] || LA(2) != '\'' }?  . )*
	//	( { LA(1) == QS_OTHER_CH->getText(delimiter)->chars[0] && LA(2) == '\'' }?  . ) QUOTE
 	//	{ INPUT->istream->_LA = oldLA; }
		;

BINDVAR /*options { testLiterals=true; }*/
    :	COLON 'A' .. 'Z' ( 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | COLON )*
    |	COLON DOUBLEQUOTED_STRING
    |	COLON NUM
    ;

ID /*options { testLiterals=true; }*/
    :	'A' .. 'Z' ( 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*
    |	DOUBLEQUOTED_STRING
    ;
SEMI
	:	';'
	;
COLON
	:	':'
	;
DOUBLEDOT
	:	POINT POINT
	;
DOT
	:	POINT
	;
fragment
POINT
	:	'.'
	;
COMMA
	:	','
	;
ASTERISK
	:	'*'
	;
AT_SIGN
	:	'@'
	;
RPAREN
	:	')'
	;
LPAREN
	:	'('
	;
RBRACK
	:	']'
	;
LBRACK
	:	'['
	;
PLUS
	:	'+'
	;
MINUS
	:	'-'
	;
DIVIDE
	:	'/'
	;
EQ
	:	'='
	;
PERCENTAGE
	:	'%'
	;
LLABEL
	:	'<<'
	;
RLABEL
	:	'>>'
	;
ASSIGN
	:	':='
	;
ARROW
	:	'=>'
	;
VERTBAR
	:	'|'
	;
doublevertbar
	:	DOUBLEVERTBAR
    |	VERTBAR VERTBAR
    ;
DOUBLEVERTBAR
	:	'||'
	;
not_equal
	:	NOT_EQ
    |	LTH GTH
    |	'!' EQ
    |	'^' EQ
    ;
NOT_EQ
	:	'<>' | '!=' | '^=' | '~='
	;
LTH
	:	'<'
	;
leq
	:	LEQ
    |	LTH EQ
    ;
LEQ
	:	'<='
	;
GTH
	:	'>'
	;
geq
	: GEQ
    | GTH EQ
    ;
GEQ
	:	'>='
	;
NUMBER
	:	//( PLUS | MINUS )?
		( NUM POINT NUM
		|	POINT NUM
		|	NUM
		)
		( 'E' ( PLUS | MINUS )? NUM )?
		( 'D' | 'F')?
    ;
fragment
NUM
	: '0' .. '9' ( '0' .. '9' )*
	;
QUOTE
	:	'\''
	;
fragment
DOUBLEQUOTED_STRING
	:	'"' ( ~('"') )* '"'
	;
WS	:	(' '|'\r'|'\t'|'\n') -> channel(HIDDEN)
	;
SL_COMMENT
	:	'--' ~('\n'|'\r')* '\r'? '\n' -> channel(HIDDEN)
	;
ML_COMMENT
	:	'/*' .*? '*/' -> channel(HIDDEN)
	;
TYPE_ATTR
	:	'%TYPE'
	;
ROWTYPE_ATTR
	:	'%ROWTYPE'
	;
NOTFOUND_ATTR
	:	'%NOTFOUND'
	;
FOUND_ATTR
	:	'%FOUND'
	;
ISOPEN_ATTR
	:	'%ISOPEN'
	;
ROWCOUNT_ATTR
	:	'%ROWCOUNT'
	;
BULK_ROWCOUNT_ATTR
	:	'%BULK_ROWCOUNT'
	;
CHARSET_ATTR
	:	'%CHARSET'
	;


ZV	:	'@!' -> channel(HIDDEN)
	;
