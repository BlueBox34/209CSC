package fraction;

public class Fractiondriver {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, -2);
        Fraction f2 = new Fraction(-7, 13);
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(f1.add(f2));
        System.out.println(f2.subtract(f1));
        System.out.println(f1.multiply(f2));
        System.out.println(f1.divide(f2));
        Fraction f3 = new Fraction(12, 18);
        f3.reduce();
        System.out.println(f3.toString());
        Fraction s1 = new Fraction(5, 0);
        Fraction s2 = new Fraction(3, 12);
        System.out.println(s1.add(s2));
        s1 = new Fraction(-5, 4);
        s2 = new Fraction(5, -4);
        System.out.println(s1.multiply(s2));
    }
}