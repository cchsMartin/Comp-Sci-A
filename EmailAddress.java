//Very good
import java.util.Scanner;  
/**
 *Author: Nolan Attreed
 *Date: Sep 24, 2020
 *Description:This code will have users input their full name, birthday, which will return them with their email and temporary password.
 */
public class EmailAddress {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String firstName;
		System.out.println("What is your first name?");
		firstName = keyboard.nextLine();
		String middleName;
		System.out.println("What is your middle name? ");
		middleName = keyboard.nextLine();
		String lastName;
		System.out.println("Finally, what is your last name? ");
		lastName = keyboard.nextLine();
		System.out.println("Your full name is: " + firstName + " " + middleName + " " + lastName);
		String firstInitial = firstName.substring(0, 1).toUpperCase();
		String secondInitial = middleName.substring(0, 1).toUpperCase();
		String birthday;
		System.out.println("Please enter your birthday like so: mm-dd-yyyy");
		birthday = keyboard.nextLine();
		System.out.println("Your birthday is: " + birthday);
		System.out.println("Below is your email and temporary password");
		System.out.println(" ");
		System.out.println("Email: " + lastName.toLowerCase() + firstInitial + secondInitial + "@sharkmail.com");
		System.out.println("Temporary Password: " + birthday.substring(0, 2) + birthday.substring(3, 5) + birthday.substring(6));
		System.out.println("*** This temporary passowrd is very insecure. Please change it immediately! ***");
		keyboard.close();
	}

}
