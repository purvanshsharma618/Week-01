import java.util.Scanner;
public class HarshadNumber {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter an number ");
		int number = input.nextInt(); //taking number as input
		
		
		int sum = 0;
		int originalNumber = number;
		
		// Create a while loop to access each digit of the number
		while (originalNumber != 0) {
		
			// Find the remainder (last digit) using the modulus operator
			int remainder = originalNumber % 10;
			
			// Add the digit to the sum variable
			sum += remainder;
			
			// Remove the last digit from the original number
			originalNumber /= 10;
		}
		
		// Check if the number is perfectly divisible by the sum
		if (number % sum == 0) {
			System.out.println(number + " is a Harshad number.");
		}
		else {
			System.out.println(number + " is not a Harshad number.");
		}
	
		input.close();
	}
}
