

public class Fraction {
  
    public int numerador;
    public int denominador;


    public Fraction (int numerador, int denominador){
        this.numerador=numerador;
        this.denominador=denominador;
    }

    public Fraction (int numerador){
        this.numerador=numerador;
        this.denominador=1;
    }

    public Fraction addFraction(Fraction fraction1, Fraction fraction2){
        int numerador = fraction1.numerador*fraction2.denominador + fraction2.numerador*fraction1.denominador;
        int denominador = fraction1.denominador*fraction2.denominador;

        Fraction f= new Fraction(numerador,denominador);
        
        return simpFraction(f);
    }

    public Fraction subFraction(Fraction fraction1, Fraction fraction2){
        int numerador = fraction1.numerador*fraction2.denominador - fraction2.numerador*fraction1.denominador;
        int denominador = fraction1.denominador*fraction2.denominador;

        Fraction f= new Fraction(numerador,denominador);
        
        return simpFraction(f);
    }

    public Fraction multFraction (Fraction fraction1, Fraction fraction2){
        int numerador = fraction1.numerador*fraction2.numerador;
        int denominador = fraction1.denominador*fraction2.denominador;

        Fraction f= new Fraction(numerador,denominador);
        
        return simpFraction(f);
    }

    public Fraction divFraction (Fraction fraction1, Fraction fraction2){
        int numerador = fraction1.numerador*fraction2.denominador;
        int denominador = fraction1.denominador*fraction2.numerador;

        Fraction f= new Fraction(numerador,denominador);

        return simpFraction(f);
    }

    public Fraction simpFraction (Fraction fraction){
        int numerador = fraction.numerador;
        int denominador = fraction.denominador;

        int mdc = mdc(numerador, denominador);

        numerador = numerador/mdc;
        denominador = denominador/mdc;

        Fraction f= new Fraction(numerador,denominador);

        return f;
    }

    public int mdc(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    @Override
    public String toString() {
        if (denominador==1){
            return Integer.toString(numerador);
        }
        return numerador + "/" + denominador;
    }
}