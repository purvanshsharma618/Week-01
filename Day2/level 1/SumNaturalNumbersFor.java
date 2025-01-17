import java.util.Scanner;

public class SumNaturalNumbersFor {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
      
        System.out.println("Enter a natural number ");
        int n = input.nextInt(); // taking n as input
        
        // Check if the entered number is a natural number (positive integer)
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Compute the sum using the while loop
            int sumUsingWhile = 0;
          
            for (int i=1; i<=n; i++) {
                sumUsingWhile += i;
              
            }
            
        
            int sumUsingFormula = n * (n + 1) / 2;  // Compute the sum using the formula
          
            System.out.println("Sum using while loop: " + sumUsingWhile);
            System.out.println("Sum using formula: " + sumUsingFormula);
            
            // Compare the two results and print the outcome
            if (sumUsingWhile == sumUsingFormula) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("There is an error in the computations.");
            }
        }

        input.close();
    }
}
