import java.util.*;

public class BasicCalculator {
    
    private static double add(double a, double b) {
        return a + b;
    }

    private static double subtract(double a, double b) {
        return a - b;
    }

    private static double multiply(double a, double b) {
        return a * b;
    }

    private static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }
    public static void main(String[] args) {
        //creating scanner object 
        Scanner input = new Scanner(System.in);
        //taking input of two number
        System.out.println("Enter two numbers:");
        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.println("Choose operation: 1) Add 2) Subtract 3) Multiply 4) Divide");
        int choice = input.nextInt();
        //performing operation according to the input
        switch (choice) {
            case 1 -> System.out.println("Result: " + add(a, b));
            case 2 -> System.out.println("Result: " + subtract(a, b));
            case 3 -> System.out.println("Result: " + multiply(a, b));
            case 4 -> System.out.println("Result: " + divide(a, b));
            default -> System.out.println("Invalid choice.");
        }
        //closing the scanner object
        input.close();
    }

}
