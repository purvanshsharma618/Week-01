import java.util.Scanner;

public class j{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter maths marks");
		int maths = input.nextInt(); //taking maths marks from user
		
		System.out.println("Enter physics marks");
		int physics = input.nextInt(); //taking physics marks from user
		
		System.out.println("Enter chemistry marks");
		int chemistry = input.nextInt(); //taking chemistry marks from user
		
		double totalMarks = maths + physics + chemistry;  // Sum of the marks
		double percentage = totalMarks/3; //calculating percentage
		
		// Print out the grade and remarks based on the percentage
		if(percentage >= 80 ){
			System.out.println("Average marks are "+percentage + " and Grade is A. Remarks: Level 4, above agency-normalized standards" );
		}else if(percentage >= 70 && percentage <= 79 ){
			System.out.println("Average marks are "+percentage + " and Grade is B. Remarks: Level 3, at agency-normalized standards" );
		}else if(percentage >= 60 && percentage <= 69 ){
			System.out.println("Average marks is "+percentage + " and Grade is C. Remarks: Level 2, below, but approaching agency-normalized standards" );
		}else if(percentage >= 50 && percentage <= 59 ){
			System.out.println("Average marks are "+percentage + " and Grade is D. Remarks: Level 1, well below agency-normalized standards" );
		}else if(percentage >= 40 && percentage <= 49 ){
			System.out.println("Average marks are "+percentage + " and Grade is E. Remarks: Level 1-, two below agency-normalized standards" );
		}else if(percentage <= 39 ){
			System.out.println("Average marks are "+percentage + " and Grade is R. Remarks: Remedial standards" );
		}
		
		input.close();
	}
}