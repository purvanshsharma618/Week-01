import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter the first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = sc.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        String division = number2 != 0 ? String.valueOf(number1 / number2) : "undefined (division by zero)";

        // Print the results
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + number1 + “and” + number2 + “are” + addition + “,” + subtraction “,” + multiplication “,” + “and” + division);
            }
}

