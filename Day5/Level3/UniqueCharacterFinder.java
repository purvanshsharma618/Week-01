import java.util.Scanner;

public class UniqueCharacterFinder {

    // Method to find the length of the text without using the String method length()
    public static int findLength(String text) {
        int length = 0;
        while (true) {
            try {
                // Accessing charAt() until an exception is thrown
                text.charAt(length);
                length++;
            } catch (IndexOutOfBoundsException e) {
                break; // Break the loop when the end of the string is reached
            }
        }
        return length; // Return the calculated length
    }

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text); // Get the length of the text
        char[] uniqueChars = new char[length]; // Array to store unique characters
        int uniqueCount = 0; // Counter for unique characters

        // Loop to find unique characters
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the character is unique
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false; // Character is not unique
                    break;
                }
            }

            // If the character is unique, store it in the array
            if (isUnique) {
                uniqueChars[uniqueCount++] = currentChar; // Store unique character
            }
        }

        // Create a new array to store only the unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i]; // Copy unique characters to the result array
        }

        return result; // Return the array of unique characters
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Find the unique characters
        char[] uniqueCharacters = findUniqueCharacters(inputString);

        // Display the result
        System.out.print("Unique characters: ");
        for (char c : uniqueCharacters) {
            System.out.print(c + " ");
        }
        System.out.println(); // New line after displaying unique characters

        // Close the scanner
        scanner.close();
    }
}