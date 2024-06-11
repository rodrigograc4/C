import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends FracLangBaseVisitor<Fraction> {
   
   private Map<String, Fraction> assignments = new HashMap<String, Fraction>();

   @Override
   public Fraction visitProgram(FracLangParser.ProgramContext ctx) {
      Fraction res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override
   public Fraction visitStat(FracLangParser.StatContext ctx) {
      Fraction res = null;
      if(ctx.assignment() != null){
         res = visit(ctx.assignment());
      }else if(ctx.display() != null){
         res = visit(ctx.display());
      }
      return res;
   }

   @Override
   public Fraction visitAssignment(FracLangParser.AssignmentContext ctx) {
      String id= ctx.ID().getText();
      Fraction fraction = visit(ctx.expr());

      assignments.put(id, fraction);

      return fraction;

   }

   @Override
   public Fraction visitDisplay(FracLangParser.DisplayContext ctx) {
      Fraction fraction = visit(ctx.expr());

      if (fraction!=null){
         System.out.println(fraction);
         return fraction;
      }else{
         return null;
      }
   }

   @Override
   public Fraction visitExprAddSub(FracLangParser.ExprAddSubContext ctx) {
      Fraction f1=visit(ctx.expr(0));
      Fraction f2=visit(ctx.expr(1));

      if(ctx.op.getText().equals("+")){
         return f1.addFraction(f1, f2);
      }else if(ctx.op.getText().equals("-")){
         return f1.subFraction(f1, f2);
      }else{
         return null;
      }
   }

   @Override
   public Fraction visitExprUnit(FracLangParser.ExprUnitContext ctx) {
      Fraction f=visit(ctx.expr());

      if (ctx.op.getText().equals("+")){

         f.numerador=f.numerador;
      }else if (ctx.op.getText().equals("-")){
         f.numerador=-f.numerador;
      }
      else{
         return null;
      }
      return f;
   }

   @Override
   public Fraction visitExprNumber(FracLangParser.ExprNumberContext ctx) {
      int numerador = Integer.parseInt(ctx.NUMBER().getText());
      Fraction f= new Fraction(numerador);
      return f;
   }

   @Override
   public Fraction visitExprID(FracLangParser.ExprIDContext ctx) {
      String id= ctx.ID().getText();

      if ( assignments.get(id) != null){
         return assignments.get(id);
      }else{
         String quotedID= '"'+id+'"';
         System.err.println("ERROR: variable "+quotedID +" not found!");
         return null;
      }

   }

   @Override
   public Fraction visitExprFrac(FracLangParser.ExprFracContext ctx) {
      return visit(ctx.fraction());
   }

   @Override
   public Fraction visitExprPar(FracLangParser.ExprParContext ctx) {
      return visit(ctx.expr());
   }

   @Override
   public Fraction visitExprMultDiv(FracLangParser.ExprMultDivContext ctx) {
      Fraction f1=visit(ctx.expr(0));
      Fraction f2=visit(ctx.expr(1));

      if(ctx.op.getText().equals("*")){
         return f1.multFraction(f1, f2);
      }else if(ctx.op.getText().equals(":")){
         return f1.divFraction(f1, f2);
      }else{
         return null;
      }
   }

   @Override
   public Fraction visitFraction(FracLangParser.FractionContext ctx) {
      int numerador = Integer.parseInt(ctx.NUMBER(0).getText());
      int denominador = Integer.parseInt(ctx.NUMBER(1).getText());
      Fraction f= new Fraction(numerador, denominador);
      return f;
   }

   @Override
   public Fraction visitExprRead(FracLangParser.ExprReadContext ctx) {
      String prompt = ctx.STRING().getText();
      prompt = prompt.substring(1, prompt.length() - 1);
      System.out.print(prompt+": ");

      Scanner in = new Scanner(System.in);
      String number = in.nextLine();
      
      int frac = Integer.parseInt(number);
      Fraction f = new Fraction(frac);

      if (f!=null){
         return f;
      }else{
         return null;
      }
   }
}
