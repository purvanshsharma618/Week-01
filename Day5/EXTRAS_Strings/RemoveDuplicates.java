import java.util.*;
class LongestWordInAString{
      public static void main(String[] args){
            //creating a scanner object to take input
            Scanner input = new Scanner(System.in);
            System.out.println("Please Enter the String you want to remove duplicates of : ");
            String example = input.nextLine().toLowerCase();
            //making hash array and count the each character count
            int[] index = new int[26];
            StringBuilder withoutDuplicates = new StringBuilder();
            for(int i=0;i<example.length();i++){
                  if(index[(int)example.charAt(i)-97] == 1){
                        withoutDuplicates.append(example.charAt(i));
                  }else{
                        index[(int)example.charAt(i)-97]++;
                  }
           
            }
            System.out.println("The String without duplicated are " +withoutDuplicates);
            //closing scanner object
            input.close();
           
            
      }
}