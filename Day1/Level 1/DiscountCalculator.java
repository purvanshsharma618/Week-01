import java.util.*;
import java.util.*;
public class DiscountCalculator {
    public static void main(String[] args) {
        // Initialize variables
        int fee = 125000;
        int discountPercent = 10;

        // Calculate the discount amount
        double discount = (fee * discountPercent) / 100.0;

        // Calculate the final fee after discount
        double finalFee = fee - discount;

        // Display the results
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}