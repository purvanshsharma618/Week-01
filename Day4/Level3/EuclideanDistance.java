import java.util.Scanner;

public class EuclideanDistance {

    // Method to calculate the Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // Euclidean distance formula
    }

    // Method to find the equation of the line given two points
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] lineEquation = new double[2]; // Array to hold slope (m) and y-intercept (b)

        // Calculate the slope (m)
        double m = (y2 - y1) / (x2 - x1);
        lineEquation[0] = m; // Store slope in the array

        // Calculate the y-intercept (b)
        double b = y1 - m * x1;
        lineEquation[1] = b; // Store y-intercept in the array

        return lineEquation; // Return the array containing slope and y-intercept
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the two points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Calculate the Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("The Euclidean distance between the points (%.2f, %.2f) and (%.2f, %.2f) is: %.2f%n", x1, y1, x2, y2, distance);

        // Find the equation of the line
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double yIntercept = lineEquation[1];

        // Display the equation of the line
        System.out.printf("The equation of the line is: y = %.2fx + %.2f%n", slope, yIntercept);

        // Close the scanner
        scanner.close();
    }
}