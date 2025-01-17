import java.util.Scanner;

public class VowelConsonantIdentifier {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacter(char ch) {
        // Convert to lowercase
        ch = Character.toLowerCase(ch);
        
        // Check if the character is a letter
        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) != -1) {
                return "Vowel"; // It's a vowel
            } else {
                return "Consonant"; // It's a consonant
            }
        }
        return "Not a Letter"; // Not a letter
    }

    // Method to find vowels and consonants in a string
    public static String[][] findVowelsAndConsonants(String str) {
        int length = str.length();
        String[][] result = new String[length][2]; // 2D array to store character and its type

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            String type = checkCharacter(ch);
            result[i][0] = String.valueOf(ch); // Store the character
            result[i][1] = type; // Store the type (Vowel, Consonant, Not a Letter)
        }

        return result; // Return the 2D array
    }

    // Method to display the 2D array in a tabular format
    public static void displayResult(String[][] result) {
        System.out.printf("%-10s %-15s%n", "Character", "Type");
        System.out.println("-------------------------");
        for (String[] row : result) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Find vowels and consonants
        String[][] results = findVowelsAndConsonants(inputString);

        // Display the results
        displayResult(results);

        // Close the scanner
        scanner.close();
    }
}