import java.util.Scanner;

	
public class AllChar{

	 public char[] getCharactersWithoutToCharArray(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i); // Extract each character using charAt()
        }
        return chars;
    }
	

	//method to compare two String
	public boolean compareTwoArray(char[] arr1, char[] arr2){
	
		//check if both string length 
		if (arr1.length != arr2.length) {
            return false;
        }

        // Compare each element in the arrays
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		AllChar obj = new AllChar();
		
		//taking a string as input;
		System.out.println("Enter a Stirng");
		String str = input.next();
		
		char[] userDefinedResult = obj.getCharactersWithoutToCharArray(str);
		
		
		char[] bluitInResult = str.toCharArray();
		boolean result = obj.compareTwoArray(userDefinedResult, bluitInResult);
		
		if(result ){
			System.out.println("Both array are same " );
		}else{
			System.out.println("Both array are not same " );
		}
	
		input.close();
	}
}