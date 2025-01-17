public class NullPointerException {

    // Method to generate Exception
	
    public static void generateException() {
        String text = null; // Variable is initialized to null

        System.out.println("Length of text: " + text.length()); // This will throw Exception
    }

    // Method to handle Exception
	
    public static void handleException() {
        String text = null; // Variable is initialized to null

        try {
            
            System.out.println("Length of text: " + text.length()); // This might throw Exception
        } 
		catch ( Exception e) {
            // Catching the exception to avoid program crash
            System.out.println("Caught NullPointerException: " + e);
        }
		
    }

    public static void main(String[] args) {
        
		//  Call the method to generate the exception
        
		try {
            generateException(); 	// Calling the method that throws the exception
        } 
		
		catch (Exception e) {
            // Catching the exception in main method
            System.out.println("Exception caught in main: " + e);
        }

           System.out.println();
        //  Refactor to call the method that handles the exception
	
        handleException();   				// Calling the method that handles the exception
    }
}
