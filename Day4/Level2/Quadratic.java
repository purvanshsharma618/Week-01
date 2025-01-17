import java.util.Scanner;

public class Quadratic {

    // Method to find the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c; // Calculate the discriminant

        if (delta > 0) {
            // Two distinct roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2}; // Return the roots
        } else if (delta == 0) {
            // One root
            double root = -b / (2 * a);
            return new double[]{root}; // Return the single root
        } else {
            // No real roots
            return new double[]{}; // Return an empty array
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for coefficients a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Find the roots of the quadratic equation
        double[] roots = findRoots(a, b, c);

        // Display the results
        if (roots.length == 0) {
            System.out.println("No real roots exist.");
        } else if (roots.length == 1) {
            System.out.printf("There is one root: x = %.2f%n", roots[0]);
        } else {
            System.out.printf("The roots are: x1 = %.2f and x2 = %.2f%n", roots[0], roots[1]);
        }

        // Close the scanner
        scanner.close();
    }
}