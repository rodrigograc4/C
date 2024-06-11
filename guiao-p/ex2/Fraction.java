

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

        return new Fraction(numerador, denominador);
    }

    public Fraction subFraction(Fraction fraction1, Fraction fraction2){
        int numerador = fraction1.numerador*fraction2.denominador - fraction2.numerador*fraction1.denominador;
        int denominador = fraction1.denominador*fraction2.denominador;

        return new Fraction(numerador, denominador);
    }

    public Fraction multFraction (Fraction fraction1, Fraction fraction2){
        int numerador = fraction1.numerador*fraction2.numerador;
        int denominador = fraction1.denominador*fraction2.denominador;

        return new Fraction(numerador, denominador);
    }

    public Fraction divFraction (Fraction fraction1, Fraction fraction2){
        int numerador = fraction1.numerador*fraction2.denominador;
        int denominador = fraction1.denominador*fraction2.numerador;

        Fraction f= new Fraction(numerador,denominador);

        Fraction fs = simplifyFraction(f);

        return fs;
    }


    public Fraction simplifyFraction(Fraction fraction){
        int numerador = fraction.numerador;
        int denominador = fraction.denominador;

        int mcd = mcd(numerador, denominador);

        return new Fraction(numerador/mcd, denominador/mcd);
    }

    private int mcd(int numerador2, int denominador2) {
        int mcd = 1;
        int a = Math.max(numerador2, denominador2);
        int b = Math.min(numerador2, denominador2);
        int resto = a%b;

        while(resto!=0){
            a=b;
            b=resto;
            resto=a%b;
        }

        mcd = b;

        return mcd;
    }

    
    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}