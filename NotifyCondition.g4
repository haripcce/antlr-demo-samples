grammar NotifyCondition;

@header {

}

// Words, which include our operators
WORD: ('a'..'z' | 'A'..'Z' | '.')+ ;

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
        : condition
        | LEFT_PAREN orexpression RIGHT_PAREN
        ;

    condition
        : 'true'
        | 'false'
        | 'success'
        | 'failure'
        | 'error'
        | 'changed'
        | 'changed.by.me'
        | 'state.change'
        ;
