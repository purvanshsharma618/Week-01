import java.util.Scanner;

public class FindTheMultiple{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a number ");
	int number = input.nextInt();//taking number as input
	 
	for(int i=100; i>0; i--){
	//check the number
		if(number%i== 0){
			System.out.println(i);
		}
	}
	input.close();
	
	}

}