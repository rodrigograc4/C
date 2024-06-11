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
    ID                                          #ExprID
    | NUMBER                                    #ExprNumber
    | op=('+' | '-') expr                     #ExprUnit
    | fraction                                  #ExprFrac
    | expr op=('*' | ':') expr                #ExprMultDiv
    | expr op=('+' | '-') expr                #ExprAddSub
    | '(' expr ')'                              #ExprPar
    ;


fraction:
    NUMBER '/' NUMBER
    ;


ID: [a-z]+;
NUMBER: [0-9]+;
WS: [ \t\r\n] + -> skip;
COMMENT: '--' ~[\r\n]+ -> skip;