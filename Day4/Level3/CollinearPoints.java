import java.util.Scanner;

public class CollinearPoints {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take inputs for three points (x1, y1), (x2, y2), and (x3, y3)
        System.out.println("Enter coordinates of point A (x1, y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter coordinates of point B (x2, y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.println("Enter coordinates of point C (x3, y3): ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        // Check collinearity using the slope formula
        if (areCollinearBySlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear (using slope formula).");
        } else {
            System.out.println("The points are not collinear (using slope formula).");
        }

        // Check collinearity using the area of triangle formula
        if (areCollinearByArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear (using area formula).");
        } else {
            System.out.println("The points are not collinear (using area formula).");
        }

        scanner.close();
    }

    // Method to check collinearity using slope formula
    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate slopes AB, AC, and BC
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeAC = (y3 - y1) / (x3 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);

        // Check if slopes are equal
        return slopeAB == slopeAC && slopeAB == slopeBC;
    }

    // Method to check collinearity using the area of triangle formula
    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate the area of the triangle
        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }
}
