import static java.lang.System.err;

import java.util.*;

@SuppressWarnings("CheckReturnValue")
public class SemanticAnalyzer extends QuestionsBaseVisitor<String> {

    HashMap<String, String> symbolTable = new HashMap<>();

    @Override
    public String visitProgram(QuestionsParser.ProgramContext ctx) {
        return visit(ctx.compound());

    }

    @Override
    public String visitCompound(QuestionsParser.CompoundContext ctx) {
        String result = null;
        for (QuestionsParser.StatementContext statement : ctx.statement()) {
            result = visit(statement);
        }
        return result;
    }

    @Override
    public String visitStatement(QuestionsParser.StatementContext ctx) {
        if (ctx.assignment() != null) {
            return visit(ctx.assignment());
        } else if (ctx.action() != null) {
            return visit(ctx.action());
        } else if (ctx.construct() != null) {
            return visitConstruct(ctx.construct());
        } else if (ctx.export() != null) {
            return visit(ctx.export());
        } else if (ctx.code() != null) {
            return visit(ctx.code());
        } else if (ctx.multiChoice() != null) {
            return visit(ctx.multiChoice());
        } else if (ctx.hole() != null) {
            return visit(ctx.hole());
        } else if (ctx.choiceList() != null) {
            return visit(ctx.choiceList());
        } else {
            return visitChildren(ctx);
        }
    }

    @Override
    public String visitMultiChoice(QuestionsParser.MultiChoiceContext ctx) {
        //p3
        String res = null;
        return visitChildren(ctx);
        // return res;
    }

    @Override
    public String visitChoiceList(QuestionsParser.ChoiceListContext ctx) {
        //p3
        String res = null;
        return visitChildren(ctx);
        // return res;
    }

    @Override
    public String visitChoice(QuestionsParser.ChoiceContext ctx) {
        //p3
        String res = null;
        return visitChildren(ctx);
        // return res;
    }

    @Override
    public String visitHole(QuestionsParser.HoleContext ctx) {
        //p3
        String res = null;
        return visitChildren(ctx);
        // return res;
    }

    @Override
    public String visitConstruct(QuestionsParser.ConstructContext ctx) {
        String key = ctx.ID().getText();
        String res = visit(ctx.type());

        if (symbolTable.containsKey(key)) {
            if (symbolTable.get(key).equals(res)) {
                ErrorHandling.printError(ctx,"ID already exists");
                return null;
            } else {
                symbolTable.put(key, res);
                return res;
            }
        } else {
            symbolTable.put(key, res);
        }
        return res;
    }

    @Override
    public String visitAcHole(QuestionsParser.AcHoleContext ctx) {
        String id = ctx.ID().getText();
        List<String> res = new ArrayList<>();
        if (id == null) {
            ErrorHandling.printError(ctx,"ID must be a question");
            return null;
        }
        if (!symbolTable.containsKey(id)) {
            symbolTable.put(id, "question");
        } else {
            if (!symbolTable.get(id).equals("question")) {
                ErrorHandling.printError(ctx, "ID must be a question");
                return null;
            }
        }

        for (QuestionsParser.ContentContext content : ctx.content()) {
            String var = visit(content);
            if (var == null) {
                ErrorHandling.printError(ctx,"Content must be a string");
                return null;
            }
            res.add(var);
        }

        return "question";
    }

    @Override
    public String visitAcpopen(QuestionsParser.AcpopenContext ctx) {
        String id = ctx.ID().getText();
        List<String> res = new ArrayList<>();
        if (id == null) {
            ErrorHandling.printError(ctx,"ID must be a question");
            return null;
        }
        if (!symbolTable.containsKey(id)) {
            symbolTable.put(id, "question");
        } else {
            if (!symbolTable.get(id).equals("question")) {
                ErrorHandling.printError(ctx, "ID must be a question");
                return null;
            }
        }

        for (QuestionsParser.ContentContext content : ctx.content()) {
            String var = visit(content);
            if (var == null) {
                ErrorHandling.printError(ctx,"Content must be a string");
                return null;
            }
            res.add(var);
        }
        return "question";
    }

