import java.util.Scanner;

public class ChocolateDistribution {

    // Method to find the number of chocolates each child gets and the remaining chocolates
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren; // Calculate chocolates per child
        int remainingChocolates = numberOfChocolates % numberOfChildren; // Calculate remaining chocolates
        return new int[]{chocolatesPerChild, remainingChocolates}; // Return results in an array
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number of chocolates and number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Check if the number of children is zero to avoid division by zero
        if (numberOfChildren == 0) {
            System.out.println("Error: The number of children cannot be zero.");
        } else {
            // Find the number of chocolates each child gets and the remaining chocolates
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Output the results
            System.out.printf("Each child will get: %d chocolates%n", result[0]);
            System.out.printf("Remaining chocolates: %d%n", result[1]);
        }

        // Close the scanner
        scanner.close();
    }
}