import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {
  
        Scanner input = new Scanner(System.in);
        
      
        System.out.println("Enter the salary of the employee ");
        double salary = input.nextDouble(); // taking salary as input 
        
   
        System.out.println("Enter the years of service ");
        int yearsOfService = input.nextInt(); // taking years of service as input
        
        // Variable to store the bonus
        double bonus = 0;
        
        // Check if the employee is eligible for a bonus
        if (yearsOfService > 5) {
            // Calculate the bonus as 5% of the salary
            bonus = salary * 0.05;
            System.out.println("The employee is eligible for a bonus.");
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }
        
       
        System.out.println("The bonus amount is: " + bonus);
        
   
        input.close();
    }
}
