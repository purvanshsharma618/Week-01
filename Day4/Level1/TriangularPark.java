import java.util.Scanner;

public class TriangularPark {

    // Method to compute the number of rounds needed to complete a 5 km run
    public static double calculateRounds(double perimeter) {
        double distanceToRun = 5000; // 5 km in meters
        return distanceToRun / perimeter; // Calculate the number of rounds
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the sides of the triangle
        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Calculate the number of rounds needed
        double rounds = calculateRounds(perimeter);

        // Output the result
        System.out.printf("The athlete needs to complete %.2f rounds to run 5 km in the triangular park.%n", rounds);

        // Close the scanner
        scanner.close();
    }
}