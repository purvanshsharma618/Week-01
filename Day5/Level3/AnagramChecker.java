import java.util.Scanner;

public class AnagramChecker {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Remove spaces and convert to lowercase
        text1 = text1.replaceAll("\\s+", "").toLowerCase();
        text2 = text2.replaceAll("\\s+", "").toLowerCase();

        // Check if lengths are equal
        if (text1.length() != text2.length()) {
            return false; // Not anagrams if lengths differ
        }

        // Create an array to store the frequency of characters
        int[] charFrequency = new int[26]; // Assuming only lowercase letters a-z

        // Count frequency of characters in the first text
        for (char c : text1.toCharArray()) {
            charFrequency[c - 'a']++; // Increment the frequency for the character
        }

        // Decrease frequency based on the second text
        for (char c : text2.toCharArray()) {
            charFrequency[c - 'a']--; // Decrement the frequency for the character
        }

        // Check if all frequencies are zero
        for (int freq : charFrequency) {
            if (freq != 0) {
                return false; // Not anagrams if any frequency is not zero
            }
        }

        return true; // They are anagrams
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the two texts
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();
        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        // Check if the texts are anagrams
        boolean result = areAnagrams(text1, text2);

        // Display the result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        // Close the scanner
        scanner.close();
    }
}