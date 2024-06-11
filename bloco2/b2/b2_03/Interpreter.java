@SuppressWarnings("CheckReturnValue")
public class Interpreter extends CalculatorBaseVisitor<Long> {

   @Override public Long visitProgram(CalculatorParser.ProgramContext ctx) {
      Long res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Long visitStat(CalculatorParser.StatContext ctx) {
      Long res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Long visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      Long res = null;
      Long n1 = visit(ctx.expr(0));
      Long n2 = visit(ctx.expr(1));
      Long op = ctx.op.getText();
      switch (op) {
         case '+':
            res = n1 + n2;
            break;
         case '-':
            res = n1 - n2;
            break;
      }
   }

   @Override public Long visitExprParent(CalculatorParser.ExprParentContext ctx) {
      Long res = null;
      Long n = visit(ctx.expr());
      return n;
   }

   @Override public Long visitExprUnary(CalculatorParser.ExprUnaryContext ctx) {
      Long res = null;
      Long n = visit(ctx.expr());
      switch (n) {
         case '+':
            res = n;
            break;
         case '-':
            res = -n;
            break;
      }
   }

   @Override public Long visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      Long res = null;
      return Long.parseLong(ctx.Integer().getText());
   }

   @Override public Long visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      Long res = null;
      Long n1 = visit(ctx.expr(0));
      Long n2 = visit(ctx.expr(1));
      Long op = ctx.op.getText();
      switch (op) {
         case '*':
            res = n1 * n2;
            break;
         case '/':
            res = n1 / n2;
            break;
         case '%':
            res = n1 % n2;
            break;
      }
   }
}