    @Override
    public String visitAccode(QuestionsParser.AccodeContext ctx) {
        String id = ctx.ID().getText();
        List<String> res = new ArrayList<>();
        String var;
        for (QuestionsParser.CodeContext code : ctx.code()) {
            var = visit(code);
            if (var == null) {
                ErrorHandling.printError(ctx,"Code must be a string");
                return null;
            }
            res.add(var);
        }
        if (!symbolTable.containsKey(id)) {
            symbolTable.put(id, "code");
        } else {
            if (!symbolTable.get(id).equals("code")) {
                ErrorHandling.printError(ctx, "ID must be a code");
                return null;
            }
            return "code";
        }
            
        return "code";
        // return res;
    }

    @Override
    public String visitAccodeHole(QuestionsParser.AccodeHoleContext ctx) {
        List<String> CodeList = new ArrayList<>();
        String id = ctx.ID().getText();
        if (id == null ) {
            ErrorHandling.printError(ctx,"ID must valid");
            return null;
        }
        for (QuestionsParser.CodeContext code : ctx.code()) {
            String res = visit(code);
            if (res == null) {
                ErrorHandling.printError(ctx,"Code must be code");
                return null;
            }
            CodeList.add(res);
        }
        if (!symbolTable.containsKey(id)) {
            symbolTable.put(id, "code");
        } else {
            if (!symbolTable.get(id).equals("code")) {
                ErrorHandling.printError(ctx, "ID must be a code");
                return null;
            }
            
            return "code";
        }
        return "code";
    }

    @Override
    public String visitAccodeOpen(QuestionsParser.AccodeOpenContext ctx) {
        //p3
        String res = null;
        return visitChildren(ctx);
        // return res;
    }

    @Override
    public String visitAccodeOutput(QuestionsParser.AccodeOutputContext ctx) {
        //p3
        String res = null;
        return visitChildren(ctx);
        // return res;
    }

    @Override
    public String visitAcmultiChoice(QuestionsParser.AcmultiChoiceContext ctx) {
        //p3
        String res = null;
        return visitChildren(ctx);
        // return res;
    }

    @Override
    public String visitAcID(QuestionsParser.AcIDContext ctx) {
        String key = ctx.ID().getText();

        if (symbolTable.containsKey(key)) {
            return symbolTable.get(key);
        } else {
            ErrorHandling.printError(ctx,"ID not found");
            return null;   
        }
    }


    @Override
    public String visitAcData(QuestionsParser.AcDataContext ctx) {
        //p3
        String res = null;
        return visitChildren(ctx);
        // return res;
    }

    @Override
    public String visitAssignmentID(QuestionsParser.AssignmentIDContext ctx) {
        String key = ctx.ID().getText();
        String value = visit(ctx.expression());
        if (value == null) {
            ErrorHandling.printError(ctx,"Expression not found");
            return null;
        }
        if (symbolTable.containsKey(key)) {
            if (symbolTable.get(key).equals(ctx)) {
                return value;
            } else {
                ErrorHandling.printError(ctx,"ID has the wrong type");
                return null;
            }
        } else {
            symbolTable.put(key, value);
        }

        return value;
    }

    @Override
    public String visitExprUnary(QuestionsParser.ExprUnaryContext ctx) {
         String e1 = visit(ctx.expression());
         if (!e1.equals("integer")) {
            ErrorHandling.printError(ctx,"Unary operator only aplies to integer operands");
         }
         return "integer";
      }

    @Override
    public String visitExprAndOr(QuestionsParser.ExprAndOrContext ctx) {
      String leftOperandType = visit(ctx.expression(0));
      String rightOperandType = visit(ctx.expression(1));
  
     
      if (!leftOperandType.equals("boolean") || !rightOperandType.equals("boolean")) {
         ErrorHandling.printError(ctx,"Logical AND/OR requires boolean operands");
      }
  
      return "boolean";
    }

