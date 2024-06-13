grammar FracLang;

program:
    stat*EOF ;
    
stat:
    display ';'
    | assignment ';'
    ;

display:
    'display' expr
    ;

assignment:
    ID '<=' expr
    ;

expr: 
    op=('+' | '-') expr                         #ExprUnit
    | fraction                                  #ExprFrac
    | expr op=('*' | ':') expr                  #ExprMultDiv
    | expr op=('+' | '-') expr                  #ExprAddSub
    | '(' expr ')'                              #ExprPar
    | 'read' STRING                             #ExprRead
    | ID                                        #ExprID
    | NUMBER                                    #ExprNumber
    ;


fraction:
    NUMBER '/' NUMBER
    ;


ID: [a-z]+;
NUMBER: [0-9]+;
STRING: '"' .*? '"';
WS: [ \t\r\n] + -> skip;
COMMENT: '--' ~[\r\n]+ -> skip;