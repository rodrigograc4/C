package classes.Tipos;

public class IntegerType extends Type {
   public IntegerType() {
      super("int");
   }

   public boolean isNumeric() {
      return true;
   }
}
