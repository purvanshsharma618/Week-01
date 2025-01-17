import java.util.Scanner;

public class CheckDivisibleBy5{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number");
	int number = input.nextInt(); //taking number as input
	
	boolean isDivisible = number % 5 == 0; //check is it divisible by 5
	 System.out.println("Is the number "+number+" divisible by 5? "+isDivisible);
	input.close();
	
	}
}