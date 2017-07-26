header {
    
}

class NotifyConditionLexer extends Lexer;
options { k=2;  }
// Words, which include our operators
WORD: ( 'a'..'z' | 'A'..'Z' | '.'| INT )+ ;
protected
INT
    :   ('0'..'9')
    ;
// Grouping
LEFT_PAREN: '(';
RIGHT_PAREN: ')';

WHITESPACE
    : (' ' | '\t' | '\r' | '\n') { $setType(Token.SKIP); }
    ;
class NotifyConditionParser extends Parser;

    options {
            buildAST=true;
    }

    orexpression
        :   andexpression ("or"^ andexpression)*
        ;

    andexpression
        : notexpression ("and"^ notexpression)*
        ;

    notexpression
        : ("not"^)? atom
        ;

    atom
        : condition
        | LEFT_PAREN! orexpression RIGHT_PAREN!
        ;

    condition
        : "true"
        | "false"
        | "success"
        | "failure"
        | "error"
        | "changed"
        | "changed.by.me"
        | "state.change"
        ;

