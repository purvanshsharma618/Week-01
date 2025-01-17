import java.util.*;

public class TemperatureConverter {
    
    private static double toFahrenheit(double celsius) {
        //converting the celcius to fahreniet
        return (celsius * (9 / 5)) + 32;
    }

    private static double toCelsius(double fahrenheit) {
        //converting the fahrenit to celcius
        return (fahrenheit - 32) * (5 / 9);
    }
    public static void main(String[] args) {
        //creating scanner object 
        Scanner input = new Scanner(System.in);
        //taking input of temperature
        System.out.println("Enter temperature:");
        double temp = input.nextDouble();
        System.out.println("Convert to (1) Fahrenheit or (2) Celsius?");
        int choice = input.nextInt();
        //converting according to the choice
        if (choice == 1) {
            System.out.println("Temperature in Fahrenheit: " + toFahrenheit(temp));
        } else if (choice == 2) {
            System.out.println("Temperature in Celsius: " + toCelsius(temp));
        } else {
            System.out.println("Invalid choice.");
        }
        //closing the scanner object
        input.close();
    }

}