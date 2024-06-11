import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends StrLangBaseVisitor<String> {

   private Map<String, String> assignments = new HashMap<String, String>();

   @Override public String visitProgram(StrLangParser.ProgramContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitStat(StrLangParser.StatContext ctx) {
      if (ctx.assignment() != null){
         return visit(ctx.assignment());
      }else if (ctx.print() != null){
         return visit(ctx.print());
      }else{
         return null;
      }
   }

   @Override public String visitPrint(StrLangParser.PrintContext ctx) {
      String string = visit(ctx.expr());

      if (string!=null){
         System.out.println(string);
         return string;
      }else{
         return null;
      }
   }

   @Override public String visitAssignment(StrLangParser.AssignmentContext ctx) {
      String id = ctx.ID().getText();
      String string = visit(ctx.expr());

      assignments.put(id, string);
      
      return string;
   }

   @Override public String visitExprInput(StrLangParser.ExprInputContext ctx) {
      String prompt = ctx.expr().getText();
      String unquotedPrompt = prompt.substring(1, prompt.length() - 1);
      System.out.print(unquotedPrompt);

      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();
      
      if (input!=null){
         return input;
      }else{
         return null;
      }
   }

   @Override public String visitExprID(StrLangParser.ExprIDContext ctx) {
      String id= ctx.ID().getText();

      if ( assignments.get(id) != null){
         return assignments.get(id);
      }else{
         String quotedID= '"'+id+'"';
         System.err.println("ERROR: variable "+quotedID +" not found!");
         return null;
      }
   }

   @Override public String visitExprString(StrLangParser.ExprStringContext ctx) {
      String string = ctx.STRING().getText();
      String subString = string.substring(1, string.length() - 1);
      
      return subString;
   }

   @Override public String visitExprReplac(StrLangParser.ExprReplacContext ctx) {
      String string = visit(ctx.expr(0));
      String oldPart = visit(ctx.expr(1));
      String newPart = visit(ctx.expr(2));

      String newString = string.replace(oldPart, newPart);
      
      return newString;
   }

   @Override public String visitExprConcat(StrLangParser.ExprConcatContext ctx) {
      String string1 = visit(ctx.expr(0));
      String string2 = visit(ctx.expr(1));

      String newString = string1 + string2;
      
      return newString;
   }

   @Override public String visitExprRemove(StrLangParser.ExprRemoveContext ctx) {
      String string = visit(ctx.expr(0));
      String oldPart = visit(ctx.expr(1));

      if (string.contains(oldPart)){
         String newString = string.replace(oldPart, "");
         return newString;
      }else{
         System.err.println("ERROR: "+oldPart+" not found!");
         return null;
      }
   }

   @Override public String visitExprParen(StrLangParser.ExprParenContext ctx) {
      return visit(ctx.expr());
   }

   @Override public String visitExprTrim(StrLangParser.ExprTrimContext ctx) {
      String string = visit(ctx.expr());

      String newString = string.trim();
      
      return newString;
   }
}
