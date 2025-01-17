import java.util.*;

public class PrimeChecker {
    
    private static boolean isPrime(int num) {
        //checking if number is prime or not
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        //creating new scanner object and taking input 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        //closing the scanner object
        input.close();
    }

}