import java.util.Scanner;

public class Workspace {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the coefficient of x^2:");
		
		// Take the input and turn it into a byte
		String coefficent_of_xsquared = input.nextLine();
		byte a = Byte.parseByte(coefficent_of_xsquared);
		//
		System.out.println("Please enter the coefficient of x:");
		String coefficient_of_x = input.nextLine();
		byte b = Byte.parseByte(coefficient_of_x);
		//
		System.out.println("Please enter the constant term:");
		String constant = input.nextLine();
		byte c = Byte.parseByte(constant);
		
		// Calculate discriminant
		int discriminant = (b * b) - (4 * a * c);
		
		System.out.println("The discriminant of your equation is: " + discriminant);
		
	}
}
