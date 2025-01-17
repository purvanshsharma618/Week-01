import java.util.*;

public class MaxOfThree {
 
    private static int findMax(int a, int b, int c) {
        //calculating the max of threee
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        //creating the scanner class and taking input of three 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = findMax(a, b, c);
        System.out.println("The maximum number is: " + max);
        //closing the scanner class 
        input.close();
    }

}