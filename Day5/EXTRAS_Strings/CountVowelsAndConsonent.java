import java.util.*;
class CountVowelsAndConsonent{ public static void main(String[] args) {
      //creating scanner object
      Scanner scanner = new Scanner(System.in);
      //taking input
      System.out.println("Enter a string:");
      String input = scanner.nextLine().toLowerCase();
      //taking count of vowels and consonants
      int vowelCount = 0;
      int consonantCount = 0;
      //checking for each character in character array
      for (char ch : input.toCharArray()) {
          if (Character.isLetter(ch)) {
              if ("aeiou".indexOf(ch) != -1) {
                  vowelCount++;
              } else {
                  consonantCount++;
              }
          }
      }
      //priting the count of vowel and consonants
      System.out.println("Number of vowels: " + vowelCount);
      System.out.println("Number of consonants: " + consonantCount);
      //closeing the scanner object
      scanner.close();
  }
}