import java.util.Scanner;

public class AthleteRounds {
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

        // Distance to run in meters (5 km = 5000 meters)
        double distanceToRun = 5000; // in meters

        // Calculate the number of rounds
        double rounds = distanceToRun / perimeter;

        // Print the result
        System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5 km.%n", rounds);

        // Close the scanner
        scanner.close();
    }
}
