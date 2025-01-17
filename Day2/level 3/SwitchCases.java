import java.util.Scanner;
public class SwitchCases {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
	
		System.out.println("Enter the first number ");
		double first = input.nextDouble(); //  taking first oprand as input
		System.out.println("Enter the second number ");
		double second = input.nextDouble(); // taking second oprand as input
		System.out.println("Enter an operator (+, -, *, /) ");
		String op = input.next(); // taking operator as input
		
		// Perform specific operations based on the input value of the operator
		switch (op) {
			case "+":
				System.out.println("Result: " + (first + second));
				break;
			case "-":
				System.out.println("Result: " + (first - second));
				break;
			case "*":
				System.out.println("Result: " + (first * second));
				break;
			case "/":

				// Handle division by zero
				if (second != 0) {
					System.out.println("Result: " + (first / second));
				}
				else {
					System.out.println("Division by zero is not allowed.");
				}
				break;

			default:
				System.out.println("Invalid operator.");
				break;
		}

		
		input.close();
	}
}