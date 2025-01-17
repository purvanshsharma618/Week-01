import java.util.*;
class ReverseString{
      public static String reverse(String example){
            char[] arrayOfChar = example.toCharArray();
            int low = 0;
            int high = example.length()-1;
            while(low < high){
                  char temp = arrayOfChar[low];
                  arrayOfChar[low]=arrayOfChar[high];
                  arrayOfChar[high]=temp;
                  low++;
                  high--;
            }
            String reverse = new String(arrayOfChar);
            return reverse;
      }
      public static void main(String[] args){
            //creating scanner object
            Scanner input = new Scanner(System.in);
            //taking input from user
            System.out.println("Please Enter the String you want to reveser of : ");
            String example = input.nextLine().toLowerCase().trim();
            //calling reverse method
            String reverseString = reverse(example);
            System.out.println("The original String is " + example );
            System.out.println("The reverse String of the givent string is " + reverseString);
            //closing the scanner object
            input.close();
         
      }
}