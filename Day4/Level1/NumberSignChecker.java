import java.util.Scanner;

public class NumberSignChecker {

    // Method to check the sign of the number
    public static int checkNumberSign(int number) {
        if (number > 0) {
            return 1; // Positive number
        } else if (number < 0) {
            return -1; // Negative number
        } else {
            return 0; // Zero
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check the sign of the number using the method
        int result = checkNumberSign(number);

        // Output the result
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Close the scanner
        scanner.close();
    }
}