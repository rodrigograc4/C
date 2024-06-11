import java.io.InputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class pilMain {
   public static void main(String[] args) {
      try {
         
         // create a CharStream that reads from standard input:
         InputStream noCloseInput = new NoCloseInputStream(System.in);
         CharStream input = CharStreams.fromStream(noCloseInput);
         // create a lexer that feeds off of input CharStream:
         pilLexer lexer = new pilLexer(input);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         pilParser parser = new pilParser(tokens);
         // begin parsing at program rule:
         ParseTree tree = parser.program();
         if (parser.getNumberOfSyntaxErrors() == 0) {
            SemanticAnalyzer semanticAnalyzer = new SemanticAnalyzer();
            try {
               String semanticResult = semanticAnalyzer.visit(tree);
               System.out.println("Análise semântica concluída sem erros.");
               
               // Perform execution:
               PILexecute executor = new PILexecute();
               try {
                  String executionResult = executor.visit(tree);
                  System.out.println("Execução concluída sem erros.");
               } catch (RuntimeException e) {
                  System.err.println("Erro na execução: " + e.getMessage());
               }
            } catch (RuntimeException e) {
               System.err.println("Erro na análise semântica: " + e.getMessage());
            }
         }
      } catch (Exception e) {
         e.printStackTrace();
         System.exit(1);
      }
   }
}
