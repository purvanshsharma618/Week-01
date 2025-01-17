import java.util.Scanner;

public class StringManipulator {

    // Method to trim leading and trailing spaces from a string using charAt()
    public static int[] trimSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Find the first non-space character
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Find the last non-space character
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end}; // Return the start and end indices
    }

    // Method to create a substring from a string using charAt()
    public static String createSubstring(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i <= end; i++) {
            substring.append(str.charAt(i)); // Append each character to the substring
        }
        return substring.toString(); // Return the substring
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // If lengths are different, they are not equal
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // If any character differs, they are not equal
            }
        }
        return true; // Strings are equal
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string with leading and trailing spaces: ");
        String inputString = scanner.nextLine();

        // Trim spaces using charAt() method
        int[] indices = trimSpaces(inputString);
        int start = indices[0];
        int end = indices[1];

        // Create a substring from the trimmed string
        String trimmedStringUsingCharAt = createSubstring(inputString, start, end);
        System.out.println("Trimmed string using charAt(): '" + trimmedStringUsingCharAt + "'");

        // Trim spaces using the built-in trim() method
        String trimmedStringUsingBuiltIn = inputString.trim();
        System.out.println("Trimmed string using built-in trim(): '" + trimmedStringUsingBuiltIn + "'");

        // Compare the two trimmed strings
        boolean areEqual = compareStrings(trimmedStringUsingCharAt, trimmedStringUsingBuiltIn);
        System.out.println("Are the two trimmed strings equal? " + areEqual);

        // Close the scanner
        scanner.close();
    }
}