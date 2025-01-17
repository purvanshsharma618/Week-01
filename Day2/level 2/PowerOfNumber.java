import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String[] args) {

	
		Scanner input = new Scanner(System.in);
		
	
		System.out.println("Enter the number ");
		int number = input.nextInt(); //taking number as input
		

		System.out.println("Enter the power ");
		int power = input.nextInt(); //taking power as input
		
		// Initialize the result variable
		int result = 1;
		
		
		for (int i = 1; i <= power; i++) {
			// Multiply the result with the number and assign the value to result 
			result *= number;
		}
	
		
		System.out.println("The result of " + number + " raised to the power of " + power + " is " + result);
	
		
		input.close();
	}
}
