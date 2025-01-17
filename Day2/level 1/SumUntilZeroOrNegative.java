import java.util.Scanner;

public class SumUntilZeroOrNegative {

    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        
        // Initialize the total sum to 0.0
        double total = 0.0;
        
        // Variable to store the user input
        double number;
        
        // Start an infinite while loop
        System.out.println("Enter numbers to sum (enter 0 or a negative number to stop) ");
        
        while (true) {
            number = input.nextDouble(); // Read the user input
            
            // If the user enters 0 or a negative number, break the loop
            if (number <= 0) {
                break;
            }
            
            // Add the entered number to the total sum
            total += number;
        }
              
        System.out.println("Total sum: " + total);
          
        input.close();
    }
}
