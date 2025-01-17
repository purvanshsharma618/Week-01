import java.util.Scanner;

public class CharacterFrequencyCounter {

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; // Array to store frequency of each character

        // Loop through the text to find the frequency of characters
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++; // Increment the frequency for the character
        }

        // Create a 2D array to store unique characters and their frequencies
        int uniqueCount = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                uniqueCount++; // Count unique characters
            }
        }

        String[][] result = new String[uniqueCount][2]; // 2D array for characters and frequencies
        int index = 0;

        // Fill the result array with characters and their frequencies
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i); // Character
                result[index][1] = String.valueOf(frequency[i]); // Frequency
                index++;
            }
        }

        return result; // Return the 2D array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Find the character frequencies
        String[][] frequencies = findCharacterFrequency(inputString);

        // Display the results
        System.out.println("Character Frequencies:");
        for (String[] frequency : frequencies) {
            System.out.println(frequency[0] + ": " + frequency[1]);
        }

        // Close the scanner
        scanner.close();
    }
}