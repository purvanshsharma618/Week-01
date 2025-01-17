import java.util.Scanner;

public class YoungestAndTallest {

    // Method to find the youngest friend
    public static String findYoungest(String[] names, int[] ages) {
        int minAgeIndex = 0; // Start with the first friend
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i; // Update index if a younger friend is found
            }
        }
        return names[minAgeIndex]; // Return the name of the youngest friend
    }

    // Method to find the tallest friend
    public static String findTallest(String[] names, double[] heights) {
        int maxHeightIndex = 0; // Start with the first friend
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i; // Update index if a taller friend is found
            }
        }
        return names[maxHeightIndex]; // Return the name of the tallest friend
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Names of the friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking user input for ages and heights
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = scanner.nextInt(); // Read age input

            System.out.print("Enter the height of " + names[i] + " (in cm): ");
            heights[i] = scanner.nextDouble(); // Read height input
        }

        // Find the youngest and tallest friends
        String youngest = findYoungest(names, ages);
        String tallest = findTallest(names, heights);

        // Display the results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        // Close the scanner
        scanner.close();
    }
}