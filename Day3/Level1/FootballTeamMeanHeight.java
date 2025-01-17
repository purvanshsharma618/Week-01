import java.util.Scanner;

public class FootballTeamMeanHeight {
    public static void main(String[] args) {
        // Create a double array named heights of size 11
        double[] heights = new double[11];
        
        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Input values from the user
        System.out.println("Enter the heights of 11 football players in centimeters:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
        }
        
        // Calculate the sum of all the elements present in the array
        double sum = 0;
        for (double height : heights) {
            sum += height;
        }
        
        // Calculate the mean height
        double mean = sum / heights.length;
        
        // Print the mean height
        System.out.printf("The mean height of the football team is: %.2f cm\n", mean);
        
        // Close the scanner
        scanner.close();
    }
}
