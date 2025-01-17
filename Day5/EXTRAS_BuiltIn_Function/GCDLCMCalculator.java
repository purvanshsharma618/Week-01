import java.util.*;

public class GCDLCMCalculator {
    private static int gcd(int a, int b) {
        //calculating the gcd
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    private static int lcm(int a, int b) {
        //calculating the lcm
        return (a * b) / gcd(a, b);
    }
    public static void main(String[] args) {
        //creating scanner object and taking two input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("GCD: " + gcd(a, b));
        System.out.println("LCM: " + lcm(a, b));
        //closint the scanner object
        input.close();
    }


}