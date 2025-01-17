import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input and check if it's a natural number
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Error: Please enter a natural number (greater than 0).");
            return; // Exit the program
        }

        // Calculate the maximum size of the odd and even arrays
        int maxArraySize = number / 2 + 1;

        // Initialize arrays for odd and even numbers
        int[] oddNumbers = new int[maxArraySize];
        int[] evenNumbers = new int[maxArraySize];

        // Index variables for odd and even arrays
        int oddIndex = 0;
        int evenIndex = 0;

        // Loop through numbers from 1 to the user-provided number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i; // Store even number and increment evenIndex
            } else {
                oddNumbers[oddIndex++] = i; // Store odd number and increment oddIndex
            }
        }

        // Print the odd numbers array
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        // Print the even numbers array
        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        // Close the scanner
        scanner.close();
    }
}
