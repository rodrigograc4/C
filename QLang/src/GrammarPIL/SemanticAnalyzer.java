
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("CheckReturnValue")
public class SemanticAnalyzer extends pilBaseVisitor<String> {

   private Map<String, String> symbolTable = new HashMap<>();

   @Override public String visitProgram(pilParser.ProgramContext ctx) {
      return visit(ctx.compound());
   }

   @Override public String visitCompound(pilParser.CompoundContext ctx) {
      String result = null;
      for (pilParser.StatContext stat : ctx.stat()) {
         result = visit(stat);
      }
      return result;
   }

   @Override
   public String visitStat(pilParser.StatContext ctx) {
       if (ctx.assignment() != null) {
           return visitAssignment(ctx.assignment());
       } else if (ctx.expr() != null) {
           return visit(ctx.expr());
       } else if (ctx.conditionalStat() != null) { 
           return visitConditionalStat(ctx.conditionalStat());
       } else if (ctx.loopStat() != null) {
           return visitLoopStat(ctx.loopStat());
         } else if (ctx.writestat() != null) {
            return visitWritestat(ctx.writestat());
       } else {
           return visitChildren(ctx);
       }
   }

   @Override
    public String visitAssignment(pilParser.AssignmentContext ctx) {
        String var = ctx.ID().getText();
        String e = visit(ctx.expr());

        
        if (!symbolTable.containsKey(var)) {
            symbolTable.put(var, e);

        } else {

            String varType = symbolTable.get(var);
            if (!varType.equals(e)) {
               ErrorHandling.printError(ctx,"Type mismatch for variable " + var + ": expected " + varType + " but found " + e);
            }
        }
        return null;
    }

   @Override public String visitExprAddSub(pilParser.ExprAddSubContext ctx) {
      String e1 = visit(ctx.expr(0));
      String e2 = visit(ctx.expr(1));
      if (e1.equals("string") || e2.equals("string") || e1.equals("boolean") || e2.equals("boolean")) {
         ErrorHandling.printError(ctx,"Addition/Subtraction requires integer operands");
      }
      return "int";
   }

   @Override 
   public String visitExprEquals(pilParser.ExprEqualsContext ctx) {
      String e1 = visit(ctx.expr(0));
      String e2 = visit(ctx.expr(1)); 

      if (e1.equals("string") || e2.equals("string") || e1.equals("boolean") || e2.equals("boolean")) {
         ErrorHandling.printError(ctx,"Equality operation requires operands of the same type");
      }

      return "boolean";
   }

   @Override public String visitExprRead(pilParser.ExprReadContext ctx) {
      String exprtype= visit(ctx.expr());

      if (!exprtype.equals("string")){
         ErrorHandling.printError(ctx,"Read operation requires string operand");
      }

      return "string";
   }

   @Override public String visitExprString(pilParser.ExprStringContext ctx) {
      return "string";
   }

   @Override public String visitExprBoolean(pilParser.ExprBooleanContext ctx) {
      return "boolean";
   }

   @Override public String visitExprNumber(pilParser.ExprNumberContext ctx) {
      return "int";
   }

   @Override public String visitExprMultDiv(pilParser.ExprMultDivContext ctx) {
      String e1 = visit(ctx.expr(0));
      String e2 = visit(ctx.expr(1));

      if (e1.equals("string") || e2.equals("string") || e1.equals("boolean") || e2.equals("boolean")) {
         ErrorHandling.printError(ctx,"Multi/div requires integer operands");
      }
      return "int";
   }

   @Override public String visitExprInteger(pilParser.ExprIntegerContext ctx) {
      return visit(ctx.expr());
   }

   @Override public String visitExprNot(pilParser.ExprNotContext ctx) {
      String exprtype=visit(ctx.expr());


      if (!exprtype.equals("boolean") && !exprtype.equals("id")){
         ErrorHandling.printError(ctx,"Not operation requires boolean operand");
      }

      return "boolean";
   }

   @Override public String visitExprAndThen(pilParser.ExprAndThenContext ctx){
      String leftOperandType = visit(ctx.expr(0));
      String rightOperandType = visit(ctx.expr(1));
  
     
      if (!leftOperandType.equals("boolean") || !rightOperandType.equals("boolean")) {
         ErrorHandling.printError(ctx,"Logical AND/OR requires boolean operands");
      }
  
      return "boolean";
   }

   @Override public String visitExprOrElse(pilParser.ExprOrElseContext ctx){
      String leftOperandType = visit(ctx.expr(0));
      String rightOperandType = visit(ctx.expr(1));
  
     
      if (!leftOperandType.equals("boolean") || !rightOperandType.equals("boolean")) {
         ErrorHandling.printError(ctx,"Logical AND/OR requires boolean operands");
      }
  
      return "boolean";
   }

   @Override public String visitExprAndOr(pilParser.ExprAndOrContext ctx) {
      String leftOperandType = visit(ctx.expr(0));
      String rightOperandType = visit(ctx.expr(1));
  
     
      if (!leftOperandType.equals("boolean") || !rightOperandType.equals("boolean")) {
         ErrorHandling.printError(ctx,"Logical AND/OR requires boolean operands");
      }
  
      return "boolean";
   }

   @Override public String visitExprID(pilParser.ExprIDContext ctx) {
      return "id";
   }

   @Override public String visitType(pilParser.TypeContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitWritestat(pilParser.WritestatContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitConditionalStat(pilParser.ConditionalStatContext ctx) {
      String conditionType = visit(ctx.expr());

    
    if (!conditionType.equals("boolean") && !conditionType.equals("id")) {
      ErrorHandling.printError(ctx,"Conditional expression must be a boolean expression");
    }

   
    visit(ctx.compound(0)); 
    if (ctx.compound(1) != null) {
        visit(ctx.compound(1));
    }

    return null;
   }

   @Override public String visitLoopStat(pilParser.LoopStatContext ctx) {
      String conditionType = visit(ctx.expr());

     
      if (!conditionType.equals("boolean")) {
         ErrorHandling.printError(ctx,"Loop condition must be a boolean expression");
      }
  
      visit(ctx.compound(1));
  
      return null;
   }
}
