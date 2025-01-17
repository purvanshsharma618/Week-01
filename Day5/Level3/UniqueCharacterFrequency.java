import java.util.Scanner;

public class UniqueCharacterFrequency {

    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String text) {
        boolean[] charExists = new boolean[256]; // Array to track existing characters
        int uniqueCount = 0;

        // Loop through the text to find unique characters
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (!charExists[currentChar]) {
                charExists[currentChar] = true; // Mark character as found
                uniqueCount++; // Increment unique character count
            }
        }

        // Create an array to store unique characters
        char[] uniqueChars = new char[uniqueCount];
        int index = 0;

        // Fill the unique characters array
        for (int i = 0; i < charExists.length; i++) {
            if (charExists[i]) {
                uniqueChars[index++] = (char) i; // Add the character to the array
            }
        }

        return uniqueChars; // Return the array of unique characters
    }

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; // Array to store frequency of each character

        // Loop through the text to find the frequency of characters
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++; // Increment the frequency for the character
        }

        // Get unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Create a 2D array to store unique characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];

        // Fill the result array with characters and their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]); // Character
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]); // Frequency
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