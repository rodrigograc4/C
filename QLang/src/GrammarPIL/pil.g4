grammar pil;



program: 
     compound EOF
    ;

compound:
    (stat (';')?)*
    ;

stat:   assignment
        | expr 
        | conditionalStat
        | loopStat 
        | writestat
        ;

assignment: ID ':=' expr                                                                    
            ;

    expr: 
        type '(' expr ')'                                                               #ExprInteger
        | 'read' expr                                                                   #ExprRead
        | expr op=('*'|':'|'%') expr                                                    #ExprMultDiv
        | expr op=('+'|'-') expr                                                        #ExprAddSub
        | 'not' expr                                                                    #ExprNot
        | expr op=('/=' | '>' | '<' | '>=' | '<='| '=') expr                            #ExprEquals
        | expr op=('and' | 'or' | 'xor' | 'implies') expr                               #ExprAndOr
        | expr boolOp expr                                                              #ExprAndThen
        | expr boolOp2 expr                                                             #ExprOrElse        
        |ID                                                                             #ExprID
        | NUMBER                                                                        #ExprNumber
        | STRING                                                                        #ExprString
        | BOOLEAN                                                                       #ExprBoolean
        ;

boolOp:'and' 'then';

boolOp2:'or' 'else';


type:
    'integer'
    | 'boolean'
    | 'string'
    ;

writestat:
    ('write' | 'writeln') expr (',' expr)*               
    ;                         


conditionalStat: 'if' expr 'then' compound ('else' compound)? 'end';                


loopStat: 'loop' compound ('while' |'until') expr 'do' compound 'end';


ID:[a-zA-Z_] [a-zA-Z0-9_]*;
NUMBER: ('+' | '-')? [0-9]+ ('.' [0-9]*)?;
STRING: '"' (~["\r\n])* '"';
BOOLEAN: 'true' | 'false';
WS: [ \t\r\n]+ -> skip;
COMMENT: '--' .*? '\n' -> skip;