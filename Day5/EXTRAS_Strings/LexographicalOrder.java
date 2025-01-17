import java.util.*;
class LexographicalOrder{
        public static void compare(String first, String second){
              //COMPARING THE STRINGS
               if((int)first.charAt(0) < (int)second.charAt(0)){
                System.out.println(first +" comes before the " + second + " in lexographical way");
                 }else{
                 System.out.println(second +" comes before the " + first + " in lexographical way");
                 }
        }
        public static void main(String[] args){
              //creating scanner object
               Scanner input = new Scanner(System.in);
               System.out.println("Please Enter first string : ");
               String first = input.nextLine();
               System.out.println("Please Enter second string : ");
               String second = input.nextLine();
               //comparing the strings
               compare(first,second);
               //closing the scanner object
               input.close();
        }
}