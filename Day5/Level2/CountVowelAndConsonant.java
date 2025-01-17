import java.util.Scanner;

public class CountVowelAndConsonant {

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
    public static int[] countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String result = checkCharacter(ch);
            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }

        return new int[]{vowelCount, consonantCount}; // Return counts in an array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Count vowels and consonants
        int[] counts = countVowelsAndConsonants(inputString);
        int vowels = counts[0];
        int consonants = counts[1];

        // Display the results
        System.out.println("Number of Vowels: " + vowels);
        System.out.println("Number of Consonants: " + consonants);

        // Close the scanner
        scanner.close();
    }
}