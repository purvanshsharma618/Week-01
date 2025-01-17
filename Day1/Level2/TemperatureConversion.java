import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius using the formula
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Print the result
        System.out.printf("The %.2f Fahrenheit is %.2f Celsius.%n", fahrenheit, celsiusResult);

        // Close the scanner
        scanner.close();
    }
}
