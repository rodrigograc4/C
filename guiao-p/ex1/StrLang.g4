grammar StrLang;

program:
    stat*EOF;

stat:
    print
    | assignment
    ;

print:
    'print' expr
    ;

assignment:
    ID ':' expr
    ;

expr:
    'input(' expr ')'                           #ExprInput
    | expr '/' expr '/' expr                    #ExprReplac
    | '(' expr ')'                              #ExprParen
    | 'trim' expr                               #ExprTrim
    | expr '+' expr                             #ExprConcat
    | expr '-' expr                             #ExprRemove
    | ID                                        #ExprID
    | STRING                                    #ExprString
    ;

ID: [a-zA-Z0-9]+;
STRING: '"' .*? '"';
WS: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]+ -> skip;