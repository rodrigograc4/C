import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;

@SuppressWarnings("CheckReturnValue")
public class PILexecute extends pilBaseVisitor<String> {
   private Map<String,String> memory=new HashMap<>();

   private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

   
   @Override public String visitProgram(pilParser.ProgramContext ctx) {
      String res = null;
      return visitChildren(ctx);
   }

   @Override public String visitCompound(pilParser.CompoundContext ctx) {
      StringBuilder result = new StringBuilder();
      for (pilParser.StatContext statCtx : ctx.stat()) {
            String res = visit(statCtx);
            if (res != null) {
                result.append(res).append("\n");
            }
      }
      return result.toString();
   }

   @Override public String visitStat(pilParser.StatContext ctx) {
        if (ctx.assignment() != null) {
            return visitAssignment(ctx.assignment());
        } else if (ctx.conditionalStat() != null) {
            return visitConditionalStat(ctx.conditionalStat());
        } else if (ctx.loopStat() != null) {
            return visitLoopStat(ctx.loopStat());
        } else if (ctx.writestat() != null) {
            return visitWritestat(ctx.writestat());
        }
        return null;
   }

   @Override public String visitAssignment(pilParser.AssignmentContext ctx) {
      String id = ctx.ID().getText();
      String value = visit(ctx.expr());
      memory.put(id, value);
      
      return value;
   }


   @Override public String visitExprAddSub(pilParser.ExprAddSubContext ctx) {
         String expr0 = visit(ctx.expr(0));
      String expr1 = visit(ctx.expr(1));

      if (ctx.expr(0) instanceof pilParser.ExprIDContext) {
         String id = ctx.expr(0).getText();
         if (memory.containsKey(id)) {
               expr0 = memory.get(id);
         }
      }

      if (ctx.expr(1) instanceof pilParser.ExprIDContext) {
         String id = ctx.expr(1).getText();
         if (memory.containsKey(id)) {
               expr1 = memory.get(id);
         }
      }

      int e1 = Integer.parseInt(expr0);
      int e2 = Integer.parseInt(expr1);
  
      String operator = ctx.op.getText();

      switch (operator) {
         case "+":
            return String.valueOf(e1 + e2);
         case "-":
            return String.valueOf(e1 - e2);
         default:
            throw new IllegalArgumentException("Invalid operator in ExprAddSubContext: " + operator);
      }
   }

   @Override public String visitExprEquals(pilParser.ExprEqualsContext ctx) {
      String expr0 = visit(ctx.expr(0));
      String expr1 = visit(ctx.expr(1));

      
      if (ctx.expr(0) instanceof pilParser.ExprIDContext) {
         String id = ctx.expr(0).getText();
         if (memory.containsKey(id)) {
               expr0 = memory.get(id);
         }
      }

      if (ctx.expr(1) instanceof pilParser.ExprIDContext) {
         String id = ctx.expr(1).getText();
         if (memory.containsKey(id)) {
               expr1 = memory.get(id);
         }
      }

      int e1 = Integer.parseInt(expr0);
      int e2 = Integer.parseInt(expr1);
      String operator = ctx.op.getText();

      boolean result;
      switch(operator){
         case "=":
            result = e1 == e2;
            break;
         case "/=":
            result = e1 != e2;
            break;
         case ">":
            result = e1 > e2;
            break;
         case "<":
            result = e1 < e2;
            break;
         case ">=":
            result = e1 >= e2;
            break;
         case "<=":
            result = e1 <= e2;
            break;
         default:
            throw new RuntimeException("Operador desconhecido: " + operator);
         }
    return String.valueOf(result);
   } 

   @Override
public String visitExprRead(pilParser.ExprReadContext ctx) {
    try {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String prompt = visit(ctx.expr());
        System.out.print(prompt);  
      
         String value = reader.readLine();
            if (value == null || value.isEmpty()) {
               ErrorHandling.printError("Erro value null");
                return "7";
            }
        
        return value;
    } catch (IOException e) {
        ErrorHandling.printError("Erro ao ler entrada" + e.getMessage());
        return "7"; 
    }
}

   
   

   @Override
   public String visitExprString(pilParser.ExprStringContext ctx) {
      String stringWithQuotes = ctx.STRING().getText();
      String stringWithoutQuotes = stringWithQuotes.substring(1, stringWithQuotes.length() - 1);
      return stringWithoutQuotes;
   }

   @Override public String visitExprBoolean(pilParser.ExprBooleanContext ctx) {
      return ctx.BOOLEAN().getText();
   }

