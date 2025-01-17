import java.util.Scanner;

public class NumberCheck {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        // Ask the user for a number
        System.out.println("Enter a number ");
        int number = input.nextInt();
        
        // Check if the number is positive, negative, or zero
        if (number > 0) {
            // If the number is greater than zero, it is positive
            System.out.println("The number is positive.");
        } else if (number < 0) {
            // If the number is less than zero, it is negative
            System.out.println("The number is negative.");
        } else {
            // If the number is zero
            System.out.println("The number is zero.");
        }
        
        input.close();
    }
}
