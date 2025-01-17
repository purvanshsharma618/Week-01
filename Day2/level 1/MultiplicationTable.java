import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter a number to generate the multiplication table ");
        int number = input.nextInt(); //taking number as input
        
        // Use a for loop to print the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            int result = number * i; // Multiply the number by i
            System.out.println(number + " * " + i + " = " + result); // Print the multiplication result
        }
        
       
        input.close();
    }
}
