import java.util.Scanner;

public class WordLengthCalculator {

    // Method to split the text into words without using split()
    public static String[] splitWords(String text) {
        String[] words = new String[text.length()]; // Temporary array
        int wordIndex = 0;
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                currentWord.append(c);
            } else {
                if (currentWord.length() > 0) {
                    words[wordIndex++] = currentWord.toString();
                    currentWord.setLength(0);
                }
            }
        }
        // Add the last word if it exists
        if (currentWord.length() > 0) {
            words[wordIndex++] = currentWord.toString();
        }

        // Resize array to fit actual number of words
        String[] result = new String[wordIndex];
        System.arraycopy(words, 0, result, 0, wordIndex);
        return result;
    }

    // Method to find the length of a string without using length()
    public static int findLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to create a 2D array with words and their lengths
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter a sentence:");
        String inputText = scanner.nextLine();

        // Process input
        String[] words = splitWords(inputText);
        String[][] wordLengths = wordsWithLengths(words);

        // Display result in tabular format
        System.out.printf("%-15s %-10s\n", "Word", "Length");
        System.out.println("-----------------------");
        for (String[] wordLength : wordLengths) {
            System.out.printf("%-15s %-10d\n", wordLength[0], Integer.parseInt(wordLength[1]));
        }

        scanner.close();
    }
}
