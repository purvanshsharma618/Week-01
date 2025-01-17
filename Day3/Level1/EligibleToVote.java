import java.util.*;

public class EligibleToVote{
  public static void main(String[]args){

Scanner sc = new Scanner(System.in);
int[] studentAges = new int[10];

  for(int i =0;i<studentAges .length;i++){
  studentAges[i] = sc.nextInt();
   System.out.println(studentAges[i]);
  }
     for (int age : studentAges) {
            if (age < 0) {
                System.out.println("Invalid age: " + age);
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }
 }
}
