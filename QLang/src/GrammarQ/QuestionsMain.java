import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class QuestionsMain {
   public static void main(String[] args) {
      try {
         // create a CharStream that reads from standard input:
         CharStream input = CharStreams.fromStream(System.in);
         // create a lexer that feeds off of input CharStream:
         QuestionsLexer lexer = new QuestionsLexer(input);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         QuestionsParser parser = new QuestionsParser(tokens);
         // replace error listener:
         //parser.removeErrorListeners(); // remove ConsoleErrorListener
         //parser.addErrorListener(new ErrorHandlingListener());
         // begin parsing at program rule:
         ParseTree tree = parser.program();
         if (parser.getNumberOfSyntaxErrors() == 0) {
            // print LISP-style tree:
            // System.out.println(tree.toStringTree(parser));
            Execute visitor0 = new Execute();
            visitor0.visit(tree);

            // chamar segunda gramtica - respostas

            // OtherGrammarLexer lexer2 = new OtherGrammarLexer(input2);
            // CommonTokenStream tokens2 = new CommonTokenStream(lexer2);
            // OtherGrammarParser parser2 = new OtherGrammarParser(tokens2);
            // ParseTree tree2 = parser2.program();

            // PILexecute visitor2 = new PILexecute();
            // visitor2.visit(tree2);
         }
      }
      catch(IOException e) {
         e.printStackTrace();
         System.exit(1);
      }
      catch(RecognitionException e) {
         e.printStackTrace();
         System.exit(1);
      }
   }
}
