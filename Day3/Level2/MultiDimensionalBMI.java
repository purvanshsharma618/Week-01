import java.util.Scanner;

public class MultiDimensionalBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();

        // Create a 2D array to store weight, height, and BMI
        double[][] personData = new double[number][3];
        // Create an array to store weight status
        String[] weightStatus = new String[number];

        // Input weight and height for each person
        for (int i = 0; i < number; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");

            // Input weight
            do {
                System.out.print("Enter weight (in kg): ");
                personData[i][0] = scanner.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Weight must be a positive value. Please try again.");
                }
            } while (personData[i][0] <= 0);

            // Input height
            do {
                System.out.print("Enter height (in meters): ");
                personData[i][1] = scanner.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Height must be a positive value. Please try again.");
                }
            } while (personData[i][1] <= 0);

            // Calculate BMI and store it
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine weight status based on BMI
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the details for each person
        System.out.println("\nDetails of all persons:");
        System.out.println("Person\tWeight(kg)\tHeight(m)\tBMI\t\tWeight Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                    (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}
