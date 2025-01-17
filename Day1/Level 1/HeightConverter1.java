import java.util.Scanner;

public class HeightConverter1 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = scanner.nextDouble();

        // Conversion constants
        final double CM_PER_INCH = 2.54;
        final int INCHES_PER_FOOT = 12;

        // Convert height to inches
        double heightInInches = heightInCm / CM_PER_INCH;

        // Convert height to feet and remaining inches
        int feet = (int) (heightInInches / INCHES_PER_FOOT);
        double inches = heightInInches % INCHES_PER_FOOT;

        // Print the results
        System.out.printf("Your height in cm is %.2f while in feet is %d and inches is %.2f.%n", heightInCm, feet, inches);

        // Close the scanner
        scanner.close();
    }
}

