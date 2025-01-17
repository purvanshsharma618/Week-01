import java.util.*;
public class Handshakes{
public static void main(String[]args){
// Create a Scanner object for user input
Scanner sc = new Scanner(System.in);
//Taking input from user
int numberOfStudents = sc.nextInt();
int possibleHandShakes = (numberOfStudents*(numberOfStudents-1))/2; // number of combination = (n * (n - 1)) / 2)

System.out.println(possibleHandShakes);
}
}