import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	
	System.out.println("Enter a year (>= 1582) ");
	int year = input.nextInt(); // taking year as input
	
	// Check if the year is valid (Gregorian calendar starts from 1582)
	if (year >= 1582) {
	
		boolean isLeapYear = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					isLeapYear = true;
				}
				else {
					isLeapYear = false;
				}
			} 
			else {
				isLeapYear = true;
			}
		}
		else {
			isLeapYear = false;
		}

		if (isLeapYear) {
			System.out.println("The year " + year + " is a Leap Year");
		} 
		else {
			System.out.println("The year " + year + " is not a Leap Year ");
		}
	}	

	input.close();
	}
}
