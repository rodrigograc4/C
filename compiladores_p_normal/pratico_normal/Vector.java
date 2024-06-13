
public class Vector {

    public double num1;
    public double num2;
    private String escalar;

    public Vector (double num1, double num2){
        this.num1=num1;
        this.num2=num2;
    }

    public Vector (double num1){
        this.num1=num1;
    }

    public Vector (double num1, String escalar){
        this.num1=num1;
        this.escalar=escalar;
    }

    public Vector addVector(Vector vec1, Vector vec2){
        double num1 = vec1.num1 + vec2.num1;

        if (vec1.num2 == 0.0 && vec2.num2 == 0.0) {
            Vector v = new Vector(num1);
            return v;
        } else if (vec1.escalar != null && vec2.escalar != null) {
            Vector v= new Vector(num1, "escalar");
            return v;
        } else{
            double num2 = vec1.num2 + vec2.num2;
            Vector v = new Vector(num1, num2);
            return v;
        }
    }

    public Vector subVector(Vector vec1, Vector vec2){
        double num1 = vec1.num1 - vec2.num1;

        if (vec1.num2 == 0.0 && vec2.num2 == 0.0) {
            Vector v = new Vector(num1);
            return v;
        } else if (vec1.escalar != null && vec2.escalar != null) {
            Vector v= new Vector(num1, "escalar");
            return v;
        } else{
            double num2 = vec1.num2 - vec2.num2;
            Vector v = new Vector(num1, num2);
            return v;
        }
    } 


    @Override
    public String toString() {
        if (num2 != 0.0) {
            return "[" + num1 + ", " + num2 + "]";
        } else if (escalar != null) {
            return Double.toString(num1);
        } else {
            return "[" + num1 + "]";
        }
    }
}
