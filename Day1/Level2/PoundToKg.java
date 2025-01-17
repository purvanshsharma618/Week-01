import java.util.*;
public class PoundToKg{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
double weightInKg = sc.nextDouble();
double weightInPound = weightInKg*2.2;
System.out.println("The weight of the person in pound is " + weightInPound +
" and in kg is " + weightInKg);
}
}