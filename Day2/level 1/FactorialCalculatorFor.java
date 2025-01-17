import java.util.Scanner;

public class FactorialCalculatorFor {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
      
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt(); //taking number as input
        
        // Check if the entered number is a positive integer
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Variable to store the factorial result
            long factorial = 1;
            
            // Compute the factorial using a for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Multiply factorial by i
            }
            
        
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
        
      
        input.close();
    }
}
