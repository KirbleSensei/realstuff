package week01;

import java.util.Scanner;

public class Workspace {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the coefficient of x^2:");
		
		// Take the input and turn it into a byte
		int coefficent_of_xsquared = input.nextInt();
		//
		System.out.println("Please enter the coefficient of x:");
		int coefficient_of_x = input.nextInt();
		//
		System.out.println("Please enter the constant term:");
		int constant = input.nextInt();

		
		// Calculate discriminant
		int discriminant = (coefficient_of_x * coefficient_of_x) - (4 * coefficent_of_xsquared * constant);
		
		if (discriminant < 0) {
			System.out.println("The discriminant of your equation is: " + discriminant + " hence there are no real solutions");
		}
		else if (discriminant > 0) {
			System.out.println("The discriminant of your equation is: " + discriminant + " hence there are real solutions");
		}
		else if (discriminant == 0) {
			System.out.println("The discriminant of your equation is: " + discriminant + " hence there is one real solution");
		}
		
		
	}
}

