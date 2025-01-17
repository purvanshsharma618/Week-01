import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for a, b, and c
        System.out.print("Enter the value for a: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter the value for b: ");
        int b = scanner.nextInt();
        
        System.out.print("Enter the value for c: ");
        int c = scanner.nextInt();

        // Perform the operations
        int result1 = a + b * c;    // a + (b * c)
        int result2 = a * b + c;    // (a * b) + c
        int result3 = c + a / b;    // c + (a / b) (using integer division)
        int result4 = a % b + c;    // (a % b) + c

        // Print the results
        System.out.println("The results of Int Operations are: " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        // Close the scanner
        scanner.close();
    }
}
