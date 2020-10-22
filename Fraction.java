
public class Fraction {
	public int numerator, denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	public static void addition(Fraction a, Fraction b) {
		System.out.print(a.numerator + "/" + a.denominator + " + " + b.numerator + "/" + b.denominator + " = ");
		int newNumerator = (a.numerator * b.denominator) + (b.numerator * a.denominator);
		int newDenominator = a.denominator * b.denominator;
		System.out.println(newNumerator + "/" + newDenominator);
	}
	public static void subtraction(Fraction a, Fraction b) {
		System.out.print(a.numerator + "/" + a.denominator + " - " + b.numerator + "/" + b.denominator + " = ");
		int newNumerator = (a.numerator * b.denominator) - (b.numerator * a.denominator);
		int newDenominator = a.denominator * b.denominator;
		System.out.println(newNumerator + "/" + newDenominator);
	}
	public static void multiplication(Fraction a, Fraction b) {
		System.out.print(a.numerator + "/" + a.denominator + " x " + b.numerator + "/" + b.denominator + " = ");
		int newNumerator = a.numerator * b.numerator;
		int newDenominator = a.denominator * b.denominator;
		System.out.println(newNumerator + "/" + newDenominator);
	}
	public static void division(Fraction a, Fraction b) {
		System.out.print(a.numerator + "/" + a.denominator + " / " + b.numerator + "/" + b.denominator + " = ");
		int newNumerator = a.numerator * b.denominator;
		int newDenominator = a.denominator * b.numerator;
		System.out.println(newNumerator + "/" + newDenominator);
	}

}
