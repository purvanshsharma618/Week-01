import java.util.Scanner;

public class StringComparision {

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        // Check if the lengths of the strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character of the strings
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                continue;
            } else{
            return false;
            }
        }
        return true; // Strings are equal if all characters match
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for two strings
        System.out.println("Enter the first string:");
        String str1 = scanner.next();

        System.out.println("Enter the second string:");
        String str2 = scanner.next();

        // Compare strings using charAt() method
        boolean resultUsingCharAt = compareUsingCharAt(str1, str2);

        // Compare strings using built-in equals() method
        boolean resultUsingEquals = str1.equals(str2);

        // Display results
        System.out.println("Comparison using charAt(): " + resultUsingCharAt);
        System.out.println("Comparison using equals(): " + resultUsingEquals);

        // Check if the results are the same
        if (resultUsingCharAt == resultUsingEquals) {
            System.out.println("Both methods are giving same result.");
        } else {
            System.out.println("The methods are giving different results.");
        }

        scanner.close();
    }
}
