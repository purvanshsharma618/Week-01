import java.util.Scanner;

public class FactorialCalculatorWhile{

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
      
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt(); //taking number as input
        
        // Check if the entered number is a positive integer
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Variable to store the factorial result
            int factorial = 1;
            
			int i=1;
            // Compute the factorial using a for loop
            while (i != number+1) {
                factorial *= i; // Multiply factorial by i
				i++;
				
            }
            
        
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
        
      
        input.close();
    }
}
