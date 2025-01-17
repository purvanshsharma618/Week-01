import java.util.Scanner;
public class LeapYearLogical {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a year (>= 1582) ");
		int year = input.nextInt(); // taking year as input
		// Check if the year is valid (Gregorian calendar starts from 1582)
		if (year >= 1582) {
		// Determine if the year is a Leap Year using a single if condition with logical operators
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
		System.out.println("The year " + year + " is a Leap Year.");
		}
		else {
			System.out.println("The year " + year + " is not a Leap Year.");
		}
		}
		else {
			System.out.println("The year " + year + " is not valid. Please enter a year >= 1582.");
		}
	
		input.close();
	}
}
