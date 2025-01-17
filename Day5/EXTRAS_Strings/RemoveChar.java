import java.util.*;
class RemoveChar{
      public static String deleteStr(String str, char delete){
            //creating new string without that word
             StringBuilder sb = new StringBuilder();
             for(int i=0;i<str.length();i++){
                 if(str.charAt(i) == delete){
                      continue;
                   }
                sb.append(str.charAt(i));
             
             }
             return sb.toString();
      }
      public static void main(String[] args){
            //creating scanner object
            Scanner input = new Scanner(System.in);
            System.out.println("Please Enter the string : ");
            String str = input.nextLine();
            System.out.println("Enter the charater you want to delete : " );
            char delete = input.next().charAt(0);
            //calling delete str method
            String deletedStr = deleteStr(str,delete);
            System.out.println("Deleted charactor string from chracter, now the string looks like : "+deletedStr);
            //closing scanner object
            input.close();
      }
}