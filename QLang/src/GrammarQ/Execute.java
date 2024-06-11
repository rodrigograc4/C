

import classes.*;
import classes.Tipos.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import .antlr.QuestionsParser;

import java.util.ArrayList;

import .antlr.QuestionsParser;

import GrammarQ..antlr.QuestionsParser;

import .antlr.QuestionsParser;

import GrammarQ..antlr.QuestionsParser;

@SuppressWarnings("CheckReturnValue")
public class Execute extends QuestionsBaseVisitor<Question> {

   HashMap<String, String> questions = new HashMap<>();
   HashMap<String,Question> questionsID = new HashMap<>();
   HashMap<String,Test> tests = new HashMap<>();
   private Test currentTest;

   public void createTest(Student student, String testName) {
        currentTest = new Test(student, testName);
        tests.put(testName, currentTest);
    }

    public void finishTest() {
        currentTest = null;
    }

   @Override public Question visitProgram(QuestionsParser.ProgramContext ctx) {
      Question res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override
   public Question visitCompound(QuestionsParser.CompoundContext ctx) {
      for (QuestionsParser.StatementContext statCtx : ctx.statement()) {
         Question result = visitStatement(statCtx);
         if (result != null) {
               return result;
         }
      }
      return null; 
   }

   @Override
public Question visitStatement(QuestionsParser.StatementContext ctx) {
        
    if (ctx.action() != null) {
        return null;
    } else if (ctx.assignment() != null) {
        return null;
    } else if (ctx.construct() != null) {
        return visitConstruct(ctx.construct());
    } else if (ctx.export() != null) {
        return visitExport(ctx.export());
    } else if (ctx.code() != null) {
        return null;
    } else if (ctx.multiChoice() != null) {
        return visitMultiChoice(ctx.multiChoice());
    } else if (ctx.hole() != null) {
        return visitHole(ctx.hole());
    } else if (ctx.choiceList() != null) {
        return visitChoiceList(ctx.choiceList());
    }
    return null;
   
   }

   // // @Override public Question visitMultiChoice(QuestionsParser.MultiChoiceContext ctx) {
   // //    Question res = null;
   // //    return visitChildren(ctx);
   // //    //return res;
   // // }

   // @Override public Question visitChoiceList(QuestionsParser.ChoiceListContext ctx) {
   //    if (ctx.choice() != null) {
   //       return visitChoice(ctx.choice());
   //    } else if (ctx.choiceList() != null) {
   //       return visitChoiceList(ctx.choiceList());
   //    }
   // }

   // @Override public Question visitChoice(QuestionsParser.ChoiceContext ctx) {
   //    Question res = null;
   //    return visitChildren(ctx);
   //    //return res;
   // }

     // p3

//    @Override public Question visitHole(QuestionsParser.HoleContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }


@Override
    public Question visitConstruct(QuestionsParser.ConstructContext ctx) {

        String id = ctx.ID().getText();
        String variableType = ctx.type().getText();

        questions.put(id, variableType);


        return null;
    }


   @Override public Question visitAcHole(QuestionsParser.AcHoleContext ctx) {
      String id = ctx.ID().getText();

      Question question;
      QuestionType type;

      switch (ctx.getText()) {
         case "hole":
               type = QuestionType.HOLE;
               break;
         case "multi-choice":
               type = QuestionType.MULTI_CHOICE;
               break;
         case "open":
               type = QuestionType.OPEN;
               break;
         case "code-hole":
               type = QuestionType.CODE_HOLE;
               break;
         case "code-open":
               type = QuestionType.CODE_OPEN;
               break;
         case "code-output":
               type = QuestionType.CODE_OUTPUT;
               break;
         default:
               throw new IllegalArgumentException("Unsupported question type: " + ctx.getText());
      }
      question.setId(id);
      question.setQuestionType(type);

      for (QuestionsParser.ContentContext contentCtx : ctx.content()) {
         visitContent(contentCtx);
     }

      return question;
   }

   @Override public Question visitAcpopen(QuestionsParser.AcpopenContext ctx) {
      
        String openId = ctx.ID().getText();
        
        
        for (QuestionsParser.ContentContext contentCtx : ctx.content()) {
            contentBuilder.append(contentCtx.getText()).append(" ");
        }
        String content = contentBuilder.toString().trim();
        
        
        OpenQuestion openQuestion = new OpenQuestion(openId, content);
        
        
       if (currentTest != null) {
                    currentTest.addQuestion(openQuestion);
        }
        
        // Armazenar a questão no hashmap
        questionsID.put(openId, openQuestion);
        
        return openQuestion;
   }

   @Override public Question visitAccode(QuestionsParser.AccodeContext ctx) {
     
        String codeId = ctx.ID().getText();
        
        
        StringBuilder contentBuilder = new StringBuilder();
        for (QuestionsParser.CodeContext codeCtx : ctx.code()) {
            contentBuilder.append(codeCtx.getText()).append(" ");
        }
        String content = contentBuilder.toString().trim();
        
      
        CodeQuestion codeQuestion = new CodeQuestion(codeId, content);
        
        
        if (currentTest != null) {
         currentTest.addQuestion(codeQuestion);
         }
        
        // Armazenar a questão no hashmap
        questionsID.put(codeId, codeQuestion);
        
        return codeQuestion;
   }

   @Override public Question visitAccodeHole(QuestionsParser.AccodeHoleContext ctx) {
     
        String codeHoleId = ctx.ID().getText();
        
        
        StringBuilder contentBuilder = new StringBuilder();
        for (QuestionsParser.CodeContext codeCtx : ctx.code()) {
            contentBuilder.append(codeCtx.getText()).append(" ");
        }
        String content = contentBuilder.toString().trim();
        
        
        CodeHoleQuestion codeHoleQuestion = new CodeHoleQuestion(codeHoleId, content);
        
       
        if (currentTest != null) {
            currentTest.addQuestion(codeHoleQuestion);
        }
        
        return codeHoleQuestion;
   }

   @Override public Question visitAccodeOpen(QuestionsParser.AccodeOpenContext ctx) {
      
        String codeOpenId = ctx.ID().getText();
        
        
        StringBuilder contentBuilder = new StringBuilder();
        for (QuestionsParser.CodeContext codeCtx : ctx.code()) {
            contentBuilder.append(codeCtx.getText()).append(" ");
        }
        String content = contentBuilder.toString().trim();
        
        
        CodeOpenQuestion codeOpenQuestion = new CodeOpenQuestion(codeOpenId, content);
        
        
        if (currentTest != null) {
            currentTest.addQuestion(codeOpenQuestion);
        }
        
        return codeOpenQuestion;
   }

   @Override public Question visitAccodeOutput(QuestionsParser.AccodeOutputContext ctx) {
     
              String codeOutputId = ctx.ID().getText();
              
              
              StringBuilder contentBuilder = new StringBuilder();
              for (QuestionsParser.CodeContext codeCtx : ctx.code()) {
                  contentBuilder.append(codeCtx.getText()).append(" ");
              }
              String content = contentBuilder.toString().trim();
              
              
              CodeOutputQuestion codeOutputQuestion = new CodeOutputQuestion(codeOutputId, content);
              
              
              if (currentTest != null) {
                  currentTest.addQuestion(codeOutputQuestion);
              }
              
              return codeOutputQuestion;
   }

   @Override public Question visitAcmultiChoice(QuestionsParser.AcmultiChoiceContext ctx) {
    
             String multiChoiceId = ctx.ID().getText();
             
            
             List<String> choices = new ArrayList<>();
             for (QuestionsParser.ChoiceContext choiceCtx : ctx.choiceList().choice()) {
                 choices.add(choiceCtx.getText());
             }
             
            
             MultiChoice multiChoiceQuestion = new MultiChoice(multiChoiceId, choices);
             
         
             if (currentTest != null) {
                 currentTest.addQuestion(multiChoiceQuestion);
             }
             
             return multiChoiceQuestion;
   }

    @Override
    public Question visitAcID(QuestionsParser.AcIDContext ctx) {
        String questionId = ctx.ID().getText();
        for (Question q : questions.keySet()) {
            if (q.getId().equals(questionId)) {
                return q;
            }
        }
        return null;
    }

    @Override
    public Question visitAcQuestion(QuestionsParser.AcQuestionContext ctx) {
        String questionId = ctx.ID().getText();
        for (Question q : questions.keySet()) {
            if (q.getId().equals(questionId)) {
                return q;
            }
        }
        return null;
    }
//    @Override public Question visitAcstandardtInput(QuestionsParser.AcstandardtInputContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

//    @Override public Question visitAcexecution(QuestionsParser.AcexecutionContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

//    @Override public Question visitAcEnd(QuestionsParser.AcEndContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

//    @Override public Question visitAcData(QuestionsParser.AcDataContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

//    @Override public Question visitAssignmentID(QuestionsParser.AssignmentIDContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

//    @Override public Question visitAssignmentQuestion(QuestionsParser.AssignmentQuestionContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

//    @Override public Question visitAssignmentString(QuestionsParser.AssignmentStringContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

//    @Override public Question visitAssignmentStandardtInput(QuestionsParser.AssignmentStandardtInputContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

//    @Override public Question visitExprAddSubExpr(QuestionsParser.ExprAddSubExprContext ctx) {
//       
//    }

//    @Override public Question visitExprRead(QuestionsParser.ExprReadContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

@Override
public Question visitExprString(QuestionsParser.ExprStringContext ctx) {
    String stringWithQuotes = ctx.STRING().getText();
    String stringWithoutQuotes = stringWithQuotes.substring(1, stringWithQuotes.length() - 1);
    
    Question question = new Question(stringWithoutQuotes);
    
    return question;
}


//    @Override public Question visitExprComp(QuestionsParser.ExprCompContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

//    @Override public Question visitExprExecution(QuestionsParser.ExprExecutionContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

//    @Override public Question visitExprParentesesExp(QuestionsParser.ExprParentesesExpContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

//    @Override public Question visitExprVerbatim(QuestionsParser.ExprVerbatimContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

//    @Override public Question visitExprAndOr(QuestionsParser.ExprAndOrContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

//    @Override public Question visitExprAddSub(QuestionsParser.ExprAddSubContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

//    @Override public Question visitExprAssigment(QuestionsParser.ExprAssigmentContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

//    @Override public Question visitExprAction(QuestionsParser.ExprActionContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

//    @Override public Question visitExprConversion(QuestionsParser.ExprConversionContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

//    @Override public Question visitExprCreation(QuestionsParser.ExprCreationContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

//    @Override public Question visitExprNumber(QuestionsParser.ExprNumberContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

//    @Override public Question visitExprMultDiv(QuestionsParser.ExprMultDivContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

//    @Override public Question visitExpID(QuestionsParser.ExpIDContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

@Override
public Question visitExprMultDiv(QuestionsParser.ExprMultDivContext ctx) {
   
    Question question0 = visit(ctx.expression(0));
    Question question1 = visit(ctx.expression(1));

   
    if (ctx.expression(0) instanceof QuestionsParser.ExprIDContext) {
        String id = ctx.expression(0).getText();
        if (questionsID.containsKey(id)) {
            question0 = questionsID.get(id);
        }
    }

    if (ctx.expression(1) instanceof QuestionsParser.ExprIDContext) {
        String id = ctx.expression(1).getText();
        if (questionsID.containsKey(id)) {
            question1 = questionsID.get(id);
        }
    }

   
   //  if (ctx.op.getText().equals("*")) {
   //       result= (question0.getAnswer() * question1.getAnswer());
   //      return (question0.getAnswer() * question1.getAnswer());
   //  } else if (ctx.op.getText().equals("/")) {
   //      return question0.divide(question1);
   //  } else {
   //      throw new IllegalArgumentException("Operador inválido em ExprMultDivContext: " + ctx.op.getText());
   //  }

   // errros
}


//    @Override public Question visitCreation(QuestionsParser.CreationContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

//    @Override public Question visitExRun(QuestionsParser.ExRunContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

//    @Override public Question visitExExecute(QuestionsParser.ExExecuteContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

//    @Override public Question visitCodeID(QuestionsParser.CodeIDContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

//    @Override public Question visitCodePrint(QuestionsParser.CodePrintContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

//    @Override public Question visitCodeVerbatim(QuestionsParser.CodeVerbatimContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

//    @Override public Question visitCodeString(QuestionsParser.CodeStringContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

//    @Override public Question visitCodeQuestion(QuestionsParser.CodeQuestionContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

//    @Override public Question visitCodeGradeAnswer(QuestionsParser.CodeGradeAnswerContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

//    @Override public Question visitVerbatim(QuestionsParser.VerbatimContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

//    @Override public Question visitGrade(QuestionsParser.GradeContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

//    @Override public Question visitAnswer(QuestionsParser.AnswerContext ctx) {
//       Question res = null;
//       return visitChildren(ctx);
//       //return res;
//    }

   @Override public Question visitLine(QuestionsParser.LineContext ctx) {
      Question expression = visit(ctx.expression());

      return expression;
   }

@Override
public Question visitContentList(QuestionsParser.ContentListContext ctx) {
    for (QuestionsParser.ContentContext contentCtx : ctx.content()) {
        visitContent(contentCtx);
    }
    
    return null;
}

@Override
public Question visitContent(QuestionsParser.ContentContext ctx) {
    return visitPrint(ctx.print());
}

@Override
public Question visitExport(QuestionsParser.ExportContext ctx) {
    String id = ctx.ID().getText();
    Question expression = visit(ctx.expression());

    String fileName = expression.getAnswer().substring(1, expression.getAnswer().length() - 1);

    try {
        
        Question question = questionsID.get(id);

        if (question != null) {
            
            FileWriter writer = new FileWriter(fileName);

            
            writer.write(id + ": " + question.getAnswer());

            
            writer.close();

            System.out.println("Exported result to file: " + fileName);
        } else {
            System.err.println("Error: Question with ID '" + id + "' not found.");
        }
    } catch (IOException e) {
        System.err.println("Error exporting result to file: " + e.getMessage());
    }

    return null;
}


@Override
public Question visitRead(QuestionsParser.ReadContext ctx) {
    
    Question expression = visit(ctx.expression());

    
    Scanner scanner = new Scanner(System.in);
    System.out.print(expression + ": ");
    String userInput = scanner.nextLine();

    
    scanner.close();

   
    Question question = new Question();
    question.setAnswer(userInput);

    return question;
}

@Override
public Question visitConversion(QuestionsParser.ConversionContext ctx) {
    
    String type = ctx.type().getText();

    return visit(ctx.expression());
}


@Override
public Question visitPrint(QuestionsParser.PrintContext ctx) {
   
    StringBuilder output = new StringBuilder();
    output.append("Print: ");
    boolean firstExpression = true;
    for (QuestionsParser.ExpressionContext expressionCtx : ctx.expression()) {
        if (!firstExpression) {
            output.append(", ");
        } else {
            firstExpression = false;
        }
        output.append(visit(expressionCtx));
    }
    System.out.println(output.toString());
    
    return null;
}


   @Override public Question visitStandardtInput(QuestionsParser.StandardtInputContext ctx) {
      return visit(ctx.expression());
   }
}