    @Override
    public String visitExprNumber(QuestionsParser.ExprNumberContext ctx) {
        String res = "integer";
        return res;
    }

    @Override
    public String visitExpID(QuestionsParser.ExpIDContext ctx) {
        String res = ctx.ID().getText();
        if (symbolTable.containsKey(res)) {
            return symbolTable.get(res);
        } else {
            ErrorHandling.printError(ctx,"ID not found");
            return null;
        }
    }

    @Override
    public String visitExprString(QuestionsParser.ExprStringContext ctx) {
        String res = "string";
        return res;
    }


    @Override
    public String visitExprComp(QuestionsParser.ExprCompContext ctx) {
      String e1 = visit(ctx.expression(0));
      String e2 = visit(ctx.expression(1)); 

      if (e1.equals("string") || e2.equals("string") || e1.equals("boolean") || e2.equals("boolean")) {
         ErrorHandling.printError(ctx,"Comp operation requires operands of the same type");
      }

      return "boolean";
    }


    @Override
    public String visitExprMultDiv(QuestionsParser.ExprMultDivContext ctx) {
      String e1 = visit(ctx.expression(0));
      String e2 = visit(ctx.expression(1));

      if (e1.equals("string") || e2.equals("string") || e1.equals("boolean") || e2.equals("boolean")) {
         ErrorHandling.printError(ctx,"Mult/div requires integer operands");
      }
      return "integer";
    }

    @Override
    public String visitExprModDiv(QuestionsParser.ExprModDivContext ctx) {
      String e1 = visit(ctx.expression(0));
      String e2 = visit(ctx.expression(1));

      if (e1.equals("string") || e2.equals("string") || e1.equals("boolean") || e2.equals("boolean")) {
         ErrorHandling.printError(ctx,"Mod/Div requires integer operands");
      }
      return "integer";
    }

    @Override
    public String visitCreation(QuestionsParser.CreationContext ctx) {
        String id = ctx.ID().getText();

        if (id != "OpenQuestion" ) {
            ErrorHandling.printError(ctx,"ID must be OpenQuestion");
            return null;
        }
        return "question";
    }

    @Override
    public String visitExRun(QuestionsParser.ExRunContext ctx) {
        
        String key = ctx.ID().getText();
        if (symbolTable.get(key).equals("code")) {
            return "code";
        } 
        ErrorHandling.printError(ctx,"ID must be code");
        return null;
    }

    @Override
    public String visitExExecute(QuestionsParser.ExExecuteContext ctx) {
        String key = ctx.ID().getText();
        String chave = visitCreation(ctx.creation());

        if (symbolTable.get(key).equals("code")) {
            return "code";
        }
        else if (symbolTable.get(chave).equals("code")) {
            return "code";
        }
        ErrorHandling.printError(ctx," must be code");
        return null;
    }

    @Override
    public String visitCodeID(QuestionsParser.CodeIDContext ctx) {
        // por fazer por causa do verbatim_string
        String exp = visit(ctx.expression());
        if (exp == null) {
            ErrorHandling.printError(ctx,"Expression not found");
            return null;
        }
        String V_String = ctx.VERBATIM_STRING().getText();

        if (V_String == null) {
            ErrorHandling.printError(ctx,"Verbatim string not found");
            return null;
        }

        return exp;

    }

    @Override
    public String visitCodeString(QuestionsParser.CodeStringContext ctx) {
      String exp = visit(ctx.expression());
        if (exp == null) {
            ErrorHandling.printError(ctx,"Expression must be a code");
             return null;
        }
        return exp;
    }

