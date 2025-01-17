import java.util.Scanner;

public class DigitFrequency {
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

        // Create a frequency array to count the frequency of each digit (0-9)
        int[] frequency = new int[10];

        // Calculate the frequency of each digit
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++; // Increment the frequency of the digit
        }

        // Display the frequency of each digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) { // Only display digits that appear in the number
                System.out.printf("Digit %d: %d times%n", i, frequency[i]);
            }
        }

        // Close the scanner
        scanner.close();
    }
}