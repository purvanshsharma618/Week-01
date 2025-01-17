import java.time.*;
import java.util.*;

public class DateComparison {
    public static void main(String[] args) {
        //creating scanner object 
        Scanner input = new Scanner(System.in);
        //taking input and parsing into date formate
        System.out.println("Enter the first date (yyyy-MM-dd):");
        LocalDate firstDate = LocalDate.parse(input.nextLine());
        //geting second input and parsing into date formate
        System.out.println("Enter the second date (yyyy-MM-dd):");
        LocalDate secondDate = LocalDate.parse(input.nextLine());
        //comparing conditions
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else {
            System.out.println("Both dates are the same.");
        }
        //closing the scanner object
        input.close();
    }
}