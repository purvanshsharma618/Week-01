import java.util.Scanner;

public class VotingEligibility {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
       
        System.out.println("Enter the age ");
        int age = input.nextInt(); //taking age as input
        
        // Check if the person is 18 or older
        if (age >= 18) {
            // If the person is 18 or older, they can vote
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            // If the person is younger than 18, they cannot vote
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
        
        
        input.close();
    }
}