   @Override public String visitExprNumber(pilParser.ExprNumberContext ctx) {
       return ctx.NUMBER().getText();
   }

   
   @Override
public String visitExprMultDiv(pilParser.ExprMultDivContext ctx) {
    String expr0 = visit(ctx.expr(0));
    String expr1 = visit(ctx.expr(1));

    
    if (ctx.expr(0) instanceof pilParser.ExprIDContext) {
        String id = ctx.expr(0).getText();
        if (memory.containsKey(id)) {
            expr0 = memory.get(id);
        }
    }

   
    if (ctx.expr(1) instanceof pilParser.ExprIDContext) {
        String id = ctx.expr(1).getText();
        if (memory.containsKey(id)) {
            expr1 = memory.get(id);
        }
    }

    int e1 = Integer.parseInt(expr0);
    int e2 = Integer.parseInt(expr1);
    String operator = ctx.op.getText();

    switch (operator) {
        case "*":
            return String.valueOf(e1 * e2);
        case ":":
            if (e2 == 0) throw new RuntimeException("Divisão por zero");
            return String.valueOf(e1 / e2);
        case "%":
            if (e2 == 0) throw new RuntimeException("Divisão por zero");
            return String.valueOf(e1 % e2);
        default:
            throw new IllegalArgumentException("Invalid operator in ExprMultDivContext: " + operator);
    }
}



   @Override
    public String visitExprInteger(pilParser.ExprIntegerContext ctx) {
        String number=visit(ctx.expr());
        try{
            int value=Integer.parseInt(number);
            return String.valueOf(value);
        }catch(NumberFormatException e){
            throw new RuntimeException("Valor não é um inteiro: "+number);
        }
   }

   @Override public String visitExprNot(pilParser.ExprNotContext ctx) {
      Boolean e = Boolean.parseBoolean(visit(ctx.expr()));
      return String.valueOf(!e);
   }

   @Override public String visitExprAndOr(pilParser.ExprAndOrContext ctx) {
      boolean left = Boolean.parseBoolean(visit(ctx.expr(0)));
      boolean right = Boolean.parseBoolean(visit(ctx.expr(1)));

      String operator = ctx.op.getText();
      boolean result;
      switch (operator) {
         case "and":
            result = left && right;
            break;
         case "or":
            result = left || right;
            break;
         case "and then":
            result = left && right;  
            break;
         case "or else":           
            result = left || right;  
            break;
         case "xor":
            if(left == right)
               result = false;
            else
               result = true;
            break;
         case "implies":
            result = !left || right;
            break;
         default:
            throw new RuntimeException("Operador desconhecido: " + operator);
        }
        return String.valueOf(result);
   }

   @Override public String visitExprID(pilParser.ExprIDContext ctx) {
      return ctx.ID().getText();
   }

   @Override public String visitType(pilParser.TypeContext ctx) {
        if (ctx.getText().equals("integer") || ctx.getText().equals("boolean") || ctx.getText().equals("string")) {
            return ctx.getText();
        }
        throw new RuntimeException("Unknown type: " + ctx.getText());
   }

   @Override
   public String visitWritestat(pilParser.WritestatContext ctx) {
      StringBuilder output = new StringBuilder();
      for (pilParser.ExprContext exprCtx : ctx.expr()) {
         String value = visit(exprCtx);
         if (memory.containsKey(value)) {
               value = memory.get(value);
         }
         output.append(value).append(" ");
      }
      String outputString = output.toString().trim();
      
      
      if (ctx.getChild(0).getText().equals("writeln")) {
         System.out.println(" " +outputString);
      } else {
         System.out.print(" " + outputString);
      }
      
      return null;
   }


   @Override
public String visitConditionalStat(pilParser.ConditionalStatContext ctx) {
    String condition = visit(ctx.expr());
    
    
    
    if (memory.containsKey(condition)) {
        condition = memory.get(condition);
    }
    
    if (condition.equals("true")) {
        return visit(ctx.compound(0));
    } else if (condition.equals("false") && ctx.compound(1) != null) {
        return visit(ctx.compound(1));
    }
    
    return null;
}


@Override
public String visitLoopStat(pilParser.LoopStatContext ctx) {
    visit(ctx.compound(0));
    
    boolean isWhileLoop = ctx.getText().contains("while");
    boolean isUntilLoop = ctx.getText().contains("until");
    
    boolean conditionMet;
    String condition = visit(ctx.expr());
    
    do {
        visit(ctx.compound(1));
        
        if (memory.containsKey(condition)) {
            condition = memory.get(condition);
        }
        
        conditionMet = Boolean.parseBoolean(condition);
    } while ((isWhileLoop && conditionMet) || (isUntilLoop && !conditionMet));
    
    return null;
}

}    