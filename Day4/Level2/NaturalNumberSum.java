import java.util.Scanner;

public class NaturalNumberSum {

    // Method to find the sum of n natural numbers using recursion
    public static int sumOfNaturalNumbersRecursive(int n) {
        if (n == 1) {
            return 1; // Base case: the sum of the first natural number is 1
        }
        return n + sumOfNaturalNumbersRecursive(n - 1); // Recursive case
    }

    // Method to find the sum of n natural numbers using the formula
    public static int sumOfNaturalNumbersFormula(int n) {
        return n * (n + 1) / 2; // Formula for the sum of the first n natural numbers
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if the input is a natural number
        if (n < 1) {
            System.out.println("Please enter a natural number greater than 0.");
            scanner.close();
            return; // Exit the program
        }

        // Calculate the sum using recursion
        int recursiveSum = sumOfNaturalNumbersRecursive(n);

        // Calculate the sum using the formula
        int formulaSum = sumOfNaturalNumbersFormula(n);

        // Output the results
        System.out.printf("Sum of the first %d natural numbers (using recursion): %d%n", n, recursiveSum);
        System.out.printf("Sum of the first %d natural numbers (using formula): %d%n", n, formulaSum);

        // Compare the results
        if (recursiveSum == formulaSum) {
            System.out.println("Both computations are correct and equal.");
        } else {
            System.out.println("There is a discrepancy between the two computations.");
        }

        // Close the scanner
        scanner.close();
    }
}