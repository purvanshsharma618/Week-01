import java.util.*;
class LongestWordInAString{
      public static void main(String[] args){
            //creating scanner object
            Scanner input = new Scanner(System.in);
            //taking input of strings
            System.out.println("Please Enter the String you want to remove duplicates of : ");
            String example = input.nextLine().toLowerCase();
            String[] arrayOfString = example.split(" ");
            int longestWordIndex = 0;
            //comparing and finding the longest string
            
            for(int i=0;i<arrayOfString.length;i++){
                 if(arrayOfString[i].length() > arrayOfString[longestWordIndex].length()){
                    longestWordIndex = i;
                    }else{
                    continue;
                   }
           
            }
            System.out.println("The Longest word in the String is : " +arrayOfString[longestWordIndex]);
            //closing the scanner object
            input.close();
           
            
      }
}