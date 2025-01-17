import java.util.Scanner;

public class LengthOfString{
	
	//method to find length of the string
	public static int calculateWordLength(String str){
	int count =0;
	int i =0;

		try{
			while(true){
			if(str.charAt(i) != '\0'){
					count++; // count each character of the string
					i++;
			}
		}
		}catch(RuntimeException e){
			System.out.println(e); //runtime exception
		}
		return count; // return length of the string
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String str = sc.next();
	
		
		
		int lengthByUserDefined = calculateWordLength(str); //will return the length of the string by user-defined method
		int lengthByBuiltIn = str.length(); // using built in method
		
		
		System.out.println("length of string using user defined method is "+ lengthByUserDefined);
		System.out.println("length of string using built in method is "+ lengthByBuiltIn);
		
	}
}