import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static String[] findCharacterFrequency(String text) {
        // Convert string to character array
        char[] characters = text.toCharArray();
        int[] frequency = new int[characters.length]; // Array to store frequency
        String[] result = new String[characters.length]; // Array to store characters and their frequencies

        // Loop to find the frequency of each character
        for (int i = 0; i < characters.length; i++) {
            // Only process characters that haven't been counted yet
            if (frequency[i] == 0) {
                frequency[i] = 1; // Initialize frequency for the current character
                // Inner loop to check for duplicates
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        frequency[i]++; // Increment frequency for duplicates
                        frequency[j] = -1; // Mark duplicate character as counted
                    }
                }
            }
        }

        // Prepare the result array with characters and their frequencies
        int index = 0;
        for (int i = 0; i < characters.length; i++) {
            if (frequency[i] > 0) { // Only include characters with a frequency greater than 0
                result[index++] = characters[i] + ": " + frequency[i];
            }
        }

        // Resize the result array to fit the actual number of unique characters
        String[] finalResult = new String[index];
        System.arraycopy(result, 0, finalResult, 0, index);
        return finalResult; // Return the result array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Find the character frequencies
        String[] frequencies = findCharacterFrequency(inputString);

        // Display the results
        System.out.println("Character Frequencies:");
        for (String frequency : frequencies) {
            System.out.println(frequency);
        }

        // Close the scanner
        scanner.close();
    }
}