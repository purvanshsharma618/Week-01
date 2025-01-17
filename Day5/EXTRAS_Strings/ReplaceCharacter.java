import java.util.*;
class ReplaceCharacter{
      public static String replace(String str, String replace, String replaceWith){
            //creating new string with replace word with new one
            StringBuilder sb = new StringBuilder();
            String[] strArray = str.split(" ");
            for(int i=0;i<strArray.length;i++){
                if(strArray[i].equals(replace)){
                      sb.append(replaceWith).append(" ");
                }else{ 
                      sb.append(strArray[i]).append(" ");
                }
            }
            return sb.toString().trim();
      }
      public static void main(String[] args){
            //creating a scanner object
            Scanner input = new Scanner(System.in);
            //taking input of word, replace and replacewith
            System.out.println("Enter the string : ");
            String str = input.nextLine();
            System.out.println("Enter the word you want to replace : ");
            String replace = input.nextLine();
            System.out.println("Enter the word you want to replace with : ");
            String replaceWith = input.nextLine();
            //calling method replace 
            String replaced = replace(str,replace,replaceWith);
            System.out.println("Replaced string is : "+ replaced);
            //closing the scanner object
            input.close();
      }
}