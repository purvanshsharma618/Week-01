import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate the maximum number of handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2; // Combination formula: C(n, 2) = n * (n - 1) / 2
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Check if the number of students is valid
        if (numberOfStudents < 2) {
            System.out.println("At least 2 students are required to have handshakes.");
        } else {
            // Calculate the maximum number of handshakes
            int handshakes = calculateHandshakes(numberOfStudents);

            // Output the result
            System.out.printf("The maximum number of handshakes among %d students is: %d%n", numberOfStudents, handshakes);
        }

        // Close the scanner
        scanner.close();
    }
}