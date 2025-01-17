import java.util.Scanner;
public class GreatestFactor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter an integer ");
		int number = input.nextInt(); //taking number as input
		
		
		int greatestFactor = 1;
		
		// Loop from the last but one till 1
		for (int i = number - 1; i >= 1; i--) {
			
			// Check if the number is perfectly divisible by i
			if (number % i == 0) {
				greatestFactor = i;
				break;
			}
		}
		
		System.out.println("The greatest factor of " + number + " besides itself is " + greatestFactor);
		
		input.close();
	}
}