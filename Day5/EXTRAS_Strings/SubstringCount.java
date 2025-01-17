import java.util.Scanner;
import java.util.regex.*;
class SubstringCount{
      public static void main(String[] args){
            //creating scanner object
            Scanner input = new Scanner(System.in);
            System.out.println("Please Enter the String : ");
            String str = input.nextLine();
            System.out.println("Enter the part of string you want to count : ");
            String substr = input.nextLine();
            //creating pattern and matcher to match pattern
            Pattern pattern = Pattern.compile(substr);
            Matcher matcher = pattern.matcher(str);
            int count = 0;
            while(matcher.find()){
                       count++;
                  } 
            System.out.println("The total count of " + substr +" is " +count);
            //closing object of scanner 
           input.close();
            
      }
}





