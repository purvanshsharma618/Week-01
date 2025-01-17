import java.util.Scanner;

public class SubstringComparison {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the string, start index, and end index
        System.out.print("Enter the main string: ");
        String mainString = sc.nextLine();

        System.out.print("Enter the start index: ");
        int start = sc.nextInt();

        System.out.print("Enter the end index: ");
        int end = sc.nextInt();

        // Generate substring using charAt() method and calling method
        String substringUsingCharAt = createSubstringUsingCharAt(mainString, start, end);

        // Generate substring using built-in substring() method
        String substringUsingBuiltIn = mainString.substring(start, end);

        // Compare the two substrings using charAt()
        boolean areSubstringsEqual = substringUsingCharAt.equals(substringUsingBuiltIn);

        // Display the results
        System.out.println("Substring using charAt(): " + substringUsingCharAt);
        System.out.println("Substring using built-in method: " + substringUsingBuiltIn);
        System.out.println("Are the substrings equal? " + areSubstringsEqual);

        sc.close();
    }

    // Method to create a substring using charAt() method
    public static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
