import java.util.Scanner;

public class BMIStatusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        // Create arrays to store height, weight, BMI, and status
        double[] heights = new double[numberOfPersons];
        double[] weights = new double[numberOfPersons];
        double[] bmiValues = new double[numberOfPersons];
        String[] statuses = new String[numberOfPersons];

        // Take input for height and weight of each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("\nEnter height (in meters) for person " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();

            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            weights[i] = scanner.nextDouble();

            // Calculate BMI
            bmiValues[i] = weights[i] / (heights[i] * heights[i]);

            // Determine the weight status based on BMI
            if (bmiValues[i] <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmiValues[i] <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmiValues[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\nResults:");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height", "Weight", "BMI", "Status");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", heights[i], weights[i], bmiValues[i], statuses[i]);
        }
    }
}
