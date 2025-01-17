import java.util.*;
class CheckAnagram{
      public static Boolean checkAnagram(String first, String second){
            //creating a character count hasharray
             if(first.length() == second.length()){
                  int[] firstCount = new int[26];
                  int[] secondCount = new int[26];
                    for(int i=0;i<=25;i++){
                          firstCount[i]=0;
                          secondCount[i]=0;
                     }
                  for(int i=0;i<first.length();i++){
                         if(first.charAt(i) == (char)firstCount[i] + 97){
                               firstCount[i]++;
                           };

                         
                     }
                    for(int i=0;i<second.length();i++){
                       

                            if(second.charAt(i) == (char)secondCount[i] + 97){
                               secondCount[i]++;
                           };
                     }
            //compareing the hash array value of both first and second
                  for(int i=0;i<=25;i++){
                          if(firstCount[i]!=secondCount[i]){
                                 return false;
                           }
                     }
                  return true;
             }else{
                return false;
             }
      }
      public static void main(String[] args){
            //creating scanner object to take input of first and second input
             Scanner input = new Scanner(System.in);
             System.out.println("Enter the first string : ");
             String first = input.nextLine().toLowerCase(); 
             System.out.println("Enter the second String :");
             String second = input.nextLine().toLowerCase();
             //calling anagram function which will give bool value
             Boolean anagram = checkAnagram(first,second);
             if(anagram){
                  System.out.println("yes anagram");
                 }else{
                  System.out.println("NO anagram");
                 }
            //closing the scanner object
             input.close();
      }
}