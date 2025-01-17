import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status
    public static String[][] calculateBMI(double[][] weightHeight) {
        String[][] bmiResults = new String[weightHeight.length][4]; // 2D array to store results

        for (int i = 0; i < weightHeight.length; i++) {
            double weight = weightHeight[i][0]; // Weight in kg
            double heightInMeters = weightHeight[i][1] / 100; // Convert height from cm to meters
            double bmi = weight / (heightInMeters * heightInMeters); // Calculate BMI

            // Determine BMI status
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obesity";
            }

            // Store results in the array
            bmiResults[i][0] = String.valueOf(weightHeight[i][1]); // Height in cm
            bmiResults[i][1] = String.valueOf(weight); // Weight in kg
            bmiResults[i][2] = String.format("%.2f", bmi); // BMI value formatted to 2 decimal places
            bmiResults[i][3] = status; // BMI status
        }

        return bmiResults; // Return the results
    }

    // Method to display the results in a tabular format
    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-10s %-10s %-20s%n", "Height (cm)", "Weight (kg)", "BMI", "Status");
        System.out.println("-----------------------------------------------------");
        for (String[] row : results) {
            System.out.printf("%-10s %-10s %-10s %-20s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] weightHeight = new double[10][2]; // 2D array to store weight and height

        // Taking user input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            weightHeight[i][0] = scanner.nextDouble(); // Weight
            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            weightHeight[i][1] = scanner.nextDouble(); // Height
        }

        // Calculate BMI and status
        String[][] bmiResults = calculateBMI(weightHeight);

        // Display the results
        displayResults(bmiResults);

        // Close the scanner
        scanner.close();
    }
}