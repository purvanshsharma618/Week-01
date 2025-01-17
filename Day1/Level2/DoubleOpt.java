import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for a, b, and c
        System.out.print("Enter the value for a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter the value for b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter the value for c: ");
        double c = scanner.nextDouble();

        // Perform the operations
        double result1 = a + b * c;    // a + (b * c)
        double result2 = a * b + c;    // (a * b) + c
        double result3 = c + a / b;    // c + (a / b)
        double result4 = a % b + c;    // (a % b) + c

        // Print the results
        System.out.printf("The results of Double Operations are: %.2f, %.2f, %.2f, and %.2f%n", result1, result2, result3, result4);

        // Close the scanner
        scanner.close();
    }
}
