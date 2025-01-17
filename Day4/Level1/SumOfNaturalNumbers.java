import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to find the sum of n natural numbers using a loop
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0; // Initialize sum to 0
        for (int i = 1; i <= n; i++) {
            sum += i; // Add each natural number to sum
        }
        return sum; // Return the calculated sum
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number n
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();

        // Check if the input is a positive integer
        if (n < 1) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            // Calculate the sum of n natural numbers
            int sum = sumOfNaturalNumbers(n);

            // Output the result
            System.out.printf("The sum of the first %d natural numbers is: %d%n", n, sum);
        }

        // Close the scanner
        scanner.close();
    }
}