    @Override
    public String visitCodeQuestion(QuestionsParser.CodeQuestionContext ctx) {
        // code may not be there but if it is, do a for

        String id = ctx.ID().getText();
        if (id == null) {
            ErrorHandling.printError(ctx,"ID must be a question");
            return null;
        }

        if (symbolTable.containsKey(id)) {
            if (symbolTable.get(id).equals("code")) {
                return "code";
            } else {
                ErrorHandling.printError(ctx,"ID must be a code");
                return null;
            }
        } else {
            symbolTable.put(id, "code");
        }
        return "question";
    }

    @Override
    public String visitCodeGradeAnswer(QuestionsParser.CodeGradeAnswerContext ctx) {
        String grade = visit(ctx.grade());
        String answer = visit(ctx.answer());
        if (grade == null || answer == null) {
            ErrorHandling.printError(ctx,"Grade and answer must be valid");
            return null;
        }
        return "code";
    }

    @Override
    public String visitGrade(QuestionsParser.GradeContext ctx) {
        String exp = visit(ctx.expression());
        if (exp == null) {
            ErrorHandling.printError(ctx,"Expression not found");
            return null;
        }
        return exp;
    }

    @Override
    public String visitAnswer(QuestionsParser.AnswerContext ctx) {
        String exp = visit(ctx.expression());
        String line = visit(ctx.line());
        if (exp == null) {
            ErrorHandling.printError(ctx,"Expression not found");
            return null;
        }
        return exp;
    }

    @Override
    public String visitContentList(QuestionsParser.ContentListContext ctx) {
        //p3
        String res = null;
        return visitChildren(ctx);
        // return res;
    }

    @Override
    public String visitContent(QuestionsParser.ContentContext ctx) {
        String res = null;
        //p3 
        return visitChildren(ctx);
        // return res;
    }

    @Override
    public String visitExport(QuestionsParser.ExportContext ctx) {
        String id = ctx.ID().getText();
        String res = visit(ctx.expression());

        if (res == null) {
            ErrorHandling.printError(ctx,"Expression not found");
            return null;
        }

        if (!res.equals("string")) {
            ErrorHandling.printError(ctx,"Expression must be a string");
            return null;
        }
        
        return res;
    }

    @Override
    public String visitRead(QuestionsParser.ReadContext ctx) {
        String res = visit(ctx.expression());
        if (res == null) {
            ErrorHandling.printError(ctx,"Expression not found");
            return null;
        }
        return res;
    }

    @Override
    public String visitConversion(QuestionsParser.ConversionContext ctx) {
        String type = visit(ctx.type());
        String expr = visit(ctx.expression());
        if (type == null || expr == null) {
            ErrorHandling.printError(ctx,"Type and expression must be valid");
            return null;
        }
        return type;
        // return res;
    }

    @Override
    public String visitPrint(QuestionsParser.PrintContext ctx) {
        List<String> res = new ArrayList<>();
        String var;
        for (QuestionsParser.ExpressionContext expression : ctx.expression()) {
            if (ctx.expression() == null) {
                ErrorHandling.printError(ctx,"Expression not found");
                return null;
            } else {
                var = visit(expression);
                res.add(var);
            }
        }
        return "string";
    }

    @Override
    public String visitStandardtInput(QuestionsParser.StandardtInputContext ctx) {
        String res = visit(ctx.expression());
        return res;
    }

    @Override
    public String visitTypeQuestion(QuestionsParser.TypeQuestionContext ctx) {
        String res = "question";
        return res;
    }

    @Override
    public String visitTypeFraction(QuestionsParser.TypeFractionContext ctx) {
        String res = "fraction";
        return res;
    }

    @Override
    public String visitTypeText(QuestionsParser.TypeTextContext ctx) {
        String res = "text";
        return res;
    }

    @Override
    public String visitTypeInteger(QuestionsParser.TypeIntegerContext ctx) {
        String res = "integer";
        return res;
    }

    @Override
    public String visitTypeCode(QuestionsParser.TypeCodeContext ctx) {
        String res = "code";
        return res;
    }
}
