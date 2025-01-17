import java.util.Scanner;

public class NumberChecker {

    // Method to check whether the number is positive or negative
    public static boolean isPositive(int number) {
        return number >= 0; // Return true if the number is positive
    }

    // Method to check whether the number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0; // Return true if the number is even
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1; // number1 is greater
        } else if (number1 < number2) {
            return -1; // number1 is less
        } else {
            return 0; // both are equal
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Array to hold 5 numbers
        int[] numbers = new int[5];

        // Taking user input for 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt(); // Read number input

            // Check if the number is positive or negative
            if (isPositive(numbers[i])) {
                System.out.print(numbers[i] + " is positive. ");
                // Check if the number is even or odd
                if (isEven(numbers[i])) {
                    System.out.println("It is even.");
                } else {
                    System.out.println("It is odd.");
                }
            } else {
                System.out.println(numbers[i] + " is negative.");
            }
        }

        // Compare the first and last elements of the array
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparisonResult == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult == -1) {
            System.out.println("The first number is less than the last number.");
        } else {
            System.out.println("The first number is equal to the last number.");
        }

        // Close the scanner
        scanner.close();
    }
}