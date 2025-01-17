import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote based on age
    public boolean canStudentVote(int age) {
        // Validate the age
        if (age < 0) {
            return false; // Cannot vote if age is negative
        }
        // Check if age is 18 or above
        return age >= 18; // Return true if eligible to vote, otherwise false
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Define an array to hold the ages of 10 students
        int[] ages = new int[10];
        
        // Create an instance of StudentVoteChecker
        StudentVoteChecker voteChecker = new StudentVoteChecker();
        
        // Loop to take user input for the ages of the students
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt(); // Read age input
            
            // Check if the student can vote and display the result
            if (voteChecker.canStudentVote(ages[i])) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}