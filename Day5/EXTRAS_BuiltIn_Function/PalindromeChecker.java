import java.util.*;

public class PalindromeChecker {
    public static void main(String[] args) {
        //creating new scanner object
        Scanner input = new Scanner(System.in);
        //taking the input of string
        System.out.println("Enter a string:");
        String str = input.nextLine();

        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
        //closing the scanner object
        input.close();
    }

    private static boolean isPalindrome(String str) {
        //checking the palindramic condition
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}