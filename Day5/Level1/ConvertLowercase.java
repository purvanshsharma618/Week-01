import java.util.Scanner;

public class ConvertLowercase {

	 // Method to compare two strings using charAt() method
    public  boolean compareStringsUsingCharAt(String str1, String str2) {
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
	// Method to convert the string to lowercase using ASCII values
    public String convertToLowerCaseUsingAscii(String text) {
        String result = "";
        
      
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
           
            if (ch >= 'A' && ch <= 'Z') {
                // Converting it to lowercase by adjusting the ASCII value
                ch = (char) (ch + 32);
            }
			
            result += ch;  
        }
     
        return result;  
    }
    
    // Method to split the text into words and return a 2D array with words and their lengths
    public  String[][] splitTextIntoWordsAndLengths(String text) {
        // Split the input text into words using space as a delimiter
        String[] words = text.split(" ");
        
        // Create a 2D array to store words and their lengths
        String[][] wordLengthArray = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i];  // Store the word
            wordLengthArray[i][1] = String.valueOf(words[i].length());  // Store the word length
        }
        
        return wordLengthArray;  // Return the 2D array
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ConvertLowercase obj = new ConvertLowercase();
        // Taking input from the user
        System.out.print("Enter the text: ");
        String inputText = input.nextLine();
        
        // Converting the input text to lowercase using the built-in method
        String builtInLowercase = inputText.toLowerCase();
        
        // Converting the input text to lowercase using the custom method (ASCII)
        String customLowercase = obj.convertToLowerCaseUsingAscii(inputText);
        
        // Comparing both strings using the user-defined method
        boolean isEqual = obj.compareStringsUsingCharAt(builtInLowercase, customLowercase);
        
        System.out.println("Original Text: " + inputText);
        System.out.println("Lowercase using toLowerCase(): " + builtInLowercase.length());
        System.out.println("Lowercase using custom method: " + customLowercase.length());
        System.out.println("Are both results equal? " + isEqual);
        
        // Splitting the text into words and getting their lengths
        String[][] wordLengthArray = obj.splitTextIntoWordsAndLengths(inputText);
        


        for (int i = 0; i < wordLengthArray.length; i++) {
            System.out.println("Word: " + wordLengthArray[i][0] + ", Length: " + wordLengthArray[i][1]);
        }
        
        input.close();
    }
    
    
   
}
