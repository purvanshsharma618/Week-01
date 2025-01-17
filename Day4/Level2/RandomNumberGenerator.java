import java.util.Arrays;

public class RandomNumberGenerator {

    // Method to generate an array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Generate a random 4-digit number (1000 to 9999)
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return randomNumbers; // Return the array of random numbers
    }

    // Method to find average, min, and max value of an array
    public double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int number : numbers) {
            sum += number; // Calculate sum
            min = Math.min(min, number); // Find minimum
            max = Math.max(max, number); // Find maximum
        }

        double average = sum / numbers.length; // Calculate average
        return new double[]{average, min, max}; // Return average, min, and max
    }

    public static void main(String[] args) {
        RandomNumberGenerator rng = new RandomNumberGenerator();

        // Generate an array of 5 random 4-digit numbers
        int[] randomNumbers = rng.generate4DigitRandomArray(5);
        System.out.println("Generated Random Numbers: " + Arrays.toString(randomNumbers));

        // Find average, min, and max values
        double[] results = rng.findAverageMinMax(randomNumbers);
        double average = results[0];
        int min = (int) results[1];
        int max = (int) results[2];

        // Display the results
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}