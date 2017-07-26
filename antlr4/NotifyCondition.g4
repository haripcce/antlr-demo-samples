grammar NotifyCondition;

@header {

}

// Words, which include our operators
WORD: ('a'..'z' | 'A'..'Z' | '.'|INT)+ ;
fragment
INT
    :   ('0'..'9')+
    ;
// Grouping
LEFT_PAREN: '(';
RIGHT_PAREN: ')';

WHITESPACE
    : (' ' | '\t' | '\r' | '\n'|'"') -> skip
    ;


    orexpression
        :   andexpression ('or' andexpression)*
        ;

    andexpression
        : notexpression ('and' notexpression)*
        ;

    notexpression
        : ('not')? atom
        ;

    atom
        : condition { System.out.println( "TEXT : [" + getText() + "]" );}
        | LEFT_PAREN orexpression RIGHT_PAREN
        ;

    condition returns [int v]
        : 'true' { v=Integer.valueOf(getText()); }
        | 'false'
        | 'success'
        | 'failure'
        | 'error'
        | 'changed'
        | 'changed.by.me'
        | 'state.change'
        ;
