import java.util.Scanner;

public class RocketLaunchFor {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
      
        System.out.println("Enter the countdown starting number ");
        int counter = input.nextInt(); // taking conunter as input
        
        // Check if the counter value is greater than or equal to 1
        if (counter < 1) {
            System.out.println("Please enter a positive number greater than or equal to 1.");
        } else {
            // Start the countdown using a for loop
            for (int i = counter; i >= 1; i--) {
                System.out.println(i + " seconds");
            }
        }
        
        
        input.close();
    }
}
