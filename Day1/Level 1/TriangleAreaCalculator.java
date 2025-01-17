import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for base and height
        System.out.print("Enter the base of the triangle (in inches): ");
        double baseInInches = scanner.nextDouble();

        System.out.print("Enter the height of the triangle (in inches): ");
        double heightInInches = scanner.nextDouble();

        // Calculate the area in square inches
        double areaInSquareInches = 0.5 * baseInInches * heightInInches;

        // Convert area to square centimeters (1 inch = 2.54 cm)
        double areaInSquareCentimeters = areaInSquareInches * (2.54 * 2.54);

        // Print the results
        System.out.printf("The area of the triangle is %.2f square inches and %.2f square centimeters.%n", areaInSquareInches, areaInSquareCentimeters);

        // Close the scanner
        scanner.close();
    }
}