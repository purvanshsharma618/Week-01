import java.util.Scanner;

public class PossibleHandshakes {
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
            // Calculate the maximum number of handshakes using the combination formula
            int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

            // Output the result
            System.out.printf("The maximum number of handshakes among %d students is: %d%n", numberOfStudents, handshakes);
        }

        // Close the scanner
        scanner.close();
    }
}