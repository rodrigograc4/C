grammar Vector;

program:
    stat*EOF
    ;

stat:
    show ';'
    | assignment ';'
    ;

show:
    'show' expr
    ;

assignment:
    expr '->' ID
    ;

expr:
    op=('+' | '-') expr                             #ExprUnary
    | expr op=('+' | '-') expr                      #ExprAddSub
    | vector                                        #ExprVector
    | escalar                                       #ExprEscalar
    | '(' expr ')'                                  #ExprParen
    | ID                                            #ExprID
    | NUMBER                                        #ExprNumber
    ;

vector:
    '[' NUMBER (',' NUMBER)* ']'
    ;

escalar:
    NUMBER
    ;

ID: [a-zA-Z][a-zA-Z0-9]*;
NUMBER: [0-9]+ ('.' [0-9]+)?;
WS: [ \t\r\n]+ -> skip;
COMMENT: '#' ~[ \r\n]+ -> skip;


