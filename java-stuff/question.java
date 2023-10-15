package week01;

import java.util.Scanner;

public class StringMani {
	
	public static double suvat(double [] array) {
		double distance = (u * t) + ((1/2) * a * t * t);
 		return distance;
		
	}
	
	public static void main(String[] args){
		
		double nums[] = new double[10];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter u, t and a");
		
		String[] NumberArray;
		
		NumberArray = input.nextLine().split(" ");
		
		for (int i = 0; i < NumberArray.length; i++) {
			nums[i] = Double.parseDouble(NumberArray[i]);
		}
		
		for (int i = 0; i < NumberArray.length; i++) {
			System.out.println(nums[i]);
		}
		
		

		
		
			
	}

}
