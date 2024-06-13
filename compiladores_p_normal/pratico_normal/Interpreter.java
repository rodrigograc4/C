import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends VectorBaseVisitor<Vector> {

   private Map<String, Vector> assignments = new HashMap<String, Vector>();

   @Override public Vector visitProgram(VectorParser.ProgramContext ctx) {
      Vector res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Vector visitStat(VectorParser.StatContext ctx) {
      if (ctx.assignment()!=null){
         return visit(ctx.assignment());
      } else if (ctx.show()!=null){
         return visit(ctx.show());
      } else {
         return null;
      }
   }

   @Override public Vector visitShow(VectorParser.ShowContext ctx) {
      if (ctx.expr()!=null){
         System.out.println(visit(ctx.expr()));
         return visit(ctx.expr());
      } else {
         return null;
      }
   }

   @Override public Vector visitAssignment(VectorParser.AssignmentContext ctx) {
      if (ctx.expr()!=null && ctx.ID()!=null){
         String id = ctx.ID().getText();
         Vector vector = visit(ctx.expr());
         assignments.put(id, vector);
         return vector;
      } else {
         return null;
      }
   }

   @Override public Vector visitExprVector(VectorParser.ExprVectorContext ctx) {
      return visit(ctx.vector());
   }


   @Override public Vector visitExprID(VectorParser.ExprIDContext ctx) {
      if (ctx.ID()!=null){
         String id = ctx.ID().getText();
         if (assignments.get(id)!=null){
            return assignments.get(id);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   @Override public Vector visitExprNumber(VectorParser.ExprNumberContext ctx) {
      if (ctx.NUMBER()!=null){
         return new Vector(Double.parseDouble(ctx.NUMBER().getText()));
      } else {
         return null;
      }
   }

   @Override public Vector visitVector(VectorParser.VectorContext ctx) {
      double num1 = Double.parseDouble(ctx.NUMBER(0).getText());

      if (ctx.NUMBER(1) != null){
         double num2 = Double.parseDouble(ctx.NUMBER(1).getText());
         return new Vector(num1, num2);
      } else {
         return new Vector(num1);
      }
   }

   @Override
   public Vector visitEscalar(VectorParser.EscalarContext ctx) {
       double value = Double.parseDouble(ctx.NUMBER().getText());
       return new Vector(value, "escalar");
   }

   @Override public Vector visitExprUnary(VectorParser.ExprUnaryContext ctx) {
      Vector v = visit(ctx.expr());

      if (ctx.op.getText().equals("+")){
         return v;
      } else if (ctx.op.getText().equals("-")){
         return new Vector(-v.num1, -v.num2);
      } else {
         return null;
      }
   }

   @Override public Vector visitExprAddSub(VectorParser.ExprAddSubContext ctx) {
      Vector v1 = visit(ctx.expr(0));
      Vector v2 = visit(ctx.expr(1));

      if (ctx.op.getText().equals("+")){
         return v1.addVector(v1, v2);
      } else if (ctx.op.getText().equals("-")){
         return v1.subVector(v1, v2);
      } else {
         return null;
      }
   }

   @Override public Vector visitExprParen(VectorParser.ExprParenContext ctx) {
      return visit(ctx.expr());
   }
}
