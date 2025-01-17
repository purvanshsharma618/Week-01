import java.util.Scanner;

public class ArrayCheck {
    public static void main(String[] args) {
        // Define an integer array of 5 elements
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        // Take user input for the array elements
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Loop through the array to check each number
        for (int number : numbers) {
            if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println(number + " is positive and even.");
                } else {
                    System.out.println(number + " is positive and odd.");
                }
            } else if (number < 0) {
                System.out.println(number + " is negative.");
            } else {
                System.out.println(number + " is zero.");
            }
        }

        // Compare the first and last elements of the array
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        System.out.print("Comparison of first and last elements: ");
        if (first > last) {
            System.out.println("First element is greater than the last element.");
        } else if (first < last) {
            System.out.println("First element is less than the last element.");
        } else {
            System.out.println("First and last elements are equal.");
        }

        // Close the scanner
        scanner.close();
    }
}
