import java.util.Scanner;

public class TotalIncomeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for salary
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        // Taking user input for bonus
        System.out.print("Enter your bonus: ");
        double bonus = scanner.nextDouble();

        // Compute total income
        double totalIncome = salary + bonus;

        // Print the result
        System.out.printf("The salary is INR %.2f and bonus is INR %.2f. Hence Total Income is INR %.2f.%n", salary, bonus, totalIncome);

        // Close the scanner
        scanner.close();
    }
}

