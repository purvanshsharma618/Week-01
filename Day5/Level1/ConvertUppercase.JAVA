import java.util.Scanner;

public class ConvertUppercase {
      // Method to convert text to uppercase using ASCII values
		public String convertToUpperCaseUsingAscii(String text) {
		String result = ""; // Use a String to build the result

		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);

			// Convert lowercase letters to uppercase
			if (ch >= 'a' && ch <= 'z') {
				ch = (char) (ch - 32);
			}

			result += ch; 
		}

		return result;
		}

    
    // Method to compare two strings using charAt() method
    public boolean compareStringsUsingCharAt(String str1, String str2) {
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
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		ConvertUppercase obj = new ConvertUppercase();
        
        // Taking input from the user
        System.out.print("Enter the text: ");
        String inputText = input.nextLine();
        
        // Converting the input text to uppercase using the built-in method
        String builtInUppercase = inputText.toUpperCase();
        
        // Converting the input text to uppercase using the custom method (ASCII)
        String customUppercase = obj.convertToUpperCaseUsingAscii(inputText);
        
        // Comparing both strings using the user-defined method
        boolean isEqual = obj.compareStringsUsingCharAt(builtInUppercase, customUppercase);
        
        // Displaying the results
        System.out.println("Original Text: " + inputText);
        System.out.println("Uppercase using toUpperCase(): " + builtInUppercase);
        System.out.println("Uppercase using custom method: " + customUppercase);
        System.out.println("Are both results equal? " + isEqual);
        
        input.close();
    }

  
}
