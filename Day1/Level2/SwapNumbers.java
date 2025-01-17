import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for number1
        System.out.print("Enter the first number (number1): ");
        int number1 = scanner.nextInt();

        // Taking user input for number2
        System.out.print("Enter the second number (number2): ");
        int number2 = scanner.nextInt();

        // Swapping the numbers
        int temp = number1; // Store number1 in a temporary variable
        number1 = number2;  // Assign number2 to number1
        number2 = temp;     // Assign the value of temp (original number1) to number2

        // Print the swapped output
        System.out.printf("The swapped numbers are %d and %d.%n", number1, number2);

        // Close the scanner
        scanner.close();
    }
}

