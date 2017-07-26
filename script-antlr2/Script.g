class ScriptLexer extends Lexer;

	options {
		k=1; 	// Only 1 lookahead character required
	}

	// Punctuation
	LBRACE : '{';
	RBRACE : '}';
	EQUALS : '=';
	SEMI : ';';

	WS     :
	    (' '
	    | '\t'
	    | '\r' '\n' { newline(); }
	    | '\n'      { newline(); }
	    )
	    { $setType(Token.SKIP); } ;
        LINE_COMMENT :
            '#'
            ( ~('\n'|'\r') )*
            ( '\n'|'\r'('\n')? )?
	    { $setType(Token.SKIP); newline(); } ;
        STRING : ('a'..'z'|'A'..'Z'|'0'..'9'|'_')+
                     | ('"' (~'"')* '"');

class ScriptParser extends Parser;

										 	options {
										 		k=2;     // Need lookahead of two for
										                            // props without keys (to check for the =)
										 		buildAST=true; 	  // Automatically build the AST while parsing
										 	}

										 	script        : (block)* EOF;
										 	block         : (STRING LBRACE (command)* RBRACE);
										 	command       : (STRING (property)* SEMI);
										 	property      : ( (STRING EQUALS)? STRING );
