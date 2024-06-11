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
    'input(' STRING ')'                       #ExprInput
    | ID                                    #ExprID
    | STRING                                #ExprString
    ;

ID: [a-zA-Z0-9]+;
STRING: '"' .*? '"';
WS: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]+ -> skip;