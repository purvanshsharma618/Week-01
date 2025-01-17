import java.util.Scanner;

public class SmallestAndLargest {

    // Method to find the smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1; // Assume number1 is the smallest
        int largest = number1;  // Assume number1 is the largest

        // Check if number2 is smaller or larger
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number2 > largest) {
            largest = number2;
        }

        // Check if number3 is smaller or larger
        if (number3 < smallest) {
            smallest = number3;
        }
        if (number3 > largest) {
            largest = number3;
        }

        // Return an array containing the smallest and largest numbers
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for three numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        // Find the smallest and largest numbers
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Output the result
        System.out.printf("The smallest number is: %d%n", result[0]);
        System.out.printf("The largest number is: %d%n", result[1]);

        // Close the scanner
        scanner.close();
    }
}