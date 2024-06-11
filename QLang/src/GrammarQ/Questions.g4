grammar Questions;

program: compound EOF;

compound: (statement ';'?)* ;

statement: action 
         | assignment 
         | construct 
         | export 
         | code 
         | multiChoice 
         | hole
         | choiceList
         ;

multiChoice: 'multi-choice' ID 'is' choiceList 'end'
            | standardtInput
            | execution
            | expression;

choiceList:   choice ('|' choice)*
            | choice (';' choice)*
            | choice (',' choice)* 
            | choice ('/' choice)*
;

choice: expression
      ;

hole: 'hole' ID 'is' (contentList )+ 'end'
      | expression;

construct: ID ':' type;

action: 'hole' ID 'is' (content )+ 'end'                                            #AcHole
       | 'open' ID 'is' (content )+ 'end'                                           #Acpopen 
       | 'code' ID 'is' (code )+ 'end'                                              #Accode 
       | 'code-hole' ID 'is' (code )+ 'end'                                         #AccodeHole
       | 'code-open' ID 'is' (code )+ 'end'                                         #AccodeOpen
       | 'code-output' ID 'is' (code )+ 'end'                                       #AccodeOutput
       | 'multi-choice' ID 'is' choiceList 'end'                                    #AcmultiChoice 
       | ID                                                                         #AcID
       |'multi-choice'+(ID) 'is'                                                    #AcQuestion
       | standardtInput                                                             #AcstandardtInput
       | execution                                                                  #Acexecution
       | 'end'                                                                      #AcEnd
       | NUMBER '/' NUMBER ','?                                                     #AcData
       ;

assignment: ID (('->' '":="') | ':=') expression standardtInput?                    #AssignmentID 
          | ID                                                                      #AssignmentQuestion
          | STRING                                                                  #AssignmentString
          | standardtInput                                                          #AssignmentStandardtInput
          ; 

expression: op=('-'|'+') expression                                                 #ExprUnary     
          | expression op=( '*' | '/' ) expression                                  #ExprMultDiv  
          | expression op=( ':' | '%' ) expression                                  #ExprModDiv
          | expression op=( '+' | '-' ) expression                                  #ExprAddSubExpr 
          | expression op=( '==' | '!=' | '<' | '<=' | '>' | '>=' ) expression      #ExprComp    
          | expression op=( '&&' | '||' ) expression                                #ExprAndOr
          | creation                                                                #ExprCreation     
          | execution                                                               #ExprExecution     
          | action                                                                  #ExprAction     
          | read                                                                    #ExprRead     
          | conversion                                                              #ExprConversion     
          | assignment                                                              #ExprAssigment     
          | verbatim                                                                #ExprVerbatim     
          | STRING                                                                  #ExprString     
          | ID                                                                      #ExpID     
          | '(' expression ')'                                                      #ExprParentesesExp     
          | NUMBER                                                                  #ExprNumber 
          ;

creation: 'new' ID;

execution: 'run' ID                                                                 #ExRun        
         | 'execute' (ID|creation)                                                  #ExExecute   
         ;


code: 'code' expression 'is' VERBATIM_STRING 'end'                                   #CodeID     
     | print ';'                                                                    #CodePrint          
     | expression                                                                   #CodeVerbatim          
     | 'uses code from' expression 'end' ';'?                                       #CodeString     
     | 'uses code' ID code* 'end' ';'?                                              #CodeQuestion          
     | grade ',' answer ';'?                                                        #CodeGradeAnswer  
     ;

verbatim: VERBATIM_STRING;

grade: expression;

answer: expression line?;

line: 'line' expression;

contentList: content (',' content)*;

content: print;

export: 'export' ID 'to' expression;

read: 'read' expression;

conversion: type '(' expression ')';

print: 'println' expression (','? expression)*;


standardtInput: '|' expression;

type:   'question'                                                                  #TypeQuestion                  
      | 'fraction'                                                                  #TypeFraction
      | 'text'                                                                      #TypeText
      | 'integer'                                                                   #TypeInteger
      | 'code'                                                                      #TypeCode
      ;

ID: ([A-Z]|[a-z])([A-Z]|[a-z]|'.'|[0-9])*;
NUMBER: [0-9]+('.'[0-9]+)?;

WS: [ \t\r\n]+ -> skip;
COMMENT: '#' .*? '\n' -> skip;
VERBATIM_STRING: '"[' .*? ']"';
STRING: '"' ~'"'* '"';
ERROR: .;

