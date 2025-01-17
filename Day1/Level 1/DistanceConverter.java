import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // Conversion constants
        final int FEET_PER_YARD = 3;
        final int YARDS_PER_MILE = 1760;

        // Convert distance to yards
        double distanceInYards = distanceInFeet / FEET_PER_YARD;

        // Convert distance to miles
        double distanceInMiles = distanceInYards / YARDS_PER_MILE;

        // Print the results
        System.out.printf("The distance in yards is %.2f and in miles is %.6f.%n", distanceInYards, distanceInMiles);

        // Close the scanner
        scanner.close();
    }
}

