import java.util.Scanner;

public class FractionTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numerator and denominator of the first fraction seperated by a space.");
		int num1 = scan.nextInt();
		int den1 = scan.nextInt();
		
		System.out.println("Enter the numerator and denominator of the second fraction sperated by a space.");
		int num2 = scan.nextInt();
		int den2 = scan.nextInt();
		
		Fraction a = new Fraction(num1, den1);
		Fraction b = new Fraction(num2, den2);
		
		Fraction.addition(a, b);
		Fraction.subtraction(a, b);
		Fraction.multiplication(a, b);
		Fraction.division(a,  b);
	
		scan.close();

	}

}
