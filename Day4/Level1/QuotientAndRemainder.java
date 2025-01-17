import java.util.Scanner;

public class QuotientAndRemainder {

    // Method to find the remainder and the quotient of two numbers
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor; // Calculate quotient
        int remainder = number % divisor; // Calculate remainder
        return new int[]{quotient, remainder}; // Return results in an array
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number and divisor
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Check if the divisor is zero to avoid division by zero
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            // Find the quotient and remainder
            int[] result = findRemainderAndQuotient(number, divisor);

            // Output the results
            System.out.printf("Quotient: %d%n", result[0]);
            System.out.printf("Remainder: %d%n", result[1]);
        }

        // Close the scanner
        scanner.close();
    }
}