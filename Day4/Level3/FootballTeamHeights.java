
import java.util.Random;

public class FootballTeamHeights {

    // Method to generate random heights for players
    public static int[] generateRandomHeights(int size) {
        Random random = new Random();
        int[] heights = new int[size];

        for (int i = 0; i < size; i++) {
            // Generate random height between 150 cm and 250 cm
            heights[i] = 150 + random.nextInt(101); // 101 because we want to include 250
        }
        return heights; // Return the array of heights
    }

    // Method to find the sum of all heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height; // Accumulate the sum
        }
        return sum; // Return the total sum
    }

    // Method to find the mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights); // Get the sum of heights
        return (double) sum / heights.length; // Calculate mean
    }

    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int shortest = heights[0]; // Assume the first height is the shortest
        for (int height : heights) {
            if (height < shortest) {
                shortest = height; // Update shortest if a smaller height is found
            }
        }
        return shortest; // Return the shortest height
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0]; // Assume the first height is the tallest
        for (int height : heights) {
            if (height > tallest) {
                tallest = height; // Update tallest if a larger height is found
            }
        }
        return tallest; // Return the tallest height
    }

    public static void main(String[] args) {
        int numberOfPlayers = 11; // Number of players
        int[] heights = generateRandomHeights(numberOfPlayers); // Generate random heights

        // Calculate shortest, tallest, and mean height
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        double mean = findMean(heights);

        // Display the results
        System.out.println("Heights of players (in cm):");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println("\n\nShortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
        System.out.printf("Mean height: %.2f cm%n", mean);
    }
}

