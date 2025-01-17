import java.util.Random;
import java.util.Scanner;

public class VotingEligibilityChecker {

    // Method to generate random ages for the specified number of students
    public static int[] generateRandomAges(int numberOfStudents) {
        Random random = new Random();
        int[] ages = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = random.nextInt(100); // Generate random age between 0 and 99
        }
        return ages; // Return the array of ages
    }

    // Method to check voting eligibility based on age
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] eligibility = new String[ages.length][2]; // 2D array to store age and eligibility

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            eligibility[i][0] = String.valueOf(age); // Store age as a string

            // Validate age and determine voting eligibility
            if (age < 0) {
                eligibility[i][1] = "Cannot Vote"; // Negative age
            } else if (age >= 18) {
                eligibility[i][1] = "Can Vote"; // Eligible to vote
            } else {
                eligibility[i][1] = "Cannot Vote"; // Not eligible to vote
            }
        }
        return eligibility; // Return the 2D array
    }

    // Method to display the eligibility results in a tabular format
    public static void displayEligibility(String[][] eligibility) {
        System.out.printf("%-10s %-15s%n", "Age", "Voting Eligibility");
        System.out.println("---------------------------");
        for (String[] row : eligibility) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = 10; // Number of students

        // Generate random ages for the students
        int[] ages = generateRandomAges(numberOfStudents);

        // Check voting eligibility based on ages
        String[][] eligibility = checkVotingEligibility(ages);

        // Display the results
        displayEligibility(eligibility);

        // Close the scanner
        scanner.close();
    }
}