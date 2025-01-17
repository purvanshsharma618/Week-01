import java.util.Scanner;

public class TextSplitter {

    // Method to find the length of the string without using the built-in length() method
    public static int findLength(String str) {
        int length = 0;
        try {
            while (str.charAt(length) != '\0') {
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Reached the end of the string
        }
        return length;
    }

    // Method to split the text into words without using the built-in split() method
    public static String[] customSplit(String text) {
        int textLength = findLength(text);

        // Count the number of words
        int wordCount = 1; // Starts at 1 to account for the last word
        for (int i = 0; i < textLength; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Array to store words
        String[] words = new String[wordCount];
        int startIndex = 0, wordIndex = 0;

        for (int i = 0; i < textLength; i++) {
            if (text.charAt(i) == ' ' || i == textLength - 1) {
                int endIndex = (i == textLength - 1) ? i + 1 : i;
                words[wordIndex] = text.substring(startIndex, endIndex);
                wordIndex++;
                startIndex = i + 1;
            }
        }

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Built-in split() method
        String[] builtInWords = input.split(" ");

        // Custom split method
        String[] customWords = customSplit(input);

        // Compare the results
        boolean areEqual = compareArrays(builtInWords, customWords);

        // Display the results
        System.out.println("Words from built-in split():");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("\nWords from custom split():");
        for (String word : customWords) {
            System.out.println(word);
        }

        System.out.println("\nAre the two arrays equal? " + areEqual);

        scanner.close();
    }
}
