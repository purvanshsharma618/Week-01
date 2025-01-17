import java.util.Scanner;

public class BMICalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a 2D array to store weight, height, and BMI for 10 people
        double[][] data = new double[10][3];
        String[] bmiStatus = new String[10]; // Array to store BMI status

        // Take user input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (in kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble(); // Weight in kg

            System.out.println("Enter height (in cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble(); // Height in cm
        }

        // Calculate BMI and BMI Status
        for (int i = 0; i < 10; i++) {
            data[i][2] = calculateBMI(data[i][0], data[i][1]); // Calculate BMI
            bmiStatus[i] = determineBMIStatus(data[i][2]);     // Determine BMI status
        }

        // Display the results
        System.out.println("\nResults:");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", data[i][0], data[i][1], data[i][2], bmiStatus[i]);
        }

        scanner.close();
    }

    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100; // Convert height to meters
        return weight / (heightM * heightM); // BMI formula
    }

    // Method to determine BMI Status
    public static String determineBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
