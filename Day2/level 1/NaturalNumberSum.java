import java.util.Scanner;

public class NaturalNumberSum {

    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter a number ");
        int number = input.nextInt(); //taking number as input
        
        // Check if the number is a positive integer (natural number)
        if (number > 0) {
          
            int sum = (number * (number + 1)) / 2;   // Calculating the sum of the first n natural numbers
          
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // If the number is not a natural number
            System.out.println("The number " + number + " is not a natural number");
        }
        
       
        input.close();
    }
}
