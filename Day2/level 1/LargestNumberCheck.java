import java.util.Scanner;

public class LargestNumberCheck {

    public static void main(String[] args) {
        // Create a scanner object to take input from user
        Scanner input = new Scanner(System.in);
        
           // taking three numbers from user
        System.out.println("Enter the first number ");
        int number1 = input.nextInt();
        
        System.out.println("Enter the second number ");
        int number2 = input.nextInt();
        
        System.out.println("Enter the third number");
        int number3 = input.nextInt();
        
        // Check if the first number is the largest
        if (number1 > number2 && number1 > number3) {
            System.out.println("Is the first number the largest? Yes");
        } else {
            System.out.println("Is the first number the largest? No");
        }

        // Check if the second number is the largest
        if (number2 > number1 && number2 > number3) {
            System.out.println("Is the second number the largest? Yes");
        } else {
            System.out.println("Is the second number the largest? No");
        }

        // Check if the third number is the largest
        if (number3 > number1 && number3 > number2) {
            System.out.println("Is the third number the largest? Yes");
        } else {
            System.out.println("Is the third number the largest? No");
        }
        
       
        input.close();
    }
}
