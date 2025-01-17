import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int number = input.nextInt(); // taking number from user
        
        boolean isPrime = true;   // Initialize a boolean variable to track if the number is prime
        
        // Check if the number is greater than 1
        if (number > 1) {
            // Loop through numbers from 2 to (number-1)
            for (int i = 2; i < number; i++) {
                // If number is divisible by any i, it is not prime
                if (number % i == 0) {
                    isPrime = false;
                    break; // No need to check further
                }
            }
        } else {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        }
        
      
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        input.close();
    }
}
