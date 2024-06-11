@SuppressWarnings("CheckReturnValue")
public class Interpreter extends PrefixCalculatorBaseVisitor<Double> {

   @Override public Double visitProgram(PrefixCalculatorParser.ProgramContext ctx) {
      Double res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Double visitStat(PrefixCalculatorParser.StatContext ctx) {
      Double res = visit(ctx.expr());
      System.out.println(res);
      return res;
   }

   @Override public Double visitExprPrefix(PrefixCalculatorParser.ExprPrefixContext ctx) {
      Double res = null;
      Double n1 = visit(ctx.expr(0));
      Double n2 = visit(ctx.expr(1));
      String op = ctx.op.getText();
      switch (op) {
         case "+":
            res = n1 + n2;
            break;
         case "-":
            res = n1 - n2;
            break;
         case "*":
            res = n1 * n2;
            break;
         case "/":
            res = n1 / n2;
            break;
      }
      return res;
   }

   @Override public Double visitExprNumber(PrefixCalculatorParser.ExprNumberContext ctx) {
      Double res = Double.parseDouble(ctx.Number().getText());
      return res;
   }
}
