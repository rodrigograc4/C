grammar Calculator;

program:
    stat* EOF
    ;
stat:
    assignment? NEWLINE
    expr? NEWLINE
    ;
assignment:
    ID '=' expr;
expr:
    expr op = ('*' | '/' | '%') expr          #ExprMultDivMod
    | expr op = ('+' | '-') expr              #ExprAddSub
    | Integer                                 #ExprInteger
    | '(' expr ')'                            #ExprParent
    | op = ('+' | '-') expr                   #ExprUnary
    | ID                                      #ExprId
    ;

ID: [a-zA-Z_]+ ;
Integer: [0-9]+ ;
NEWLINE: '\r'? '\n';
WS: [ \t] + -> skip;
COMMENT: '#' .*? '\n'-> skip;