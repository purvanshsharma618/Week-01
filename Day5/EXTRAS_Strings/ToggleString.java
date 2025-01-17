import java.util.*;
class ToggleString{ 
      public static void main(String[] args){
            //creating the scanner object
            Scanner input = new Scanner(System.in);
            //taking the input
            System.out.println("Please Enter the string : ");
            String str = input.nextLine();
            StringBuilder toggleString = new StringBuilder();
            //toggleing each character
            for(int i=0;i<str.length();i++){
                 if((int)str.charAt(i)<97){
                     toggleString.append((char)(str.charAt(i) + 32));
                     }
                 else{
                     toggleString.append((char)(str.charAt(i) - 32));
                     }
            }
            String toggle = toggleString.toString();
            System.out.println("Toggled Character String is this " + toggle);
            //closing the scanner object
            input.close();
      }
}