import java.util.Scanner;

public class CountTheNumber{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = input.nextInt(); //taking number as input
		
		int count =0; //initialised count veriable
		
		//calculating unit digit
		while( number != 0){
			number = number/10;
			
			count++;
		}
	System.out.println("The number digit is"+ count);
	}

}