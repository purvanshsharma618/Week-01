import java.util.*;
class MostOccurance{
       public static char mostOccured(String str){
             int[] charCount = new int[26];
             for(int i = 0;i<str.length();i++){
                 charCount[(int)str.charAt(i)-97]++;
             }
             char maxOccured = (char)(charCount[0] + 97);
             int count = 0;
             for(int i=0;i<charCount.length;i++){
                if(charCount[i] > count){
                     count = charCount[i];
                     maxOccured = (char)(i + 97);
                 }
             }
             return maxOccured;
       }
       public static void main(String[] args){
            //creating scanner object
             Scanner input = new Scanner(System.in);
             System.out.println("Please Enter the string : ");
             String str = input.nextLine().toLowerCase().trim();
             //calling methoed to get max occured charactor.
             char mostOccured = mostOccured(str);
             System.out.println("Mostly occured character is : " + mostOccured);
             //closing the scanner object
             input.close();
       }
}