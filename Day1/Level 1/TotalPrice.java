import java.util.*;
public class TotalPrice{
public static void main(String[]args){
// Create a Scanner object for user input
Scanner sc = new Scanner(System.in);
//Taking input from user
int unitPrice = sc.nextInt();
int quantity = sc.nextInt();

int totalPurchasePrice = unitPrice*quantity; // total cost = number of items * cost of a single item 
System.out.println("The total purchase price is INR " +  totalPurchasePrice  +   " if the quantity  " + quantity +  " and unit price is INR " + unitPrice);
}
}