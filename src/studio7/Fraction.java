public class Fraction {
    private double numerator;
    private double denominator;

    public Fraction(double numeratorInit, double denominatorInit) {
        numerator = numeratorInit;
        denominator = denominatorInit;
    }

    public double numerator() {
        return numerator;
    } 

    public double denominator() {
        return denominator;
    }

    public double sum(Fraction f1, Fraction f2) {
        if (f1.denominator() == f2.denominator()) {
            return ((f1.numerator() + f2.numerator())/f1.denominator());
        } else {
            double newNum = (f1.numerator()*f2.denominator()) + (f2.numerator()*f1.denominator());
            double newDenom = (f1.denominator()*f2.denominator());
            return newNum/newDenom;
        }
    }

    public double multiply(Fraction f1, Fraction f2) {
        double newNum = f1.numerator()*f2.numerator();
        double newDenom = f1.denominator()*f2.denominator();
        return newNum/newDenom;
    }

    public double reciprocal() {
        return denominator/numerator;
    }

    public double simplify() {
        double newFraction = 0.0;
        for (int i = (int)denominator; i>0; i--) {
            if (numerator % i == 0 && denominator % i ==0) {
                numerator = numerator/i;
                denominator = denominator/i;
                newFraction = numerator/denominator;
            } else {
                return newFraction;
            }
        }
        return newFraction;
    }
    public static void main(String[] args) {
        Fraction f1 = new Fraction(10, 4);
        Fraction f2 = new Fraction(3,5);
        System.out.println(f1.sum(f1, f2));
        System.out.println(f1.multiply(f1, f2));
        System.out.println(f1.reciprocal());
        System.out.println(f1.simplify());
        System.out.println(f2.simplify());
    }
}
