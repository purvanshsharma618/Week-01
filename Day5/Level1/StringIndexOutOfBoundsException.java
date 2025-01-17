import java.util.Scanner;

public class StringIndexOutOfBoundsException {

    // Method to generate Exception
	
    public static void generateException(String str) {
      
        System.out.println("Length of text: " + str.charAt(10)); // This will throw Exception
    }

    // Method to handle Exception
	
    public static void handleRuntimeException(String string) {
        

        try {
            
            System.out.println("Character at string: " + string.charAt(10)); // This might throw Exception
        } 
		catch ( Exception e) {
            // Catching the exception to avoid program crash
            System.out.println("Caught StringIndexOutOfBoundsException: " + e);
        }
		
    }

    public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	
	System.out.print("Enter the String: ");
	String str= input.next();
        
		//  Call the method to generate the exception
        
		try {
            generateException(str); 	// Calling the method that throws the exception
        } 
		
		catch (Exception e) {
            // Catching the exception in main method
            System.out.println("Exception StringIndexOutOfBoundsException in main: " + e);
        }


           System.out.println();
		   
        //  Refactor to call the method that handles the exception
        handleRuntimeException(str);   				// Calling the method that handles the exception
    }
}
