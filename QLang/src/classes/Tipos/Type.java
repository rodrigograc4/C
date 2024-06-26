package classes.Tipos;

public abstract class Type
{
   protected final String name;

   protected Type(String name) {
      assert name != null;
      this.name = name;
   }

   public String name() { return name; }

   public boolean conformsTo(Type other) {
      return name.equals(other.name());
    }

    public boolean isText() {
        return false;
    }

    public boolean isCode() {
        return false;
    }

    public boolean isInteger() {
        return false;
    }

    public boolean isNumeric() {
        return false;
    }

    public boolean isBoolean() {
        return false;
    }

   @Override
   public String toString() {
      return name;
   }


}