// Generated from OracleSQL.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OracleSQLParser}.
 */
public interface OracleSQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#start_rule}.
	 * @param ctx the parse tree
	 */
	void enterStart_rule(OracleSQLParser.Start_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#start_rule}.
	 * @param ctx the parse tree
	 */
	void exitStart_rule(OracleSQLParser.Start_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement(OracleSQLParser.Delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement(OracleSQLParser.Delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void enterMerge_statement(OracleSQLParser.Merge_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void exitMerge_statement(OracleSQLParser.Merge_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#merge_update_clause}.
	 * @param ctx the parse tree
	 */
	void enterMerge_update_clause(OracleSQLParser.Merge_update_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#merge_update_clause}.
	 * @param ctx the parse tree
	 */
	void exitMerge_update_clause(OracleSQLParser.Merge_update_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#merge_insert_clause}.
	 * @param ctx the parse tree
	 */
	void enterMerge_insert_clause(OracleSQLParser.Merge_insert_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#merge_insert_clause}.
	 * @param ctx the parse tree
	 */
	void exitMerge_insert_clause(OracleSQLParser.Merge_insert_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement(OracleSQLParser.Insert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement(OracleSQLParser.Insert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#single_table_insert}.
	 * @param ctx the parse tree
	 */
	void enterSingle_table_insert(OracleSQLParser.Single_table_insertContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#single_table_insert}.
	 * @param ctx the parse tree
	 */
	void exitSingle_table_insert(OracleSQLParser.Single_table_insertContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#insert_into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInsert_into_clause(OracleSQLParser.Insert_into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#insert_into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInsert_into_clause(OracleSQLParser.Insert_into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#values_clause}.
	 * @param ctx the parse tree
	 */
	void enterValues_clause(OracleSQLParser.Values_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#values_clause}.
	 * @param ctx the parse tree
	 */
	void exitValues_clause(OracleSQLParser.Values_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#returning_clause}.
	 * @param ctx the parse tree
	 */
	void enterReturning_clause(OracleSQLParser.Returning_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#returning_clause}.
	 * @param ctx the parse tree
	 */
	void exitReturning_clause(OracleSQLParser.Returning_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#multi_table_insert}.
	 * @param ctx the parse tree
	 */
	void enterMulti_table_insert(OracleSQLParser.Multi_table_insertContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#multi_table_insert}.
	 * @param ctx the parse tree
	 */
	void exitMulti_table_insert(OracleSQLParser.Multi_table_insertContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#conditional_insert_clause}.
	 * @param ctx the parse tree
	 */
	void enterConditional_insert_clause(OracleSQLParser.Conditional_insert_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#conditional_insert_clause}.
	 * @param ctx the parse tree
	 */
	void exitConditional_insert_clause(OracleSQLParser.Conditional_insert_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#dml_table_expression_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_table_expression_clause(OracleSQLParser.Dml_table_expression_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#dml_table_expression_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_table_expression_clause(OracleSQLParser.Dml_table_expression_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#error_logging_clause}.
	 * @param ctx the parse tree
	 */
	void enterError_logging_clause(OracleSQLParser.Error_logging_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#error_logging_clause}.
	 * @param ctx the parse tree
	 */
	void exitError_logging_clause(OracleSQLParser.Error_logging_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#data_item}.
	 * @param ctx the parse tree
	 */
	void enterData_item(OracleSQLParser.Data_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#data_item}.
	 * @param ctx the parse tree
	 */
	void exitData_item(OracleSQLParser.Data_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement(OracleSQLParser.Update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement(OracleSQLParser.Update_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#update_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_set_clause(OracleSQLParser.Update_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#update_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_set_clause(OracleSQLParser.Update_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#update_set_clause_part1}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_set_clause_part1(OracleSQLParser.Update_set_clause_part1Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#update_set_clause_part1}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_set_clause_part1(OracleSQLParser.Update_set_clause_part1Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#update_set_clause_part2}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_set_clause_part2(OracleSQLParser.Update_set_clause_part2Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#update_set_clause_part2}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_set_clause_part2(OracleSQLParser.Update_set_clause_part2Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(OracleSQLParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(OracleSQLParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#subquery_factoring_clause}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_factoring_clause(OracleSQLParser.Subquery_factoring_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#subquery_factoring_clause}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_factoring_clause(OracleSQLParser.Subquery_factoring_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#subquery_factoring_clause_part_first}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_factoring_clause_part_first(OracleSQLParser.Subquery_factoring_clause_part_firstContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#subquery_factoring_clause_part_first}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_factoring_clause_part_first(OracleSQLParser.Subquery_factoring_clause_part_firstContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#subquery_factoring_clause_part_next}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_factoring_clause_part_next(OracleSQLParser.Subquery_factoring_clause_part_nextContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#subquery_factoring_clause_part_next}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_factoring_clause_part_next(OracleSQLParser.Subquery_factoring_clause_part_nextContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#search_clause}.
	 * @param ctx the parse tree
	 */
	void enterSearch_clause(OracleSQLParser.Search_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#search_clause}.
	 * @param ctx the parse tree
	 */
	void exitSearch_clause(OracleSQLParser.Search_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#cycle_clause}.
	 * @param ctx the parse tree
	 */
	void enterCycle_clause(OracleSQLParser.Cycle_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#cycle_clause}.
	 * @param ctx the parse tree
	 */
	void exitCycle_clause(OracleSQLParser.Cycle_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(OracleSQLParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(OracleSQLParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#displayed_column_part_first}.
	 * @param ctx the parse tree
	 */
	void enterDisplayed_column_part_first(OracleSQLParser.Displayed_column_part_firstContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#displayed_column_part_first}.
	 * @param ctx the parse tree
	 */
	void exitDisplayed_column_part_first(OracleSQLParser.Displayed_column_part_firstContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#displayed_column_part_next}.
	 * @param ctx the parse tree
	 */
	void enterDisplayed_column_part_next(OracleSQLParser.Displayed_column_part_nextContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#displayed_column_part_next}.
	 * @param ctx the parse tree
	 */
	void exitDisplayed_column_part_next(OracleSQLParser.Displayed_column_part_nextContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#displayed_column}.
	 * @param ctx the parse tree
	 */
	void enterDisplayed_column(OracleSQLParser.Displayed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#displayed_column}.
	 * @param ctx the parse tree
	 */
	void exitDisplayed_column(OracleSQLParser.Displayed_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#sql_expression}.
	 * @param ctx the parse tree
	 */
	void enterSql_expression(OracleSQLParser.Sql_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#sql_expression}.
	 * @param ctx the parse tree
	 */
	void exitSql_expression(OracleSQLParser.Sql_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#expr_add}.
	 * @param ctx the parse tree
	 */
	void enterExpr_add(OracleSQLParser.Expr_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#expr_add}.
	 * @param ctx the parse tree
	 */
	void exitExpr_add(OracleSQLParser.Expr_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#expr_mul}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mul(OracleSQLParser.Expr_mulContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#expr_mul}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mul(OracleSQLParser.Expr_mulContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#expr_sign}.
	 * @param ctx the parse tree
	 */
	void enterExpr_sign(OracleSQLParser.Expr_signContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#expr_sign}.
	 * @param ctx the parse tree
	 */
	void exitExpr_sign(OracleSQLParser.Expr_signContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#expr_expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_expr(OracleSQLParser.Expr_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#expr_expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_expr(OracleSQLParser.Expr_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#expr_paren}.
	 * @param ctx the parse tree
	 */
	void enterExpr_paren(OracleSQLParser.Expr_parenContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#expr_paren}.
	 * @param ctx the parse tree
	 */
	void exitExpr_paren(OracleSQLParser.Expr_parenContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#nested_expression}.
	 * @param ctx the parse tree
	 */
	void enterNested_expression(OracleSQLParser.Nested_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#nested_expression}.
	 * @param ctx the parse tree
	 */
	void exitNested_expression(OracleSQLParser.Nested_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#function_expression}.
	 * @param ctx the parse tree
	 */
	void enterFunction_expression(OracleSQLParser.Function_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#function_expression}.
	 * @param ctx the parse tree
	 */
	void exitFunction_expression(OracleSQLParser.Function_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#call_parameters}.
	 * @param ctx the parse tree
	 */
	void enterCall_parameters(OracleSQLParser.Call_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#call_parameters}.
	 * @param ctx the parse tree
	 */
	void exitCall_parameters(OracleSQLParser.Call_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#call_parameter}.
	 * @param ctx the parse tree
	 */
	void enterCall_parameter(OracleSQLParser.Call_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#call_parameter}.
	 * @param ctx the parse tree
	 */
	void exitCall_parameter(OracleSQLParser.Call_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterParameter_name(OracleSQLParser.Parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitParameter_name(OracleSQLParser.Parameter_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#special_function}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_function(OracleSQLParser.Special_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#special_function}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_function(OracleSQLParser.Special_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void enterCase_expression(OracleSQLParser.Case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void exitCase_expression(OracleSQLParser.Case_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#cursor_expression}.
	 * @param ctx the parse tree
	 */
	void enterCursor_expression(OracleSQLParser.Cursor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#cursor_expression}.
	 * @param ctx the parse tree
	 */
	void exitCursor_expression(OracleSQLParser.Cursor_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#simple_case_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_case_expression(OracleSQLParser.Simple_case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#simple_case_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_case_expression(OracleSQLParser.Simple_case_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#searched_case_expression}.
	 * @param ctx the parse tree
	 */
	void enterSearched_case_expression(OracleSQLParser.Searched_case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#searched_case_expression}.
	 * @param ctx the parse tree
	 */
	void exitSearched_case_expression(OracleSQLParser.Searched_case_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#else_case_expression}.
	 * @param ctx the parse tree
	 */
	void enterElse_case_expression(OracleSQLParser.Else_case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#else_case_expression}.
	 * @param ctx the parse tree
	 */
	void exitElse_case_expression(OracleSQLParser.Else_case_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#object_access_expression}.
	 * @param ctx the parse tree
	 */
	void enterObject_access_expression(OracleSQLParser.Object_access_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#object_access_expression}.
	 * @param ctx the parse tree
	 */
	void exitObject_access_expression(OracleSQLParser.Object_access_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expression(OracleSQLParser.Simple_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expression(OracleSQLParser.Simple_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#query_block}.
	 * @param ctx the parse tree
	 */
	void enterQuery_block(OracleSQLParser.Query_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#query_block}.
	 * @param ctx the parse tree
	 */
	void exitQuery_block(OracleSQLParser.Query_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(OracleSQLParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(OracleSQLParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#timestamp_expression}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp_expression(OracleSQLParser.Timestamp_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#timestamp_expression}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp_expression(OracleSQLParser.Timestamp_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#interval_x_to_y}.
	 * @param ctx the parse tree
	 */
	void enterInterval_x_to_y(OracleSQLParser.Interval_x_to_yContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#interval_x_to_y}.
	 * @param ctx the parse tree
	 */
	void exitInterval_x_to_y(OracleSQLParser.Interval_x_to_yContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#precision}.
	 * @param ctx the parse tree
	 */
	void enterPrecision(OracleSQLParser.PrecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#precision}.
	 * @param ctx the parse tree
	 */
	void exitPrecision(OracleSQLParser.PrecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#extract_datetime_expression}.
	 * @param ctx the parse tree
	 */
	void enterExtract_datetime_expression(OracleSQLParser.Extract_datetime_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#extract_datetime_expression}.
	 * @param ctx the parse tree
	 */
	void exitExtract_datetime_expression(OracleSQLParser.Extract_datetime_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#datetime_expression}.
	 * @param ctx the parse tree
	 */
	void enterDatetime_expression(OracleSQLParser.Datetime_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#datetime_expression}.
	 * @param ctx the parse tree
	 */
	void exitDatetime_expression(OracleSQLParser.Datetime_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#interval_expression}.
	 * @param ctx the parse tree
	 */
	void enterInterval_expression(OracleSQLParser.Interval_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#interval_expression}.
	 * @param ctx the parse tree
	 */
	void exitInterval_expression(OracleSQLParser.Interval_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#special_expression}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_expression(OracleSQLParser.Special_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#special_expression}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_expression(OracleSQLParser.Special_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#cluster_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterCluster_set_clause(OracleSQLParser.Cluster_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#cluster_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitCluster_set_clause(OracleSQLParser.Cluster_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void enterCast_expression(OracleSQLParser.Cast_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void exitCast_expression(OracleSQLParser.Cast_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#datatype_name}.
	 * @param ctx the parse tree
	 */
	void enterDatatype_name(OracleSQLParser.Datatype_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#datatype_name}.
	 * @param ctx the parse tree
	 */
	void exitDatatype_name(OracleSQLParser.Datatype_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(OracleSQLParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(OracleSQLParser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#t_alias}.
	 * @param ctx the parse tree
	 */
	void enterT_alias(OracleSQLParser.T_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#t_alias}.
	 * @param ctx the parse tree
	 */
	void exitT_alias(OracleSQLParser.T_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#c_alias}.
	 * @param ctx the parse tree
	 */
	void enterC_alias(OracleSQLParser.C_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#c_alias}.
	 * @param ctx the parse tree
	 */
	void exitC_alias(OracleSQLParser.C_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#column_spec}.
	 * @param ctx the parse tree
	 */
	void enterColumn_spec(OracleSQLParser.Column_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#column_spec}.
	 * @param ctx the parse tree
	 */
	void exitColumn_spec(OracleSQLParser.Column_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#pseudo_column}.
	 * @param ctx the parse tree
	 */
	void enterPseudo_column(OracleSQLParser.Pseudo_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#pseudo_column}.
	 * @param ctx the parse tree
	 */
	void exitPseudo_column(OracleSQLParser.Pseudo_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(OracleSQLParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(OracleSQLParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#function_spec}.
	 * @param ctx the parse tree
	 */
	void enterFunction_spec(OracleSQLParser.Function_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#function_spec}.
	 * @param ctx the parse tree
	 */
	void exitFunction_spec(OracleSQLParser.Function_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(OracleSQLParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(OracleSQLParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#bind_variable}.
	 * @param ctx the parse tree
	 */
	void enterBind_variable(OracleSQLParser.Bind_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#bind_variable}.
	 * @param ctx the parse tree
	 */
	void exitBind_variable(OracleSQLParser.Bind_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#sql_identifier}.
	 * @param ctx the parse tree
	 */
	void enterSql_identifier(OracleSQLParser.Sql_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#sql_identifier}.
	 * @param ctx the parse tree
	 */
	void exitSql_identifier(OracleSQLParser.Sql_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#table_reference_list}.
	 * @param ctx the parse tree
	 */
	void enterTable_reference_list(OracleSQLParser.Table_reference_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#table_reference_list}.
	 * @param ctx the parse tree
	 */
	void exitTable_reference_list(OracleSQLParser.Table_reference_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#table_reference}.
	 * @param ctx the parse tree
	 */
	void enterTable_reference(OracleSQLParser.Table_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#table_reference}.
	 * @param ctx the parse tree
	 */
	void exitTable_reference(OracleSQLParser.Table_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#query_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterQuery_table_expression(OracleSQLParser.Query_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#query_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitQuery_table_expression(OracleSQLParser.Query_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#flashback_query_clause}.
	 * @param ctx the parse tree
	 */
	void enterFlashback_query_clause(OracleSQLParser.Flashback_query_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#flashback_query_clause}.
	 * @param ctx the parse tree
	 */
	void exitFlashback_query_clause(OracleSQLParser.Flashback_query_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#sample_clause}.
	 * @param ctx the parse tree
	 */
	void enterSample_clause(OracleSQLParser.Sample_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#sample_clause}.
	 * @param ctx the parse tree
	 */
	void exitSample_clause(OracleSQLParser.Sample_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#partition_extension_clause}.
	 * @param ctx the parse tree
	 */
	void enterPartition_extension_clause(OracleSQLParser.Partition_extension_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#partition_extension_clause}.
	 * @param ctx the parse tree
	 */
	void exitPartition_extension_clause(OracleSQLParser.Partition_extension_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#subquery_restricrion_clause}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_restricrion_clause(OracleSQLParser.Subquery_restricrion_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#subquery_restricrion_clause}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_restricrion_clause(OracleSQLParser.Subquery_restricrion_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#table_collection_clause}.
	 * @param ctx the parse tree
	 */
	void enterTable_collection_clause(OracleSQLParser.Table_collection_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#table_collection_clause}.
	 * @param ctx the parse tree
	 */
	void exitTable_collection_clause(OracleSQLParser.Table_collection_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(OracleSQLParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(OracleSQLParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#inner_cross_join_clause}.
	 * @param ctx the parse tree
	 */
	void enterInner_cross_join_clause(OracleSQLParser.Inner_cross_join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#inner_cross_join_clause}.
	 * @param ctx the parse tree
	 */
	void exitInner_cross_join_clause(OracleSQLParser.Inner_cross_join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#outer_join_clause}.
	 * @param ctx the parse tree
	 */
	void enterOuter_join_clause(OracleSQLParser.Outer_join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#outer_join_clause}.
	 * @param ctx the parse tree
	 */
	void exitOuter_join_clause(OracleSQLParser.Outer_join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#query_partition_clause}.
	 * @param ctx the parse tree
	 */
	void enterQuery_partition_clause(OracleSQLParser.Query_partition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#query_partition_clause}.
	 * @param ctx the parse tree
	 */
	void exitQuery_partition_clause(OracleSQLParser.Query_partition_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#outer_join_type}.
	 * @param ctx the parse tree
	 */
	void enterOuter_join_type(OracleSQLParser.Outer_join_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#outer_join_type}.
	 * @param ctx the parse tree
	 */
	void exitOuter_join_type(OracleSQLParser.Outer_join_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#sample_percent}.
	 * @param ctx the parse tree
	 */
	void enterSample_percent(OracleSQLParser.Sample_percentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#sample_percent}.
	 * @param ctx the parse tree
	 */
	void exitSample_percent(OracleSQLParser.Sample_percentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#seed_value}.
	 * @param ctx the parse tree
	 */
	void enterSeed_value(OracleSQLParser.Seed_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#seed_value}.
	 * @param ctx the parse tree
	 */
	void exitSeed_value(OracleSQLParser.Seed_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#outer_join_sign}.
	 * @param ctx the parse tree
	 */
	void enterOuter_join_sign(OracleSQLParser.Outer_join_signContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#outer_join_sign}.
	 * @param ctx the parse tree
	 */
	void exitOuter_join_sign(OracleSQLParser.Outer_join_signContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(OracleSQLParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(OracleSQLParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_name(OracleSQLParser.Schema_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_name(OracleSQLParser.Schema_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#package_name}.
	 * @param ctx the parse tree
	 */
	void enterPackage_name(OracleSQLParser.Package_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#package_name}.
	 * @param ctx the parse tree
	 */
	void exitPackage_name(OracleSQLParser.Package_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#dblink_name}.
	 * @param ctx the parse tree
	 */
	void enterDblink_name(OracleSQLParser.Dblink_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#dblink_name}.
	 * @param ctx the parse tree
	 */
	void exitDblink_name(OracleSQLParser.Dblink_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#column_specs}.
	 * @param ctx the parse tree
	 */
	void enterColumn_specs(OracleSQLParser.Column_specsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#column_specs}.
	 * @param ctx the parse tree
	 */
	void exitColumn_specs(OracleSQLParser.Column_specsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#partition}.
	 * @param ctx the parse tree
	 */
	void enterPartition(OracleSQLParser.PartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#partition}.
	 * @param ctx the parse tree
	 */
	void exitPartition(OracleSQLParser.PartitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#partition_key_value}.
	 * @param ctx the parse tree
	 */
	void enterPartition_key_value(OracleSQLParser.Partition_key_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#partition_key_value}.
	 * @param ctx the parse tree
	 */
	void exitPartition_key_value(OracleSQLParser.Partition_key_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#subpartition_key_value}.
	 * @param ctx the parse tree
	 */
	void enterSubpartition_key_value(OracleSQLParser.Subpartition_key_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#subpartition_key_value}.
	 * @param ctx the parse tree
	 */
	void exitSubpartition_key_value(OracleSQLParser.Subpartition_key_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(OracleSQLParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(OracleSQLParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#collection_expression}.
	 * @param ctx the parse tree
	 */
	void enterCollection_expression(OracleSQLParser.Collection_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#collection_expression}.
	 * @param ctx the parse tree
	 */
	void exitCollection_expression(OracleSQLParser.Collection_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(OracleSQLParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(OracleSQLParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#hierarchical_query_clause}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_query_clause(OracleSQLParser.Hierarchical_query_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#hierarchical_query_clause}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_query_clause(OracleSQLParser.Hierarchical_query_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_clause(OracleSQLParser.Group_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_clause(OracleSQLParser.Group_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#group_by_exprs}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_exprs(OracleSQLParser.Group_by_exprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#group_by_exprs}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_exprs(OracleSQLParser.Group_by_exprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#group_by_expr}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_expr(OracleSQLParser.Group_by_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#group_by_expr}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_expr(OracleSQLParser.Group_by_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#rollup_cube_clause}.
	 * @param ctx the parse tree
	 */
	void enterRollup_cube_clause(OracleSQLParser.Rollup_cube_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#rollup_cube_clause}.
	 * @param ctx the parse tree
	 */
	void exitRollup_cube_clause(OracleSQLParser.Rollup_cube_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#grouping_sets_clause}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_sets_clause(OracleSQLParser.Grouping_sets_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#grouping_sets_clause}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_sets_clause(OracleSQLParser.Grouping_sets_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#grouping_sets_exprs}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_sets_exprs(OracleSQLParser.Grouping_sets_exprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#grouping_sets_exprs}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_sets_exprs(OracleSQLParser.Grouping_sets_exprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#grouping_sets_expr}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_sets_expr(OracleSQLParser.Grouping_sets_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#grouping_sets_expr}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_sets_expr(OracleSQLParser.Grouping_sets_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#sql_condition}.
	 * @param ctx the parse tree
	 */
	void enterSql_condition(OracleSQLParser.Sql_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#sql_condition}.
	 * @param ctx the parse tree
	 */
	void exitSql_condition(OracleSQLParser.Sql_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#condition_or}.
	 * @param ctx the parse tree
	 */
	void enterCondition_or(OracleSQLParser.Condition_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#condition_or}.
	 * @param ctx the parse tree
	 */
	void exitCondition_or(OracleSQLParser.Condition_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#condition_and}.
	 * @param ctx the parse tree
	 */
	void enterCondition_and(OracleSQLParser.Condition_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#condition_and}.
	 * @param ctx the parse tree
	 */
	void exitCondition_and(OracleSQLParser.Condition_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#condition_not}.
	 * @param ctx the parse tree
	 */
	void enterCondition_not(OracleSQLParser.Condition_notContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#condition_not}.
	 * @param ctx the parse tree
	 */
	void exitCondition_not(OracleSQLParser.Condition_notContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#condition_expr}.
	 * @param ctx the parse tree
	 */
	void enterCondition_expr(OracleSQLParser.Condition_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#condition_expr}.
	 * @param ctx the parse tree
	 */
	void exitCondition_expr(OracleSQLParser.Condition_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#condition_exists}.
	 * @param ctx the parse tree
	 */
	void enterCondition_exists(OracleSQLParser.Condition_existsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#condition_exists}.
	 * @param ctx the parse tree
	 */
	void exitCondition_exists(OracleSQLParser.Condition_existsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#condition_is}.
	 * @param ctx the parse tree
	 */
	void enterCondition_is(OracleSQLParser.Condition_isContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#condition_is}.
	 * @param ctx the parse tree
	 */
	void exitCondition_is(OracleSQLParser.Condition_isContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#condition_comparison}.
	 * @param ctx the parse tree
	 */
	void enterCondition_comparison(OracleSQLParser.Condition_comparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#condition_comparison}.
	 * @param ctx the parse tree
	 */
	void exitCondition_comparison(OracleSQLParser.Condition_comparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#condition_group_comparison}.
	 * @param ctx the parse tree
	 */
	void enterCondition_group_comparison(OracleSQLParser.Condition_group_comparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#condition_group_comparison}.
	 * @param ctx the parse tree
	 */
	void exitCondition_group_comparison(OracleSQLParser.Condition_group_comparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#condition_in}.
	 * @param ctx the parse tree
	 */
	void enterCondition_in(OracleSQLParser.Condition_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#condition_in}.
	 * @param ctx the parse tree
	 */
	void exitCondition_in(OracleSQLParser.Condition_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#condition_is_a_set}.
	 * @param ctx the parse tree
	 */
	void enterCondition_is_a_set(OracleSQLParser.Condition_is_a_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#condition_is_a_set}.
	 * @param ctx the parse tree
	 */
	void exitCondition_is_a_set(OracleSQLParser.Condition_is_a_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#condition_is_any}.
	 * @param ctx the parse tree
	 */
	void enterCondition_is_any(OracleSQLParser.Condition_is_anyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#condition_is_any}.
	 * @param ctx the parse tree
	 */
	void exitCondition_is_any(OracleSQLParser.Condition_is_anyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#condition_is_empty}.
	 * @param ctx the parse tree
	 */
	void enterCondition_is_empty(OracleSQLParser.Condition_is_emptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#condition_is_empty}.
	 * @param ctx the parse tree
	 */
	void exitCondition_is_empty(OracleSQLParser.Condition_is_emptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#condition_is_of_type}.
	 * @param ctx the parse tree
	 */
	void enterCondition_is_of_type(OracleSQLParser.Condition_is_of_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#condition_is_of_type}.
	 * @param ctx the parse tree
	 */
	void exitCondition_is_of_type(OracleSQLParser.Condition_is_of_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#condition_is_present}.
	 * @param ctx the parse tree
	 */
	void enterCondition_is_present(OracleSQLParser.Condition_is_presentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#condition_is_present}.
	 * @param ctx the parse tree
	 */
	void exitCondition_is_present(OracleSQLParser.Condition_is_presentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#condition_like}.
	 * @param ctx the parse tree
	 */
	void enterCondition_like(OracleSQLParser.Condition_likeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#condition_like}.
	 * @param ctx the parse tree
	 */
	void exitCondition_like(OracleSQLParser.Condition_likeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#condition_memeber}.
	 * @param ctx the parse tree
	 */
	void enterCondition_memeber(OracleSQLParser.Condition_memeberContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#condition_memeber}.
	 * @param ctx the parse tree
	 */
	void exitCondition_memeber(OracleSQLParser.Condition_memeberContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#condition_between}.
	 * @param ctx the parse tree
	 */
	void enterCondition_between(OracleSQLParser.Condition_betweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#condition_between}.
	 * @param ctx the parse tree
	 */
	void exitCondition_between(OracleSQLParser.Condition_betweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#condition_regexp_like}.
	 * @param ctx the parse tree
	 */
	void enterCondition_regexp_like(OracleSQLParser.Condition_regexp_likeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#condition_regexp_like}.
	 * @param ctx the parse tree
	 */
	void exitCondition_regexp_like(OracleSQLParser.Condition_regexp_likeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#condition_submultiset}.
	 * @param ctx the parse tree
	 */
	void enterCondition_submultiset(OracleSQLParser.Condition_submultisetContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#condition_submultiset}.
	 * @param ctx the parse tree
	 */
	void exitCondition_submultiset(OracleSQLParser.Condition_submultisetContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#condition_equals_path}.
	 * @param ctx the parse tree
	 */
	void enterCondition_equals_path(OracleSQLParser.Condition_equals_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#condition_equals_path}.
	 * @param ctx the parse tree
	 */
	void exitCondition_equals_path(OracleSQLParser.Condition_equals_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#condition_under_path}.
	 * @param ctx the parse tree
	 */
	void enterCondition_under_path(OracleSQLParser.Condition_under_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#condition_under_path}.
	 * @param ctx the parse tree
	 */
	void exitCondition_under_path(OracleSQLParser.Condition_under_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#levels}.
	 * @param ctx the parse tree
	 */
	void enterLevels(OracleSQLParser.LevelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#levels}.
	 * @param ctx the parse tree
	 */
	void exitLevels(OracleSQLParser.LevelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#correlation_integer}.
	 * @param ctx the parse tree
	 */
	void enterCorrelation_integer(OracleSQLParser.Correlation_integerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#correlation_integer}.
	 * @param ctx the parse tree
	 */
	void exitCorrelation_integer(OracleSQLParser.Correlation_integerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#path_string}.
	 * @param ctx the parse tree
	 */
	void enterPath_string(OracleSQLParser.Path_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#path_string}.
	 * @param ctx the parse tree
	 */
	void exitPath_string(OracleSQLParser.Path_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#type_names}.
	 * @param ctx the parse tree
	 */
	void enterType_names(OracleSQLParser.Type_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#type_names}.
	 * @param ctx the parse tree
	 */
	void exitType_names(OracleSQLParser.Type_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(OracleSQLParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(OracleSQLParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(OracleSQLParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(OracleSQLParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#nested_table}.
	 * @param ctx the parse tree
	 */
	void enterNested_table(OracleSQLParser.Nested_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#nested_table}.
	 * @param ctx the parse tree
	 */
	void exitNested_table(OracleSQLParser.Nested_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#nested_table_column_name}.
	 * @param ctx the parse tree
	 */
	void enterNested_table_column_name(OracleSQLParser.Nested_table_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#nested_table_column_name}.
	 * @param ctx the parse tree
	 */
	void exitNested_table_column_name(OracleSQLParser.Nested_table_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#sql_expressions}.
	 * @param ctx the parse tree
	 */
	void enterSql_expressions(OracleSQLParser.Sql_expressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#sql_expressions}.
	 * @param ctx the parse tree
	 */
	void exitSql_expressions(OracleSQLParser.Sql_expressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#grouping_sets_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_sets_expression_list(OracleSQLParser.Grouping_sets_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#grouping_sets_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_sets_expression_list(OracleSQLParser.Grouping_sets_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#grouping_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_expression_list(OracleSQLParser.Grouping_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#grouping_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_expression_list(OracleSQLParser.Grouping_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(OracleSQLParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(OracleSQLParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#cell_reference}.
	 * @param ctx the parse tree
	 */
	void enterCell_reference(OracleSQLParser.Cell_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#cell_reference}.
	 * @param ctx the parse tree
	 */
	void exitCell_reference(OracleSQLParser.Cell_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#condition_paren}.
	 * @param ctx the parse tree
	 */
	void enterCondition_paren(OracleSQLParser.Condition_parenContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#condition_paren}.
	 * @param ctx the parse tree
	 */
	void exitCondition_paren(OracleSQLParser.Condition_parenContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#model_clause}.
	 * @param ctx the parse tree
	 */
	void enterModel_clause(OracleSQLParser.Model_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#model_clause}.
	 * @param ctx the parse tree
	 */
	void exitModel_clause(OracleSQLParser.Model_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#cell_reference_options}.
	 * @param ctx the parse tree
	 */
	void enterCell_reference_options(OracleSQLParser.Cell_reference_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#cell_reference_options}.
	 * @param ctx the parse tree
	 */
	void exitCell_reference_options(OracleSQLParser.Cell_reference_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#return_rows_clause}.
	 * @param ctx the parse tree
	 */
	void enterReturn_rows_clause(OracleSQLParser.Return_rows_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#return_rows_clause}.
	 * @param ctx the parse tree
	 */
	void exitReturn_rows_clause(OracleSQLParser.Return_rows_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#reference_model}.
	 * @param ctx the parse tree
	 */
	void enterReference_model(OracleSQLParser.Reference_modelContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#reference_model}.
	 * @param ctx the parse tree
	 */
	void exitReference_model(OracleSQLParser.Reference_modelContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#reference_model_name}.
	 * @param ctx the parse tree
	 */
	void enterReference_model_name(OracleSQLParser.Reference_model_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#reference_model_name}.
	 * @param ctx the parse tree
	 */
	void exitReference_model_name(OracleSQLParser.Reference_model_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#main_model}.
	 * @param ctx the parse tree
	 */
	void enterMain_model(OracleSQLParser.Main_modelContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#main_model}.
	 * @param ctx the parse tree
	 */
	void exitMain_model(OracleSQLParser.Main_modelContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#main_model_name}.
	 * @param ctx the parse tree
	 */
	void enterMain_model_name(OracleSQLParser.Main_model_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#main_model_name}.
	 * @param ctx the parse tree
	 */
	void exitMain_model_name(OracleSQLParser.Main_model_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#model_column_clauses}.
	 * @param ctx the parse tree
	 */
	void enterModel_column_clauses(OracleSQLParser.Model_column_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#model_column_clauses}.
	 * @param ctx the parse tree
	 */
	void exitModel_column_clauses(OracleSQLParser.Model_column_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#model_columns}.
	 * @param ctx the parse tree
	 */
	void enterModel_columns(OracleSQLParser.Model_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#model_columns}.
	 * @param ctx the parse tree
	 */
	void exitModel_columns(OracleSQLParser.Model_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#model_column}.
	 * @param ctx the parse tree
	 */
	void enterModel_column(OracleSQLParser.Model_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#model_column}.
	 * @param ctx the parse tree
	 */
	void exitModel_column(OracleSQLParser.Model_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#model_rules_clause}.
	 * @param ctx the parse tree
	 */
	void enterModel_rules_clause(OracleSQLParser.Model_rules_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#model_rules_clause}.
	 * @param ctx the parse tree
	 */
	void exitModel_rules_clause(OracleSQLParser.Model_rules_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#model_rules_exprs}.
	 * @param ctx the parse tree
	 */
	void enterModel_rules_exprs(OracleSQLParser.Model_rules_exprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#model_rules_exprs}.
	 * @param ctx the parse tree
	 */
	void exitModel_rules_exprs(OracleSQLParser.Model_rules_exprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#model_rules_expr}.
	 * @param ctx the parse tree
	 */
	void enterModel_rules_expr(OracleSQLParser.Model_rules_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#model_rules_expr}.
	 * @param ctx the parse tree
	 */
	void exitModel_rules_expr(OracleSQLParser.Model_rules_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#cell_assignment}.
	 * @param ctx the parse tree
	 */
	void enterCell_assignment(OracleSQLParser.Cell_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#cell_assignment}.
	 * @param ctx the parse tree
	 */
	void exitCell_assignment(OracleSQLParser.Cell_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#cell_assignment_exprs}.
	 * @param ctx the parse tree
	 */
	void enterCell_assignment_exprs(OracleSQLParser.Cell_assignment_exprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#cell_assignment_exprs}.
	 * @param ctx the parse tree
	 */
	void exitCell_assignment_exprs(OracleSQLParser.Cell_assignment_exprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#cell_assignment_expr}.
	 * @param ctx the parse tree
	 */
	void enterCell_assignment_expr(OracleSQLParser.Cell_assignment_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#cell_assignment_expr}.
	 * @param ctx the parse tree
	 */
	void exitCell_assignment_expr(OracleSQLParser.Cell_assignment_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#measure_column}.
	 * @param ctx the parse tree
	 */
	void enterMeasure_column(OracleSQLParser.Measure_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#measure_column}.
	 * @param ctx the parse tree
	 */
	void exitMeasure_column(OracleSQLParser.Measure_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#single_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void enterSingle_column_for_loop(OracleSQLParser.Single_column_for_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#single_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void exitSingle_column_for_loop(OracleSQLParser.Single_column_for_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(OracleSQLParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(OracleSQLParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(OracleSQLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(OracleSQLParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#literals}.
	 * @param ctx the parse tree
	 */
	void enterLiterals(OracleSQLParser.LiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#literals}.
	 * @param ctx the parse tree
	 */
	void exitLiterals(OracleSQLParser.LiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#multi_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void enterMulti_column_for_loop(OracleSQLParser.Multi_column_for_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#multi_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void exitMulti_column_for_loop(OracleSQLParser.Multi_column_for_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#bracket_literals}.
	 * @param ctx the parse tree
	 */
	void enterBracket_literals(OracleSQLParser.Bracket_literalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#bracket_literals}.
	 * @param ctx the parse tree
	 */
	void exitBracket_literals(OracleSQLParser.Bracket_literalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#bracket_literals_list}.
	 * @param ctx the parse tree
	 */
	void enterBracket_literals_list(OracleSQLParser.Bracket_literals_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#bracket_literals_list}.
	 * @param ctx the parse tree
	 */
	void exitBracket_literals_list(OracleSQLParser.Bracket_literals_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#union_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnion_clause(OracleSQLParser.Union_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#union_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnion_clause(OracleSQLParser.Union_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(OracleSQLParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(OracleSQLParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#order_by_clause_part_first}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause_part_first(OracleSQLParser.Order_by_clause_part_firstContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#order_by_clause_part_first}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause_part_first(OracleSQLParser.Order_by_clause_part_firstContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#order_by_clause_part_next}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause_part_next(OracleSQLParser.Order_by_clause_part_nextContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#order_by_clause_part_next}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause_part_next(OracleSQLParser.Order_by_clause_part_nextContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#analytic_function_name}.
	 * @param ctx the parse tree
	 */
	void enterAnalytic_function_name(OracleSQLParser.Analytic_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#analytic_function_name}.
	 * @param ctx the parse tree
	 */
	void exitAnalytic_function_name(OracleSQLParser.Analytic_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#analytic_function_call}.
	 * @param ctx the parse tree
	 */
	void enterAnalytic_function_call(OracleSQLParser.Analytic_function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#analytic_function_call}.
	 * @param ctx the parse tree
	 */
	void exitAnalytic_function_call(OracleSQLParser.Analytic_function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#analytic_function}.
	 * @param ctx the parse tree
	 */
	void enterAnalytic_function(OracleSQLParser.Analytic_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#analytic_function}.
	 * @param ctx the parse tree
	 */
	void exitAnalytic_function(OracleSQLParser.Analytic_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#count_function}.
	 * @param ctx the parse tree
	 */
	void enterCount_function(OracleSQLParser.Count_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#count_function}.
	 * @param ctx the parse tree
	 */
	void exitCount_function(OracleSQLParser.Count_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#analytic_clause}.
	 * @param ctx the parse tree
	 */
	void enterAnalytic_clause(OracleSQLParser.Analytic_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#analytic_clause}.
	 * @param ctx the parse tree
	 */
	void exitAnalytic_clause(OracleSQLParser.Analytic_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#windowing_clause_part}.
	 * @param ctx the parse tree
	 */
	void enterWindowing_clause_part(OracleSQLParser.Windowing_clause_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#windowing_clause_part}.
	 * @param ctx the parse tree
	 */
	void exitWindowing_clause_part(OracleSQLParser.Windowing_clause_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#windowing_clause}.
	 * @param ctx the parse tree
	 */
	void enterWindowing_clause(OracleSQLParser.Windowing_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#windowing_clause}.
	 * @param ctx the parse tree
	 */
	void exitWindowing_clause(OracleSQLParser.Windowing_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#aggregate_function_name}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_function_name(OracleSQLParser.Aggregate_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#aggregate_function_name}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_function_name(OracleSQLParser.Aggregate_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#aggregate_function}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_function(OracleSQLParser.Aggregate_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#aggregate_function}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_function(OracleSQLParser.Aggregate_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#percent_rank_aggregate}.
	 * @param ctx the parse tree
	 */
	void enterPercent_rank_aggregate(OracleSQLParser.Percent_rank_aggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#percent_rank_aggregate}.
	 * @param ctx the parse tree
	 */
	void exitPercent_rank_aggregate(OracleSQLParser.Percent_rank_aggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#dense_rank_aggregate}.
	 * @param ctx the parse tree
	 */
	void enterDense_rank_aggregate(OracleSQLParser.Dense_rank_aggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#dense_rank_aggregate}.
	 * @param ctx the parse tree
	 */
	void exitDense_rank_aggregate(OracleSQLParser.Dense_rank_aggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#percent_rank_analytic}.
	 * @param ctx the parse tree
	 */
	void enterPercent_rank_analytic(OracleSQLParser.Percent_rank_analyticContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#percent_rank_analytic}.
	 * @param ctx the parse tree
	 */
	void exitPercent_rank_analytic(OracleSQLParser.Percent_rank_analyticContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#percent_cont_disc_analytic}.
	 * @param ctx the parse tree
	 */
	void enterPercent_cont_disc_analytic(OracleSQLParser.Percent_cont_disc_analyticContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#percent_cont_disc_analytic}.
	 * @param ctx the parse tree
	 */
	void exitPercent_cont_disc_analytic(OracleSQLParser.Percent_cont_disc_analyticContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#dense_rank_analytic}.
	 * @param ctx the parse tree
	 */
	void enterDense_rank_analytic(OracleSQLParser.Dense_rank_analyticContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#dense_rank_analytic}.
	 * @param ctx the parse tree
	 */
	void exitDense_rank_analytic(OracleSQLParser.Dense_rank_analyticContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#first_last}.
	 * @param ctx the parse tree
	 */
	void enterFirst_last(OracleSQLParser.First_lastContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#first_last}.
	 * @param ctx the parse tree
	 */
	void exitFirst_last(OracleSQLParser.First_lastContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#listagg}.
	 * @param ctx the parse tree
	 */
	void enterListagg(OracleSQLParser.ListaggContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#listagg}.
	 * @param ctx the parse tree
	 */
	void exitListagg(OracleSQLParser.ListaggContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#for_update_clause}.
	 * @param ctx the parse tree
	 */
	void enterFor_update_clause(OracleSQLParser.For_update_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#for_update_clause}.
	 * @param ctx the parse tree
	 */
	void exitFor_update_clause(OracleSQLParser.For_update_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#for_update_clause_part_first}.
	 * @param ctx the parse tree
	 */
	void enterFor_update_clause_part_first(OracleSQLParser.For_update_clause_part_firstContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#for_update_clause_part_first}.
	 * @param ctx the parse tree
	 */
	void exitFor_update_clause_part_first(OracleSQLParser.For_update_clause_part_firstContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#for_update_clause_part_next}.
	 * @param ctx the parse tree
	 */
	void enterFor_update_clause_part_next(OracleSQLParser.For_update_clause_part_nextContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#for_update_clause_part_next}.
	 * @param ctx the parse tree
	 */
	void exitFor_update_clause_part_next(OracleSQLParser.For_update_clause_part_nextContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#pivot_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_clause(OracleSQLParser.Pivot_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#pivot_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_clause(OracleSQLParser.Pivot_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#pivot_for_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_for_clause(OracleSQLParser.Pivot_for_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#pivot_for_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_for_clause(OracleSQLParser.Pivot_for_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#pivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_in_clause(OracleSQLParser.Pivot_in_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#pivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_in_clause(OracleSQLParser.Pivot_in_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#unpivot_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_clause(OracleSQLParser.Unpivot_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#unpivot_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_clause(OracleSQLParser.Unpivot_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#unpivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_in_clause(OracleSQLParser.Unpivot_in_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#unpivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_in_clause(OracleSQLParser.Unpivot_in_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(OracleSQLParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(OracleSQLParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_access}.
	 * @param ctx the parse tree
	 */
	void enterR_access(OracleSQLParser.R_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_access}.
	 * @param ctx the parse tree
	 */
	void exitR_access(OracleSQLParser.R_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_add}.
	 * @param ctx the parse tree
	 */
	void enterR_add(OracleSQLParser.R_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_add}.
	 * @param ctx the parse tree
	 */
	void exitR_add(OracleSQLParser.R_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_all}.
	 * @param ctx the parse tree
	 */
	void enterR_all(OracleSQLParser.R_allContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_all}.
	 * @param ctx the parse tree
	 */
	void exitR_all(OracleSQLParser.R_allContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_alter}.
	 * @param ctx the parse tree
	 */
	void enterR_alter(OracleSQLParser.R_alterContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_alter}.
	 * @param ctx the parse tree
	 */
	void exitR_alter(OracleSQLParser.R_alterContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_and}.
	 * @param ctx the parse tree
	 */
	void enterR_and(OracleSQLParser.R_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_and}.
	 * @param ctx the parse tree
	 */
	void exitR_and(OracleSQLParser.R_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_any}.
	 * @param ctx the parse tree
	 */
	void enterR_any(OracleSQLParser.R_anyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_any}.
	 * @param ctx the parse tree
	 */
	void exitR_any(OracleSQLParser.R_anyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_arraylen}.
	 * @param ctx the parse tree
	 */
	void enterR_arraylen(OracleSQLParser.R_arraylenContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_arraylen}.
	 * @param ctx the parse tree
	 */
	void exitR_arraylen(OracleSQLParser.R_arraylenContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_as}.
	 * @param ctx the parse tree
	 */
	void enterR_as(OracleSQLParser.R_asContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_as}.
	 * @param ctx the parse tree
	 */
	void exitR_as(OracleSQLParser.R_asContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_asc}.
	 * @param ctx the parse tree
	 */
	void enterR_asc(OracleSQLParser.R_ascContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_asc}.
	 * @param ctx the parse tree
	 */
	void exitR_asc(OracleSQLParser.R_ascContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_audit}.
	 * @param ctx the parse tree
	 */
	void enterR_audit(OracleSQLParser.R_auditContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_audit}.
	 * @param ctx the parse tree
	 */
	void exitR_audit(OracleSQLParser.R_auditContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_between}.
	 * @param ctx the parse tree
	 */
	void enterR_between(OracleSQLParser.R_betweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_between}.
	 * @param ctx the parse tree
	 */
	void exitR_between(OracleSQLParser.R_betweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_by}.
	 * @param ctx the parse tree
	 */
	void enterR_by(OracleSQLParser.R_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_by}.
	 * @param ctx the parse tree
	 */
	void exitR_by(OracleSQLParser.R_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_case}.
	 * @param ctx the parse tree
	 */
	void enterR_case(OracleSQLParser.R_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_case}.
	 * @param ctx the parse tree
	 */
	void exitR_case(OracleSQLParser.R_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_char}.
	 * @param ctx the parse tree
	 */
	void enterR_char(OracleSQLParser.R_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_char}.
	 * @param ctx the parse tree
	 */
	void exitR_char(OracleSQLParser.R_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_check}.
	 * @param ctx the parse tree
	 */
	void enterR_check(OracleSQLParser.R_checkContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_check}.
	 * @param ctx the parse tree
	 */
	void exitR_check(OracleSQLParser.R_checkContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_cluster}.
	 * @param ctx the parse tree
	 */
	void enterR_cluster(OracleSQLParser.R_clusterContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_cluster}.
	 * @param ctx the parse tree
	 */
	void exitR_cluster(OracleSQLParser.R_clusterContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_column}.
	 * @param ctx the parse tree
	 */
	void enterR_column(OracleSQLParser.R_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_column}.
	 * @param ctx the parse tree
	 */
	void exitR_column(OracleSQLParser.R_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_comment}.
	 * @param ctx the parse tree
	 */
	void enterR_comment(OracleSQLParser.R_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_comment}.
	 * @param ctx the parse tree
	 */
	void exitR_comment(OracleSQLParser.R_commentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_compress}.
	 * @param ctx the parse tree
	 */
	void enterR_compress(OracleSQLParser.R_compressContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_compress}.
	 * @param ctx the parse tree
	 */
	void exitR_compress(OracleSQLParser.R_compressContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_connect}.
	 * @param ctx the parse tree
	 */
	void enterR_connect(OracleSQLParser.R_connectContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_connect}.
	 * @param ctx the parse tree
	 */
	void exitR_connect(OracleSQLParser.R_connectContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_create}.
	 * @param ctx the parse tree
	 */
	void enterR_create(OracleSQLParser.R_createContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_create}.
	 * @param ctx the parse tree
	 */
	void exitR_create(OracleSQLParser.R_createContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_current}.
	 * @param ctx the parse tree
	 */
	void enterR_current(OracleSQLParser.R_currentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_current}.
	 * @param ctx the parse tree
	 */
	void exitR_current(OracleSQLParser.R_currentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_date}.
	 * @param ctx the parse tree
	 */
	void enterR_date(OracleSQLParser.R_dateContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_date}.
	 * @param ctx the parse tree
	 */
	void exitR_date(OracleSQLParser.R_dateContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_decimal}.
	 * @param ctx the parse tree
	 */
	void enterR_decimal(OracleSQLParser.R_decimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_decimal}.
	 * @param ctx the parse tree
	 */
	void exitR_decimal(OracleSQLParser.R_decimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_default}.
	 * @param ctx the parse tree
	 */
	void enterR_default(OracleSQLParser.R_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_default}.
	 * @param ctx the parse tree
	 */
	void exitR_default(OracleSQLParser.R_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_delete}.
	 * @param ctx the parse tree
	 */
	void enterR_delete(OracleSQLParser.R_deleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_delete}.
	 * @param ctx the parse tree
	 */
	void exitR_delete(OracleSQLParser.R_deleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_desc}.
	 * @param ctx the parse tree
	 */
	void enterR_desc(OracleSQLParser.R_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_desc}.
	 * @param ctx the parse tree
	 */
	void exitR_desc(OracleSQLParser.R_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_distinct}.
	 * @param ctx the parse tree
	 */
	void enterR_distinct(OracleSQLParser.R_distinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_distinct}.
	 * @param ctx the parse tree
	 */
	void exitR_distinct(OracleSQLParser.R_distinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_drop}.
	 * @param ctx the parse tree
	 */
	void enterR_drop(OracleSQLParser.R_dropContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_drop}.
	 * @param ctx the parse tree
	 */
	void exitR_drop(OracleSQLParser.R_dropContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_else}.
	 * @param ctx the parse tree
	 */
	void enterR_else(OracleSQLParser.R_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_else}.
	 * @param ctx the parse tree
	 */
	void exitR_else(OracleSQLParser.R_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_exclusive}.
	 * @param ctx the parse tree
	 */
	void enterR_exclusive(OracleSQLParser.R_exclusiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_exclusive}.
	 * @param ctx the parse tree
	 */
	void exitR_exclusive(OracleSQLParser.R_exclusiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_exists}.
	 * @param ctx the parse tree
	 */
	void enterR_exists(OracleSQLParser.R_existsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_exists}.
	 * @param ctx the parse tree
	 */
	void exitR_exists(OracleSQLParser.R_existsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_false}.
	 * @param ctx the parse tree
	 */
	void enterR_false(OracleSQLParser.R_falseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_false}.
	 * @param ctx the parse tree
	 */
	void exitR_false(OracleSQLParser.R_falseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_file}.
	 * @param ctx the parse tree
	 */
	void enterR_file(OracleSQLParser.R_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_file}.
	 * @param ctx the parse tree
	 */
	void exitR_file(OracleSQLParser.R_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_float}.
	 * @param ctx the parse tree
	 */
	void enterR_float(OracleSQLParser.R_floatContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_float}.
	 * @param ctx the parse tree
	 */
	void exitR_float(OracleSQLParser.R_floatContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_for}.
	 * @param ctx the parse tree
	 */
	void enterR_for(OracleSQLParser.R_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_for}.
	 * @param ctx the parse tree
	 */
	void exitR_for(OracleSQLParser.R_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_from}.
	 * @param ctx the parse tree
	 */
	void enterR_from(OracleSQLParser.R_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_from}.
	 * @param ctx the parse tree
	 */
	void exitR_from(OracleSQLParser.R_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_grant}.
	 * @param ctx the parse tree
	 */
	void enterR_grant(OracleSQLParser.R_grantContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_grant}.
	 * @param ctx the parse tree
	 */
	void exitR_grant(OracleSQLParser.R_grantContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_group}.
	 * @param ctx the parse tree
	 */
	void enterR_group(OracleSQLParser.R_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_group}.
	 * @param ctx the parse tree
	 */
	void exitR_group(OracleSQLParser.R_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_having}.
	 * @param ctx the parse tree
	 */
	void enterR_having(OracleSQLParser.R_havingContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_having}.
	 * @param ctx the parse tree
	 */
	void exitR_having(OracleSQLParser.R_havingContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_identified}.
	 * @param ctx the parse tree
	 */
	void enterR_identified(OracleSQLParser.R_identifiedContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_identified}.
	 * @param ctx the parse tree
	 */
	void exitR_identified(OracleSQLParser.R_identifiedContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_immediate}.
	 * @param ctx the parse tree
	 */
	void enterR_immediate(OracleSQLParser.R_immediateContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_immediate}.
	 * @param ctx the parse tree
	 */
	void exitR_immediate(OracleSQLParser.R_immediateContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_in}.
	 * @param ctx the parse tree
	 */
	void enterR_in(OracleSQLParser.R_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_in}.
	 * @param ctx the parse tree
	 */
	void exitR_in(OracleSQLParser.R_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_increment}.
	 * @param ctx the parse tree
	 */
	void enterR_increment(OracleSQLParser.R_incrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_increment}.
	 * @param ctx the parse tree
	 */
	void exitR_increment(OracleSQLParser.R_incrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_index}.
	 * @param ctx the parse tree
	 */
	void enterR_index(OracleSQLParser.R_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_index}.
	 * @param ctx the parse tree
	 */
	void exitR_index(OracleSQLParser.R_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_initial}.
	 * @param ctx the parse tree
	 */
	void enterR_initial(OracleSQLParser.R_initialContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_initial}.
	 * @param ctx the parse tree
	 */
	void exitR_initial(OracleSQLParser.R_initialContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_insert}.
	 * @param ctx the parse tree
	 */
	void enterR_insert(OracleSQLParser.R_insertContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_insert}.
	 * @param ctx the parse tree
	 */
	void exitR_insert(OracleSQLParser.R_insertContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_integer}.
	 * @param ctx the parse tree
	 */
	void enterR_integer(OracleSQLParser.R_integerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_integer}.
	 * @param ctx the parse tree
	 */
	void exitR_integer(OracleSQLParser.R_integerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_intersect}.
	 * @param ctx the parse tree
	 */
	void enterR_intersect(OracleSQLParser.R_intersectContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_intersect}.
	 * @param ctx the parse tree
	 */
	void exitR_intersect(OracleSQLParser.R_intersectContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_into}.
	 * @param ctx the parse tree
	 */
	void enterR_into(OracleSQLParser.R_intoContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_into}.
	 * @param ctx the parse tree
	 */
	void exitR_into(OracleSQLParser.R_intoContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_is}.
	 * @param ctx the parse tree
	 */
	void enterR_is(OracleSQLParser.R_isContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_is}.
	 * @param ctx the parse tree
	 */
	void exitR_is(OracleSQLParser.R_isContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_level}.
	 * @param ctx the parse tree
	 */
	void enterR_level(OracleSQLParser.R_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_level}.
	 * @param ctx the parse tree
	 */
	void exitR_level(OracleSQLParser.R_levelContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_like}.
	 * @param ctx the parse tree
	 */
	void enterR_like(OracleSQLParser.R_likeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_like}.
	 * @param ctx the parse tree
	 */
	void exitR_like(OracleSQLParser.R_likeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_lock}.
	 * @param ctx the parse tree
	 */
	void enterR_lock(OracleSQLParser.R_lockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_lock}.
	 * @param ctx the parse tree
	 */
	void exitR_lock(OracleSQLParser.R_lockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_long}.
	 * @param ctx the parse tree
	 */
	void enterR_long(OracleSQLParser.R_longContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_long}.
	 * @param ctx the parse tree
	 */
	void exitR_long(OracleSQLParser.R_longContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_maxextents}.
	 * @param ctx the parse tree
	 */
	void enterR_maxextents(OracleSQLParser.R_maxextentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_maxextents}.
	 * @param ctx the parse tree
	 */
	void exitR_maxextents(OracleSQLParser.R_maxextentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_minus}.
	 * @param ctx the parse tree
	 */
	void enterR_minus(OracleSQLParser.R_minusContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_minus}.
	 * @param ctx the parse tree
	 */
	void exitR_minus(OracleSQLParser.R_minusContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_mode}.
	 * @param ctx the parse tree
	 */
	void enterR_mode(OracleSQLParser.R_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_mode}.
	 * @param ctx the parse tree
	 */
	void exitR_mode(OracleSQLParser.R_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_modify}.
	 * @param ctx the parse tree
	 */
	void enterR_modify(OracleSQLParser.R_modifyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_modify}.
	 * @param ctx the parse tree
	 */
	void exitR_modify(OracleSQLParser.R_modifyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_noaudit}.
	 * @param ctx the parse tree
	 */
	void enterR_noaudit(OracleSQLParser.R_noauditContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_noaudit}.
	 * @param ctx the parse tree
	 */
	void exitR_noaudit(OracleSQLParser.R_noauditContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_nocompress}.
	 * @param ctx the parse tree
	 */
	void enterR_nocompress(OracleSQLParser.R_nocompressContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_nocompress}.
	 * @param ctx the parse tree
	 */
	void exitR_nocompress(OracleSQLParser.R_nocompressContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_not}.
	 * @param ctx the parse tree
	 */
	void enterR_not(OracleSQLParser.R_notContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_not}.
	 * @param ctx the parse tree
	 */
	void exitR_not(OracleSQLParser.R_notContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_notfound}.
	 * @param ctx the parse tree
	 */
	void enterR_notfound(OracleSQLParser.R_notfoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_notfound}.
	 * @param ctx the parse tree
	 */
	void exitR_notfound(OracleSQLParser.R_notfoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_nowait}.
	 * @param ctx the parse tree
	 */
	void enterR_nowait(OracleSQLParser.R_nowaitContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_nowait}.
	 * @param ctx the parse tree
	 */
	void exitR_nowait(OracleSQLParser.R_nowaitContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_null}.
	 * @param ctx the parse tree
	 */
	void enterR_null(OracleSQLParser.R_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_null}.
	 * @param ctx the parse tree
	 */
	void exitR_null(OracleSQLParser.R_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_number}.
	 * @param ctx the parse tree
	 */
	void enterR_number(OracleSQLParser.R_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_number}.
	 * @param ctx the parse tree
	 */
	void exitR_number(OracleSQLParser.R_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_of}.
	 * @param ctx the parse tree
	 */
	void enterR_of(OracleSQLParser.R_ofContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_of}.
	 * @param ctx the parse tree
	 */
	void exitR_of(OracleSQLParser.R_ofContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_offline}.
	 * @param ctx the parse tree
	 */
	void enterR_offline(OracleSQLParser.R_offlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_offline}.
	 * @param ctx the parse tree
	 */
	void exitR_offline(OracleSQLParser.R_offlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_on}.
	 * @param ctx the parse tree
	 */
	void enterR_on(OracleSQLParser.R_onContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_on}.
	 * @param ctx the parse tree
	 */
	void exitR_on(OracleSQLParser.R_onContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_online}.
	 * @param ctx the parse tree
	 */
	void enterR_online(OracleSQLParser.R_onlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_online}.
	 * @param ctx the parse tree
	 */
	void exitR_online(OracleSQLParser.R_onlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_option}.
	 * @param ctx the parse tree
	 */
	void enterR_option(OracleSQLParser.R_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_option}.
	 * @param ctx the parse tree
	 */
	void exitR_option(OracleSQLParser.R_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_or}.
	 * @param ctx the parse tree
	 */
	void enterR_or(OracleSQLParser.R_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_or}.
	 * @param ctx the parse tree
	 */
	void exitR_or(OracleSQLParser.R_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_order}.
	 * @param ctx the parse tree
	 */
	void enterR_order(OracleSQLParser.R_orderContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_order}.
	 * @param ctx the parse tree
	 */
	void exitR_order(OracleSQLParser.R_orderContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_pctfree}.
	 * @param ctx the parse tree
	 */
	void enterR_pctfree(OracleSQLParser.R_pctfreeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_pctfree}.
	 * @param ctx the parse tree
	 */
	void exitR_pctfree(OracleSQLParser.R_pctfreeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_prior}.
	 * @param ctx the parse tree
	 */
	void enterR_prior(OracleSQLParser.R_priorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_prior}.
	 * @param ctx the parse tree
	 */
	void exitR_prior(OracleSQLParser.R_priorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_privileges}.
	 * @param ctx the parse tree
	 */
	void enterR_privileges(OracleSQLParser.R_privilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_privileges}.
	 * @param ctx the parse tree
	 */
	void exitR_privileges(OracleSQLParser.R_privilegesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_public}.
	 * @param ctx the parse tree
	 */
	void enterR_public(OracleSQLParser.R_publicContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_public}.
	 * @param ctx the parse tree
	 */
	void exitR_public(OracleSQLParser.R_publicContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_raw}.
	 * @param ctx the parse tree
	 */
	void enterR_raw(OracleSQLParser.R_rawContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_raw}.
	 * @param ctx the parse tree
	 */
	void exitR_raw(OracleSQLParser.R_rawContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_rename}.
	 * @param ctx the parse tree
	 */
	void enterR_rename(OracleSQLParser.R_renameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_rename}.
	 * @param ctx the parse tree
	 */
	void exitR_rename(OracleSQLParser.R_renameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_resource}.
	 * @param ctx the parse tree
	 */
	void enterR_resource(OracleSQLParser.R_resourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_resource}.
	 * @param ctx the parse tree
	 */
	void exitR_resource(OracleSQLParser.R_resourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_revoke}.
	 * @param ctx the parse tree
	 */
	void enterR_revoke(OracleSQLParser.R_revokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_revoke}.
	 * @param ctx the parse tree
	 */
	void exitR_revoke(OracleSQLParser.R_revokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_row}.
	 * @param ctx the parse tree
	 */
	void enterR_row(OracleSQLParser.R_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_row}.
	 * @param ctx the parse tree
	 */
	void exitR_row(OracleSQLParser.R_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_rowid}.
	 * @param ctx the parse tree
	 */
	void enterR_rowid(OracleSQLParser.R_rowidContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_rowid}.
	 * @param ctx the parse tree
	 */
	void exitR_rowid(OracleSQLParser.R_rowidContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_rowlabel}.
	 * @param ctx the parse tree
	 */
	void enterR_rowlabel(OracleSQLParser.R_rowlabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_rowlabel}.
	 * @param ctx the parse tree
	 */
	void exitR_rowlabel(OracleSQLParser.R_rowlabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_rownum}.
	 * @param ctx the parse tree
	 */
	void enterR_rownum(OracleSQLParser.R_rownumContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_rownum}.
	 * @param ctx the parse tree
	 */
	void exitR_rownum(OracleSQLParser.R_rownumContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_rows}.
	 * @param ctx the parse tree
	 */
	void enterR_rows(OracleSQLParser.R_rowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_rows}.
	 * @param ctx the parse tree
	 */
	void exitR_rows(OracleSQLParser.R_rowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_select}.
	 * @param ctx the parse tree
	 */
	void enterR_select(OracleSQLParser.R_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_select}.
	 * @param ctx the parse tree
	 */
	void exitR_select(OracleSQLParser.R_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_session}.
	 * @param ctx the parse tree
	 */
	void enterR_session(OracleSQLParser.R_sessionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_session}.
	 * @param ctx the parse tree
	 */
	void exitR_session(OracleSQLParser.R_sessionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_set}.
	 * @param ctx the parse tree
	 */
	void enterR_set(OracleSQLParser.R_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_set}.
	 * @param ctx the parse tree
	 */
	void exitR_set(OracleSQLParser.R_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_share}.
	 * @param ctx the parse tree
	 */
	void enterR_share(OracleSQLParser.R_shareContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_share}.
	 * @param ctx the parse tree
	 */
	void exitR_share(OracleSQLParser.R_shareContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_size}.
	 * @param ctx the parse tree
	 */
	void enterR_size(OracleSQLParser.R_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_size}.
	 * @param ctx the parse tree
	 */
	void exitR_size(OracleSQLParser.R_sizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_smallint}.
	 * @param ctx the parse tree
	 */
	void enterR_smallint(OracleSQLParser.R_smallintContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_smallint}.
	 * @param ctx the parse tree
	 */
	void exitR_smallint(OracleSQLParser.R_smallintContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_sqlbuf}.
	 * @param ctx the parse tree
	 */
	void enterR_sqlbuf(OracleSQLParser.R_sqlbufContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_sqlbuf}.
	 * @param ctx the parse tree
	 */
	void exitR_sqlbuf(OracleSQLParser.R_sqlbufContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_start}.
	 * @param ctx the parse tree
	 */
	void enterR_start(OracleSQLParser.R_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_start}.
	 * @param ctx the parse tree
	 */
	void exitR_start(OracleSQLParser.R_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_successful}.
	 * @param ctx the parse tree
	 */
	void enterR_successful(OracleSQLParser.R_successfulContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_successful}.
	 * @param ctx the parse tree
	 */
	void exitR_successful(OracleSQLParser.R_successfulContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_synonym}.
	 * @param ctx the parse tree
	 */
	void enterR_synonym(OracleSQLParser.R_synonymContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_synonym}.
	 * @param ctx the parse tree
	 */
	void exitR_synonym(OracleSQLParser.R_synonymContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_sysdate}.
	 * @param ctx the parse tree
	 */
	void enterR_sysdate(OracleSQLParser.R_sysdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_sysdate}.
	 * @param ctx the parse tree
	 */
	void exitR_sysdate(OracleSQLParser.R_sysdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_table}.
	 * @param ctx the parse tree
	 */
	void enterR_table(OracleSQLParser.R_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_table}.
	 * @param ctx the parse tree
	 */
	void exitR_table(OracleSQLParser.R_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_then}.
	 * @param ctx the parse tree
	 */
	void enterR_then(OracleSQLParser.R_thenContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_then}.
	 * @param ctx the parse tree
	 */
	void exitR_then(OracleSQLParser.R_thenContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_to}.
	 * @param ctx the parse tree
	 */
	void enterR_to(OracleSQLParser.R_toContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_to}.
	 * @param ctx the parse tree
	 */
	void exitR_to(OracleSQLParser.R_toContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_trigger}.
	 * @param ctx the parse tree
	 */
	void enterR_trigger(OracleSQLParser.R_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_trigger}.
	 * @param ctx the parse tree
	 */
	void exitR_trigger(OracleSQLParser.R_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_true}.
	 * @param ctx the parse tree
	 */
	void enterR_true(OracleSQLParser.R_trueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_true}.
	 * @param ctx the parse tree
	 */
	void exitR_true(OracleSQLParser.R_trueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_uid}.
	 * @param ctx the parse tree
	 */
	void enterR_uid(OracleSQLParser.R_uidContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_uid}.
	 * @param ctx the parse tree
	 */
	void exitR_uid(OracleSQLParser.R_uidContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_union}.
	 * @param ctx the parse tree
	 */
	void enterR_union(OracleSQLParser.R_unionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_union}.
	 * @param ctx the parse tree
	 */
	void exitR_union(OracleSQLParser.R_unionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_unique}.
	 * @param ctx the parse tree
	 */
	void enterR_unique(OracleSQLParser.R_uniqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_unique}.
	 * @param ctx the parse tree
	 */
	void exitR_unique(OracleSQLParser.R_uniqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_update}.
	 * @param ctx the parse tree
	 */
	void enterR_update(OracleSQLParser.R_updateContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_update}.
	 * @param ctx the parse tree
	 */
	void exitR_update(OracleSQLParser.R_updateContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_user}.
	 * @param ctx the parse tree
	 */
	void enterR_user(OracleSQLParser.R_userContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_user}.
	 * @param ctx the parse tree
	 */
	void exitR_user(OracleSQLParser.R_userContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_validate}.
	 * @param ctx the parse tree
	 */
	void enterR_validate(OracleSQLParser.R_validateContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_validate}.
	 * @param ctx the parse tree
	 */
	void exitR_validate(OracleSQLParser.R_validateContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_values}.
	 * @param ctx the parse tree
	 */
	void enterR_values(OracleSQLParser.R_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_values}.
	 * @param ctx the parse tree
	 */
	void exitR_values(OracleSQLParser.R_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_varchar}.
	 * @param ctx the parse tree
	 */
	void enterR_varchar(OracleSQLParser.R_varcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_varchar}.
	 * @param ctx the parse tree
	 */
	void exitR_varchar(OracleSQLParser.R_varcharContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_varchar2}.
	 * @param ctx the parse tree
	 */
	void enterR_varchar2(OracleSQLParser.R_varchar2Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_varchar2}.
	 * @param ctx the parse tree
	 */
	void exitR_varchar2(OracleSQLParser.R_varchar2Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_view}.
	 * @param ctx the parse tree
	 */
	void enterR_view(OracleSQLParser.R_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_view}.
	 * @param ctx the parse tree
	 */
	void exitR_view(OracleSQLParser.R_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_whenever}.
	 * @param ctx the parse tree
	 */
	void enterR_whenever(OracleSQLParser.R_wheneverContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_whenever}.
	 * @param ctx the parse tree
	 */
	void exitR_whenever(OracleSQLParser.R_wheneverContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_where}.
	 * @param ctx the parse tree
	 */
	void enterR_where(OracleSQLParser.R_whereContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_where}.
	 * @param ctx the parse tree
	 */
	void exitR_where(OracleSQLParser.R_whereContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#r_with}.
	 * @param ctx the parse tree
	 */
	void enterR_with(OracleSQLParser.R_withContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#r_with}.
	 * @param ctx the parse tree
	 */
	void exitR_with(OracleSQLParser.R_withContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_a}.
	 * @param ctx the parse tree
	 */
	void enterK_a(OracleSQLParser.K_aContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_a}.
	 * @param ctx the parse tree
	 */
	void exitK_a(OracleSQLParser.K_aContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_at}.
	 * @param ctx the parse tree
	 */
	void enterK_at(OracleSQLParser.K_atContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_at}.
	 * @param ctx the parse tree
	 */
	void exitK_at(OracleSQLParser.K_atContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_automatic}.
	 * @param ctx the parse tree
	 */
	void enterK_automatic(OracleSQLParser.K_automaticContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_automatic}.
	 * @param ctx the parse tree
	 */
	void exitK_automatic(OracleSQLParser.K_automaticContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_bfile}.
	 * @param ctx the parse tree
	 */
	void enterK_bfile(OracleSQLParser.K_bfileContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_bfile}.
	 * @param ctx the parse tree
	 */
	void exitK_bfile(OracleSQLParser.K_bfileContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_binary_double}.
	 * @param ctx the parse tree
	 */
	void enterK_binary_double(OracleSQLParser.K_binary_doubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_binary_double}.
	 * @param ctx the parse tree
	 */
	void exitK_binary_double(OracleSQLParser.K_binary_doubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_binary_float}.
	 * @param ctx the parse tree
	 */
	void enterK_binary_float(OracleSQLParser.K_binary_floatContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_binary_float}.
	 * @param ctx the parse tree
	 */
	void exitK_binary_float(OracleSQLParser.K_binary_floatContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_binary_integer}.
	 * @param ctx the parse tree
	 */
	void enterK_binary_integer(OracleSQLParser.K_binary_integerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_binary_integer}.
	 * @param ctx the parse tree
	 */
	void exitK_binary_integer(OracleSQLParser.K_binary_integerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_blob}.
	 * @param ctx the parse tree
	 */
	void enterK_blob(OracleSQLParser.K_blobContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_blob}.
	 * @param ctx the parse tree
	 */
	void exitK_blob(OracleSQLParser.K_blobContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_block}.
	 * @param ctx the parse tree
	 */
	void enterK_block(OracleSQLParser.K_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_block}.
	 * @param ctx the parse tree
	 */
	void exitK_block(OracleSQLParser.K_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_boolean}.
	 * @param ctx the parse tree
	 */
	void enterK_boolean(OracleSQLParser.K_booleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_boolean}.
	 * @param ctx the parse tree
	 */
	void exitK_boolean(OracleSQLParser.K_booleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_both}.
	 * @param ctx the parse tree
	 */
	void enterK_both(OracleSQLParser.K_bothContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_both}.
	 * @param ctx the parse tree
	 */
	void exitK_both(OracleSQLParser.K_bothContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_breadth}.
	 * @param ctx the parse tree
	 */
	void enterK_breadth(OracleSQLParser.K_breadthContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_breadth}.
	 * @param ctx the parse tree
	 */
	void exitK_breadth(OracleSQLParser.K_breadthContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_byte}.
	 * @param ctx the parse tree
	 */
	void enterK_byte(OracleSQLParser.K_byteContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_byte}.
	 * @param ctx the parse tree
	 */
	void exitK_byte(OracleSQLParser.K_byteContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_cast}.
	 * @param ctx the parse tree
	 */
	void enterK_cast(OracleSQLParser.K_castContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_cast}.
	 * @param ctx the parse tree
	 */
	void exitK_cast(OracleSQLParser.K_castContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_character}.
	 * @param ctx the parse tree
	 */
	void enterK_character(OracleSQLParser.K_characterContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_character}.
	 * @param ctx the parse tree
	 */
	void exitK_character(OracleSQLParser.K_characterContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_clob}.
	 * @param ctx the parse tree
	 */
	void enterK_clob(OracleSQLParser.K_clobContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_clob}.
	 * @param ctx the parse tree
	 */
	void exitK_clob(OracleSQLParser.K_clobContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_cluster_set}.
	 * @param ctx the parse tree
	 */
	void enterK_cluster_set(OracleSQLParser.K_cluster_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_cluster_set}.
	 * @param ctx the parse tree
	 */
	void exitK_cluster_set(OracleSQLParser.K_cluster_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_connect_by_root}.
	 * @param ctx the parse tree
	 */
	void enterK_connect_by_root(OracleSQLParser.K_connect_by_rootContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_connect_by_root}.
	 * @param ctx the parse tree
	 */
	void exitK_connect_by_root(OracleSQLParser.K_connect_by_rootContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_constraint}.
	 * @param ctx the parse tree
	 */
	void enterK_constraint(OracleSQLParser.K_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_constraint}.
	 * @param ctx the parse tree
	 */
	void exitK_constraint(OracleSQLParser.K_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_count}.
	 * @param ctx the parse tree
	 */
	void enterK_count(OracleSQLParser.K_countContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_count}.
	 * @param ctx the parse tree
	 */
	void exitK_count(OracleSQLParser.K_countContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_cross}.
	 * @param ctx the parse tree
	 */
	void enterK_cross(OracleSQLParser.K_crossContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_cross}.
	 * @param ctx the parse tree
	 */
	void exitK_cross(OracleSQLParser.K_crossContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_cube}.
	 * @param ctx the parse tree
	 */
	void enterK_cube(OracleSQLParser.K_cubeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_cube}.
	 * @param ctx the parse tree
	 */
	void exitK_cube(OracleSQLParser.K_cubeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_cursor}.
	 * @param ctx the parse tree
	 */
	void enterK_cursor(OracleSQLParser.K_cursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_cursor}.
	 * @param ctx the parse tree
	 */
	void exitK_cursor(OracleSQLParser.K_cursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_cycle}.
	 * @param ctx the parse tree
	 */
	void enterK_cycle(OracleSQLParser.K_cycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_cycle}.
	 * @param ctx the parse tree
	 */
	void exitK_cycle(OracleSQLParser.K_cycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_day}.
	 * @param ctx the parse tree
	 */
	void enterK_day(OracleSQLParser.K_dayContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_day}.
	 * @param ctx the parse tree
	 */
	void exitK_day(OracleSQLParser.K_dayContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_dbtimezone}.
	 * @param ctx the parse tree
	 */
	void enterK_dbtimezone(OracleSQLParser.K_dbtimezoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_dbtimezone}.
	 * @param ctx the parse tree
	 */
	void exitK_dbtimezone(OracleSQLParser.K_dbtimezoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_dec}.
	 * @param ctx the parse tree
	 */
	void enterK_dec(OracleSQLParser.K_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_dec}.
	 * @param ctx the parse tree
	 */
	void exitK_dec(OracleSQLParser.K_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_decrement}.
	 * @param ctx the parse tree
	 */
	void enterK_decrement(OracleSQLParser.K_decrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_decrement}.
	 * @param ctx the parse tree
	 */
	void exitK_decrement(OracleSQLParser.K_decrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_dense_rank}.
	 * @param ctx the parse tree
	 */
	void enterK_dense_rank(OracleSQLParser.K_dense_rankContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_dense_rank}.
	 * @param ctx the parse tree
	 */
	void exitK_dense_rank(OracleSQLParser.K_dense_rankContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_depth}.
	 * @param ctx the parse tree
	 */
	void enterK_depth(OracleSQLParser.K_depthContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_depth}.
	 * @param ctx the parse tree
	 */
	void exitK_depth(OracleSQLParser.K_depthContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_dimension}.
	 * @param ctx the parse tree
	 */
	void enterK_dimension(OracleSQLParser.K_dimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_dimension}.
	 * @param ctx the parse tree
	 */
	void exitK_dimension(OracleSQLParser.K_dimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_double}.
	 * @param ctx the parse tree
	 */
	void enterK_double(OracleSQLParser.K_doubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_double}.
	 * @param ctx the parse tree
	 */
	void exitK_double(OracleSQLParser.K_doubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_empty}.
	 * @param ctx the parse tree
	 */
	void enterK_empty(OracleSQLParser.K_emptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_empty}.
	 * @param ctx the parse tree
	 */
	void exitK_empty(OracleSQLParser.K_emptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_end}.
	 * @param ctx the parse tree
	 */
	void enterK_end(OracleSQLParser.K_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_end}.
	 * @param ctx the parse tree
	 */
	void exitK_end(OracleSQLParser.K_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_equals_path}.
	 * @param ctx the parse tree
	 */
	void enterK_equals_path(OracleSQLParser.K_equals_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_equals_path}.
	 * @param ctx the parse tree
	 */
	void exitK_equals_path(OracleSQLParser.K_equals_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_errors}.
	 * @param ctx the parse tree
	 */
	void enterK_errors(OracleSQLParser.K_errorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_errors}.
	 * @param ctx the parse tree
	 */
	void exitK_errors(OracleSQLParser.K_errorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_escape}.
	 * @param ctx the parse tree
	 */
	void enterK_escape(OracleSQLParser.K_escapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_escape}.
	 * @param ctx the parse tree
	 */
	void exitK_escape(OracleSQLParser.K_escapeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_exclude}.
	 * @param ctx the parse tree
	 */
	void enterK_exclude(OracleSQLParser.K_excludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_exclude}.
	 * @param ctx the parse tree
	 */
	void exitK_exclude(OracleSQLParser.K_excludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_extract}.
	 * @param ctx the parse tree
	 */
	void enterK_extract(OracleSQLParser.K_extractContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_extract}.
	 * @param ctx the parse tree
	 */
	void exitK_extract(OracleSQLParser.K_extractContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_first}.
	 * @param ctx the parse tree
	 */
	void enterK_first(OracleSQLParser.K_firstContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_first}.
	 * @param ctx the parse tree
	 */
	void exitK_first(OracleSQLParser.K_firstContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_following}.
	 * @param ctx the parse tree
	 */
	void enterK_following(OracleSQLParser.K_followingContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_following}.
	 * @param ctx the parse tree
	 */
	void exitK_following(OracleSQLParser.K_followingContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_full}.
	 * @param ctx the parse tree
	 */
	void enterK_full(OracleSQLParser.K_fullContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_full}.
	 * @param ctx the parse tree
	 */
	void exitK_full(OracleSQLParser.K_fullContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_grouping}.
	 * @param ctx the parse tree
	 */
	void enterK_grouping(OracleSQLParser.K_groupingContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_grouping}.
	 * @param ctx the parse tree
	 */
	void exitK_grouping(OracleSQLParser.K_groupingContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_hour}.
	 * @param ctx the parse tree
	 */
	void enterK_hour(OracleSQLParser.K_hourContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_hour}.
	 * @param ctx the parse tree
	 */
	void exitK_hour(OracleSQLParser.K_hourContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_ignore}.
	 * @param ctx the parse tree
	 */
	void enterK_ignore(OracleSQLParser.K_ignoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_ignore}.
	 * @param ctx the parse tree
	 */
	void exitK_ignore(OracleSQLParser.K_ignoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_include}.
	 * @param ctx the parse tree
	 */
	void enterK_include(OracleSQLParser.K_includeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_include}.
	 * @param ctx the parse tree
	 */
	void exitK_include(OracleSQLParser.K_includeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_infinite}.
	 * @param ctx the parse tree
	 */
	void enterK_infinite(OracleSQLParser.K_infiniteContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_infinite}.
	 * @param ctx the parse tree
	 */
	void exitK_infinite(OracleSQLParser.K_infiniteContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_inner}.
	 * @param ctx the parse tree
	 */
	void enterK_inner(OracleSQLParser.K_innerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_inner}.
	 * @param ctx the parse tree
	 */
	void exitK_inner(OracleSQLParser.K_innerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_int}.
	 * @param ctx the parse tree
	 */
	void enterK_int(OracleSQLParser.K_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_int}.
	 * @param ctx the parse tree
	 */
	void exitK_int(OracleSQLParser.K_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_interval}.
	 * @param ctx the parse tree
	 */
	void enterK_interval(OracleSQLParser.K_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_interval}.
	 * @param ctx the parse tree
	 */
	void exitK_interval(OracleSQLParser.K_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_iterate}.
	 * @param ctx the parse tree
	 */
	void enterK_iterate(OracleSQLParser.K_iterateContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_iterate}.
	 * @param ctx the parse tree
	 */
	void exitK_iterate(OracleSQLParser.K_iterateContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_join}.
	 * @param ctx the parse tree
	 */
	void enterK_join(OracleSQLParser.K_joinContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_join}.
	 * @param ctx the parse tree
	 */
	void exitK_join(OracleSQLParser.K_joinContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_keep}.
	 * @param ctx the parse tree
	 */
	void enterK_keep(OracleSQLParser.K_keepContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_keep}.
	 * @param ctx the parse tree
	 */
	void exitK_keep(OracleSQLParser.K_keepContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_last}.
	 * @param ctx the parse tree
	 */
	void enterK_last(OracleSQLParser.K_lastContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_last}.
	 * @param ctx the parse tree
	 */
	void exitK_last(OracleSQLParser.K_lastContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_leading}.
	 * @param ctx the parse tree
	 */
	void enterK_leading(OracleSQLParser.K_leadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_leading}.
	 * @param ctx the parse tree
	 */
	void exitK_leading(OracleSQLParser.K_leadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_left}.
	 * @param ctx the parse tree
	 */
	void enterK_left(OracleSQLParser.K_leftContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_left}.
	 * @param ctx the parse tree
	 */
	void exitK_left(OracleSQLParser.K_leftContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_like2}.
	 * @param ctx the parse tree
	 */
	void enterK_like2(OracleSQLParser.K_like2Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_like2}.
	 * @param ctx the parse tree
	 */
	void exitK_like2(OracleSQLParser.K_like2Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_like4}.
	 * @param ctx the parse tree
	 */
	void enterK_like4(OracleSQLParser.K_like4Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_like4}.
	 * @param ctx the parse tree
	 */
	void exitK_like4(OracleSQLParser.K_like4Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_likec}.
	 * @param ctx the parse tree
	 */
	void enterK_likec(OracleSQLParser.K_likecContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_likec}.
	 * @param ctx the parse tree
	 */
	void exitK_likec(OracleSQLParser.K_likecContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_limit}.
	 * @param ctx the parse tree
	 */
	void enterK_limit(OracleSQLParser.K_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_limit}.
	 * @param ctx the parse tree
	 */
	void exitK_limit(OracleSQLParser.K_limitContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_listagg}.
	 * @param ctx the parse tree
	 */
	void enterK_listagg(OracleSQLParser.K_listaggContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_listagg}.
	 * @param ctx the parse tree
	 */
	void exitK_listagg(OracleSQLParser.K_listaggContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_lnnvl}.
	 * @param ctx the parse tree
	 */
	void enterK_lnnvl(OracleSQLParser.K_lnnvlContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_lnnvl}.
	 * @param ctx the parse tree
	 */
	void exitK_lnnvl(OracleSQLParser.K_lnnvlContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_local}.
	 * @param ctx the parse tree
	 */
	void enterK_local(OracleSQLParser.K_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_local}.
	 * @param ctx the parse tree
	 */
	void exitK_local(OracleSQLParser.K_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_locked}.
	 * @param ctx the parse tree
	 */
	void enterK_locked(OracleSQLParser.K_lockedContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_locked}.
	 * @param ctx the parse tree
	 */
	void exitK_locked(OracleSQLParser.K_lockedContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_log}.
	 * @param ctx the parse tree
	 */
	void enterK_log(OracleSQLParser.K_logContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_log}.
	 * @param ctx the parse tree
	 */
	void exitK_log(OracleSQLParser.K_logContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_main}.
	 * @param ctx the parse tree
	 */
	void enterK_main(OracleSQLParser.K_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_main}.
	 * @param ctx the parse tree
	 */
	void exitK_main(OracleSQLParser.K_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_matched}.
	 * @param ctx the parse tree
	 */
	void enterK_matched(OracleSQLParser.K_matchedContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_matched}.
	 * @param ctx the parse tree
	 */
	void exitK_matched(OracleSQLParser.K_matchedContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_maxvalue}.
	 * @param ctx the parse tree
	 */
	void enterK_maxvalue(OracleSQLParser.K_maxvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_maxvalue}.
	 * @param ctx the parse tree
	 */
	void exitK_maxvalue(OracleSQLParser.K_maxvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_measures}.
	 * @param ctx the parse tree
	 */
	void enterK_measures(OracleSQLParser.K_measuresContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_measures}.
	 * @param ctx the parse tree
	 */
	void exitK_measures(OracleSQLParser.K_measuresContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_member}.
	 * @param ctx the parse tree
	 */
	void enterK_member(OracleSQLParser.K_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_member}.
	 * @param ctx the parse tree
	 */
	void exitK_member(OracleSQLParser.K_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_merge}.
	 * @param ctx the parse tree
	 */
	void enterK_merge(OracleSQLParser.K_mergeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_merge}.
	 * @param ctx the parse tree
	 */
	void exitK_merge(OracleSQLParser.K_mergeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_minute}.
	 * @param ctx the parse tree
	 */
	void enterK_minute(OracleSQLParser.K_minuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_minute}.
	 * @param ctx the parse tree
	 */
	void exitK_minute(OracleSQLParser.K_minuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_mivalue}.
	 * @param ctx the parse tree
	 */
	void enterK_mivalue(OracleSQLParser.K_mivalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_mivalue}.
	 * @param ctx the parse tree
	 */
	void exitK_mivalue(OracleSQLParser.K_mivalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_mlslabel}.
	 * @param ctx the parse tree
	 */
	void enterK_mlslabel(OracleSQLParser.K_mlslabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_mlslabel}.
	 * @param ctx the parse tree
	 */
	void exitK_mlslabel(OracleSQLParser.K_mlslabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_model}.
	 * @param ctx the parse tree
	 */
	void enterK_model(OracleSQLParser.K_modelContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_model}.
	 * @param ctx the parse tree
	 */
	void exitK_model(OracleSQLParser.K_modelContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_month}.
	 * @param ctx the parse tree
	 */
	void enterK_month(OracleSQLParser.K_monthContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_month}.
	 * @param ctx the parse tree
	 */
	void exitK_month(OracleSQLParser.K_monthContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_multiset}.
	 * @param ctx the parse tree
	 */
	void enterK_multiset(OracleSQLParser.K_multisetContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_multiset}.
	 * @param ctx the parse tree
	 */
	void exitK_multiset(OracleSQLParser.K_multisetContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_nan}.
	 * @param ctx the parse tree
	 */
	void enterK_nan(OracleSQLParser.K_nanContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_nan}.
	 * @param ctx the parse tree
	 */
	void exitK_nan(OracleSQLParser.K_nanContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_national}.
	 * @param ctx the parse tree
	 */
	void enterK_national(OracleSQLParser.K_nationalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_national}.
	 * @param ctx the parse tree
	 */
	void exitK_national(OracleSQLParser.K_nationalContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_natural}.
	 * @param ctx the parse tree
	 */
	void enterK_natural(OracleSQLParser.K_naturalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_natural}.
	 * @param ctx the parse tree
	 */
	void exitK_natural(OracleSQLParser.K_naturalContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_nav}.
	 * @param ctx the parse tree
	 */
	void enterK_nav(OracleSQLParser.K_navContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_nav}.
	 * @param ctx the parse tree
	 */
	void exitK_nav(OracleSQLParser.K_navContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_nchar}.
	 * @param ctx the parse tree
	 */
	void enterK_nchar(OracleSQLParser.K_ncharContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_nchar}.
	 * @param ctx the parse tree
	 */
	void exitK_nchar(OracleSQLParser.K_ncharContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_nclob}.
	 * @param ctx the parse tree
	 */
	void enterK_nclob(OracleSQLParser.K_nclobContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_nclob}.
	 * @param ctx the parse tree
	 */
	void exitK_nclob(OracleSQLParser.K_nclobContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_nocycle}.
	 * @param ctx the parse tree
	 */
	void enterK_nocycle(OracleSQLParser.K_nocycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_nocycle}.
	 * @param ctx the parse tree
	 */
	void exitK_nocycle(OracleSQLParser.K_nocycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_nulls}.
	 * @param ctx the parse tree
	 */
	void enterK_nulls(OracleSQLParser.K_nullsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_nulls}.
	 * @param ctx the parse tree
	 */
	void exitK_nulls(OracleSQLParser.K_nullsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_numeric}.
	 * @param ctx the parse tree
	 */
	void enterK_numeric(OracleSQLParser.K_numericContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_numeric}.
	 * @param ctx the parse tree
	 */
	void exitK_numeric(OracleSQLParser.K_numericContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_nvarchar}.
	 * @param ctx the parse tree
	 */
	void enterK_nvarchar(OracleSQLParser.K_nvarcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_nvarchar}.
	 * @param ctx the parse tree
	 */
	void exitK_nvarchar(OracleSQLParser.K_nvarcharContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_nvarchar2}.
	 * @param ctx the parse tree
	 */
	void enterK_nvarchar2(OracleSQLParser.K_nvarchar2Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_nvarchar2}.
	 * @param ctx the parse tree
	 */
	void exitK_nvarchar2(OracleSQLParser.K_nvarchar2Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_only}.
	 * @param ctx the parse tree
	 */
	void enterK_only(OracleSQLParser.K_onlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_only}.
	 * @param ctx the parse tree
	 */
	void exitK_only(OracleSQLParser.K_onlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_outer}.
	 * @param ctx the parse tree
	 */
	void enterK_outer(OracleSQLParser.K_outerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_outer}.
	 * @param ctx the parse tree
	 */
	void exitK_outer(OracleSQLParser.K_outerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_over}.
	 * @param ctx the parse tree
	 */
	void enterK_over(OracleSQLParser.K_overContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_over}.
	 * @param ctx the parse tree
	 */
	void exitK_over(OracleSQLParser.K_overContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_partition}.
	 * @param ctx the parse tree
	 */
	void enterK_partition(OracleSQLParser.K_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_partition}.
	 * @param ctx the parse tree
	 */
	void exitK_partition(OracleSQLParser.K_partitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_percent_rank}.
	 * @param ctx the parse tree
	 */
	void enterK_percent_rank(OracleSQLParser.K_percent_rankContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_percent_rank}.
	 * @param ctx the parse tree
	 */
	void exitK_percent_rank(OracleSQLParser.K_percent_rankContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_percentile_cont}.
	 * @param ctx the parse tree
	 */
	void enterK_percentile_cont(OracleSQLParser.K_percentile_contContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_percentile_cont}.
	 * @param ctx the parse tree
	 */
	void exitK_percentile_cont(OracleSQLParser.K_percentile_contContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_percentile_disc}.
	 * @param ctx the parse tree
	 */
	void enterK_percentile_disc(OracleSQLParser.K_percentile_discContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_percentile_disc}.
	 * @param ctx the parse tree
	 */
	void exitK_percentile_disc(OracleSQLParser.K_percentile_discContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_pivot}.
	 * @param ctx the parse tree
	 */
	void enterK_pivot(OracleSQLParser.K_pivotContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_pivot}.
	 * @param ctx the parse tree
	 */
	void exitK_pivot(OracleSQLParser.K_pivotContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_pls_integer}.
	 * @param ctx the parse tree
	 */
	void enterK_pls_integer(OracleSQLParser.K_pls_integerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_pls_integer}.
	 * @param ctx the parse tree
	 */
	void exitK_pls_integer(OracleSQLParser.K_pls_integerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_positive}.
	 * @param ctx the parse tree
	 */
	void enterK_positive(OracleSQLParser.K_positiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_positive}.
	 * @param ctx the parse tree
	 */
	void exitK_positive(OracleSQLParser.K_positiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_preceding}.
	 * @param ctx the parse tree
	 */
	void enterK_preceding(OracleSQLParser.K_precedingContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_preceding}.
	 * @param ctx the parse tree
	 */
	void exitK_preceding(OracleSQLParser.K_precedingContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_precision}.
	 * @param ctx the parse tree
	 */
	void enterK_precision(OracleSQLParser.K_precisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_precision}.
	 * @param ctx the parse tree
	 */
	void exitK_precision(OracleSQLParser.K_precisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_present}.
	 * @param ctx the parse tree
	 */
	void enterK_present(OracleSQLParser.K_presentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_present}.
	 * @param ctx the parse tree
	 */
	void exitK_present(OracleSQLParser.K_presentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_range}.
	 * @param ctx the parse tree
	 */
	void enterK_range(OracleSQLParser.K_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_range}.
	 * @param ctx the parse tree
	 */
	void exitK_range(OracleSQLParser.K_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_read}.
	 * @param ctx the parse tree
	 */
	void enterK_read(OracleSQLParser.K_readContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_read}.
	 * @param ctx the parse tree
	 */
	void exitK_read(OracleSQLParser.K_readContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_real}.
	 * @param ctx the parse tree
	 */
	void enterK_real(OracleSQLParser.K_realContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_real}.
	 * @param ctx the parse tree
	 */
	void exitK_real(OracleSQLParser.K_realContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_reference}.
	 * @param ctx the parse tree
	 */
	void enterK_reference(OracleSQLParser.K_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_reference}.
	 * @param ctx the parse tree
	 */
	void exitK_reference(OracleSQLParser.K_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_regexp_like}.
	 * @param ctx the parse tree
	 */
	void enterK_regexp_like(OracleSQLParser.K_regexp_likeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_regexp_like}.
	 * @param ctx the parse tree
	 */
	void exitK_regexp_like(OracleSQLParser.K_regexp_likeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_reject}.
	 * @param ctx the parse tree
	 */
	void enterK_reject(OracleSQLParser.K_rejectContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_reject}.
	 * @param ctx the parse tree
	 */
	void exitK_reject(OracleSQLParser.K_rejectContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_respect}.
	 * @param ctx the parse tree
	 */
	void enterK_respect(OracleSQLParser.K_respectContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_respect}.
	 * @param ctx the parse tree
	 */
	void exitK_respect(OracleSQLParser.K_respectContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_return}.
	 * @param ctx the parse tree
	 */
	void enterK_return(OracleSQLParser.K_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_return}.
	 * @param ctx the parse tree
	 */
	void exitK_return(OracleSQLParser.K_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_returning}.
	 * @param ctx the parse tree
	 */
	void enterK_returning(OracleSQLParser.K_returningContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_returning}.
	 * @param ctx the parse tree
	 */
	void exitK_returning(OracleSQLParser.K_returningContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_right}.
	 * @param ctx the parse tree
	 */
	void enterK_right(OracleSQLParser.K_rightContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_right}.
	 * @param ctx the parse tree
	 */
	void exitK_right(OracleSQLParser.K_rightContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_rollup}.
	 * @param ctx the parse tree
	 */
	void enterK_rollup(OracleSQLParser.K_rollupContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_rollup}.
	 * @param ctx the parse tree
	 */
	void exitK_rollup(OracleSQLParser.K_rollupContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_rules}.
	 * @param ctx the parse tree
	 */
	void enterK_rules(OracleSQLParser.K_rulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_rules}.
	 * @param ctx the parse tree
	 */
	void exitK_rules(OracleSQLParser.K_rulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_sample}.
	 * @param ctx the parse tree
	 */
	void enterK_sample(OracleSQLParser.K_sampleContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_sample}.
	 * @param ctx the parse tree
	 */
	void exitK_sample(OracleSQLParser.K_sampleContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_scn}.
	 * @param ctx the parse tree
	 */
	void enterK_scn(OracleSQLParser.K_scnContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_scn}.
	 * @param ctx the parse tree
	 */
	void exitK_scn(OracleSQLParser.K_scnContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_search}.
	 * @param ctx the parse tree
	 */
	void enterK_search(OracleSQLParser.K_searchContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_search}.
	 * @param ctx the parse tree
	 */
	void exitK_search(OracleSQLParser.K_searchContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_second}.
	 * @param ctx the parse tree
	 */
	void enterK_second(OracleSQLParser.K_secondContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_second}.
	 * @param ctx the parse tree
	 */
	void exitK_second(OracleSQLParser.K_secondContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_seed}.
	 * @param ctx the parse tree
	 */
	void enterK_seed(OracleSQLParser.K_seedContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_seed}.
	 * @param ctx the parse tree
	 */
	void exitK_seed(OracleSQLParser.K_seedContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_sequential}.
	 * @param ctx the parse tree
	 */
	void enterK_sequential(OracleSQLParser.K_sequentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_sequential}.
	 * @param ctx the parse tree
	 */
	void exitK_sequential(OracleSQLParser.K_sequentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_sessiontimezone}.
	 * @param ctx the parse tree
	 */
	void enterK_sessiontimezone(OracleSQLParser.K_sessiontimezoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_sessiontimezone}.
	 * @param ctx the parse tree
	 */
	void exitK_sessiontimezone(OracleSQLParser.K_sessiontimezoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_sets}.
	 * @param ctx the parse tree
	 */
	void enterK_sets(OracleSQLParser.K_setsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_sets}.
	 * @param ctx the parse tree
	 */
	void exitK_sets(OracleSQLParser.K_setsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_siblings}.
	 * @param ctx the parse tree
	 */
	void enterK_siblings(OracleSQLParser.K_siblingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_siblings}.
	 * @param ctx the parse tree
	 */
	void exitK_siblings(OracleSQLParser.K_siblingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_single}.
	 * @param ctx the parse tree
	 */
	void enterK_single(OracleSQLParser.K_singleContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_single}.
	 * @param ctx the parse tree
	 */
	void exitK_single(OracleSQLParser.K_singleContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_skip}.
	 * @param ctx the parse tree
	 */
	void enterK_skip(OracleSQLParser.K_skipContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_skip}.
	 * @param ctx the parse tree
	 */
	void exitK_skip(OracleSQLParser.K_skipContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_some}.
	 * @param ctx the parse tree
	 */
	void enterK_some(OracleSQLParser.K_someContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_some}.
	 * @param ctx the parse tree
	 */
	void exitK_some(OracleSQLParser.K_someContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_sql}.
	 * @param ctx the parse tree
	 */
	void enterK_sql(OracleSQLParser.K_sqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_sql}.
	 * @param ctx the parse tree
	 */
	void exitK_sql(OracleSQLParser.K_sqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_submultiset}.
	 * @param ctx the parse tree
	 */
	void enterK_submultiset(OracleSQLParser.K_submultisetContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_submultiset}.
	 * @param ctx the parse tree
	 */
	void exitK_submultiset(OracleSQLParser.K_submultisetContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_subpartition}.
	 * @param ctx the parse tree
	 */
	void enterK_subpartition(OracleSQLParser.K_subpartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_subpartition}.
	 * @param ctx the parse tree
	 */
	void exitK_subpartition(OracleSQLParser.K_subpartitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_the}.
	 * @param ctx the parse tree
	 */
	void enterK_the(OracleSQLParser.K_theContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_the}.
	 * @param ctx the parse tree
	 */
	void exitK_the(OracleSQLParser.K_theContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_time}.
	 * @param ctx the parse tree
	 */
	void enterK_time(OracleSQLParser.K_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_time}.
	 * @param ctx the parse tree
	 */
	void exitK_time(OracleSQLParser.K_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_timestamp}.
	 * @param ctx the parse tree
	 */
	void enterK_timestamp(OracleSQLParser.K_timestampContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_timestamp}.
	 * @param ctx the parse tree
	 */
	void exitK_timestamp(OracleSQLParser.K_timestampContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_timezone_hour}.
	 * @param ctx the parse tree
	 */
	void enterK_timezone_hour(OracleSQLParser.K_timezone_hourContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_timezone_hour}.
	 * @param ctx the parse tree
	 */
	void exitK_timezone_hour(OracleSQLParser.K_timezone_hourContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_timezone_minute}.
	 * @param ctx the parse tree
	 */
	void enterK_timezone_minute(OracleSQLParser.K_timezone_minuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_timezone_minute}.
	 * @param ctx the parse tree
	 */
	void exitK_timezone_minute(OracleSQLParser.K_timezone_minuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_timezone_region}.
	 * @param ctx the parse tree
	 */
	void enterK_timezone_region(OracleSQLParser.K_timezone_regionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_timezone_region}.
	 * @param ctx the parse tree
	 */
	void exitK_timezone_region(OracleSQLParser.K_timezone_regionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_timezone_abbr}.
	 * @param ctx the parse tree
	 */
	void enterK_timezone_abbr(OracleSQLParser.K_timezone_abbrContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_timezone_abbr}.
	 * @param ctx the parse tree
	 */
	void exitK_timezone_abbr(OracleSQLParser.K_timezone_abbrContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_to}.
	 * @param ctx the parse tree
	 */
	void enterK_to(OracleSQLParser.K_toContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_to}.
	 * @param ctx the parse tree
	 */
	void exitK_to(OracleSQLParser.K_toContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_trailing}.
	 * @param ctx the parse tree
	 */
	void enterK_trailing(OracleSQLParser.K_trailingContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_trailing}.
	 * @param ctx the parse tree
	 */
	void exitK_trailing(OracleSQLParser.K_trailingContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_trim}.
	 * @param ctx the parse tree
	 */
	void enterK_trim(OracleSQLParser.K_trimContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_trim}.
	 * @param ctx the parse tree
	 */
	void exitK_trim(OracleSQLParser.K_trimContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_type}.
	 * @param ctx the parse tree
	 */
	void enterK_type(OracleSQLParser.K_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_type}.
	 * @param ctx the parse tree
	 */
	void exitK_type(OracleSQLParser.K_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_unbounded}.
	 * @param ctx the parse tree
	 */
	void enterK_unbounded(OracleSQLParser.K_unboundedContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_unbounded}.
	 * @param ctx the parse tree
	 */
	void exitK_unbounded(OracleSQLParser.K_unboundedContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_under_path}.
	 * @param ctx the parse tree
	 */
	void enterK_under_path(OracleSQLParser.K_under_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_under_path}.
	 * @param ctx the parse tree
	 */
	void exitK_under_path(OracleSQLParser.K_under_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_unlimited}.
	 * @param ctx the parse tree
	 */
	void enterK_unlimited(OracleSQLParser.K_unlimitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_unlimited}.
	 * @param ctx the parse tree
	 */
	void exitK_unlimited(OracleSQLParser.K_unlimitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_unpivot}.
	 * @param ctx the parse tree
	 */
	void enterK_unpivot(OracleSQLParser.K_unpivotContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_unpivot}.
	 * @param ctx the parse tree
	 */
	void exitK_unpivot(OracleSQLParser.K_unpivotContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_until}.
	 * @param ctx the parse tree
	 */
	void enterK_until(OracleSQLParser.K_untilContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_until}.
	 * @param ctx the parse tree
	 */
	void exitK_until(OracleSQLParser.K_untilContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_updated}.
	 * @param ctx the parse tree
	 */
	void enterK_updated(OracleSQLParser.K_updatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_updated}.
	 * @param ctx the parse tree
	 */
	void exitK_updated(OracleSQLParser.K_updatedContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_upsert}.
	 * @param ctx the parse tree
	 */
	void enterK_upsert(OracleSQLParser.K_upsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_upsert}.
	 * @param ctx the parse tree
	 */
	void exitK_upsert(OracleSQLParser.K_upsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_urowid}.
	 * @param ctx the parse tree
	 */
	void enterK_urowid(OracleSQLParser.K_urowidContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_urowid}.
	 * @param ctx the parse tree
	 */
	void exitK_urowid(OracleSQLParser.K_urowidContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_using}.
	 * @param ctx the parse tree
	 */
	void enterK_using(OracleSQLParser.K_usingContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_using}.
	 * @param ctx the parse tree
	 */
	void exitK_using(OracleSQLParser.K_usingContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_value}.
	 * @param ctx the parse tree
	 */
	void enterK_value(OracleSQLParser.K_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_value}.
	 * @param ctx the parse tree
	 */
	void exitK_value(OracleSQLParser.K_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_varying}.
	 * @param ctx the parse tree
	 */
	void enterK_varying(OracleSQLParser.K_varyingContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_varying}.
	 * @param ctx the parse tree
	 */
	void exitK_varying(OracleSQLParser.K_varyingContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_versions}.
	 * @param ctx the parse tree
	 */
	void enterK_versions(OracleSQLParser.K_versionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_versions}.
	 * @param ctx the parse tree
	 */
	void exitK_versions(OracleSQLParser.K_versionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_wait}.
	 * @param ctx the parse tree
	 */
	void enterK_wait(OracleSQLParser.K_waitContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_wait}.
	 * @param ctx the parse tree
	 */
	void exitK_wait(OracleSQLParser.K_waitContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_when}.
	 * @param ctx the parse tree
	 */
	void enterK_when(OracleSQLParser.K_whenContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_when}.
	 * @param ctx the parse tree
	 */
	void exitK_when(OracleSQLParser.K_whenContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_within}.
	 * @param ctx the parse tree
	 */
	void enterK_within(OracleSQLParser.K_withinContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_within}.
	 * @param ctx the parse tree
	 */
	void exitK_within(OracleSQLParser.K_withinContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_xml}.
	 * @param ctx the parse tree
	 */
	void enterK_xml(OracleSQLParser.K_xmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_xml}.
	 * @param ctx the parse tree
	 */
	void exitK_xml(OracleSQLParser.K_xmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_year}.
	 * @param ctx the parse tree
	 */
	void enterK_year(OracleSQLParser.K_yearContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_year}.
	 * @param ctx the parse tree
	 */
	void exitK_year(OracleSQLParser.K_yearContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#k_zone}.
	 * @param ctx the parse tree
	 */
	void enterK_zone(OracleSQLParser.K_zoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#k_zone}.
	 * @param ctx the parse tree
	 */
	void exitK_zone(OracleSQLParser.K_zoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(OracleSQLParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(OracleSQLParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#quoted_string}.
	 * @param ctx the parse tree
	 */
	void enterQuoted_string(OracleSQLParser.Quoted_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#quoted_string}.
	 * @param ctx the parse tree
	 */
	void exitQuoted_string(OracleSQLParser.Quoted_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#doublevertbar}.
	 * @param ctx the parse tree
	 */
	void enterDoublevertbar(OracleSQLParser.DoublevertbarContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#doublevertbar}.
	 * @param ctx the parse tree
	 */
	void exitDoublevertbar(OracleSQLParser.DoublevertbarContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#not_equal}.
	 * @param ctx the parse tree
	 */
	void enterNot_equal(OracleSQLParser.Not_equalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#not_equal}.
	 * @param ctx the parse tree
	 */
	void exitNot_equal(OracleSQLParser.Not_equalContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#leq}.
	 * @param ctx the parse tree
	 */
	void enterLeq(OracleSQLParser.LeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#leq}.
	 * @param ctx the parse tree
	 */
	void exitLeq(OracleSQLParser.LeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLParser#geq}.
	 * @param ctx the parse tree
	 */
	void enterGeq(OracleSQLParser.GeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLParser#geq}.
	 * @param ctx the parse tree
	 */
	void exitGeq(OracleSQLParser.GeqContext ctx);
}