import java.util.*;

public class FactorialRecursion {
    //calculating factorial by recursion
    private static int factorial(int num) {
        if (num <= 1) return 1;
        return num * factorial(num - 1);
    }
    public static void main(String[] args) {
        //creating scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();

        System.out.println("Factorial of " + num + " is " + factorial(num));
        //closing the scanner object
        input.close();
    }

}
