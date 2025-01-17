import java.util.*;
public class DiscountCalculator1{
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        double fee = sc.nextDouble();
        double discountPercent = sc.nextDouble();


        // Calculate the discount amount
        double discount = (fee * discountPercent) / 100.0;

        // Calculate the final fee after discount
        double finalFee = fee - discount;

        // Display the results
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}

