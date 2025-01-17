import java.util.*;

public class FibonacciGenerator {
    private static void generateFibonacci(int terms) {
        //calculating the fibonacci
        int a = 0, b = 1;
        System.out.println("Fibonacci sequence:");
        for (int i = 0; i < terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //creating scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms for the Fibonacci sequence:");
        int terms = input.nextInt();

        generateFibonacci(terms);
        //closing the object of scanner
        input.close();
    }

  
}
