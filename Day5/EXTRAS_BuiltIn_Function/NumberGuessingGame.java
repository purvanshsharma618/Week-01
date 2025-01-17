
import java.util.*;

public class NumberGuessingGame {
   

    private static int generateGuess(int low, int high) {
        //calculating the again and again
        return low + (high - low) / 2;
    }

    public static void main(String[] args) {
        //creating the scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100.");
        int low = 1, high = 100;
        boolean correct = false;

        while (!correct) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (Enter 'high', 'low', 'correct'):");
            String feedback = input.nextLine();
            
            if (feedback.equals("correct")) {
                System.out.println("Hooray! The computer guessed your number.");
                correct = true;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else {
                System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }
        }
        //closing the scanner object
        input.close();
    }
}