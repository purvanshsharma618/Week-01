import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Convert the number to a string to easily find the count of digits
        String numberStr = Integer.toString(number);
        int count = numberStr.length(); // Count of digits

        // Create an array to store the digits
        int[] digits = new int[count];

        // Extract digits and store them in the array
        for (int i = 0; i < count; i++) {
            digits[i] = numberStr.charAt(i) - '0'; // Convert char to int
        }

        // Create an array to store the reversed digits
        int[] reversedDigits = new int[count];

        // Reverse the digits
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - 1 - i];
        }

        // Display the reversed digits
        System.out.print("Reversed number: ");
        for (int digit : reversedDigits) {
            System.out.print(digit);
        }
        System.out.println(); // New line for better output formatting

        // Close the scanner
        scanner.close();
    }
}
