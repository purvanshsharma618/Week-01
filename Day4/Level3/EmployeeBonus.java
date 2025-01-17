import java.util.Random;

public class EmployeeBonus {

    // Method to determine the salary and years of service
    public static double[][] generateEmployeeData(int numberOfEmployees) {
        Random random = new Random();
        double[][] employeeData = new double[numberOfEmployees][2]; // 2D array to hold salary and years of service

        for (int i = 0; i < numberOfEmployees; i++) {
            // Generate a random 5-digit salary (10000 to 99999)
            double salary = 10000 + (random.nextDouble() * 90000);
            // Generate random years of service (0 to 20)
            double yearsOfService = random.nextInt(21);
            employeeData[i][0] = salary; // Salary
            employeeData[i][1] = yearsOfService; // Years of service
        }
        return employeeData; // Return the 2D array
    }

    // Method to calculate the new salary and bonus
    public static double[][] calculateNewSalaryAndBonus(double[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3]; // 2D array to hold new salary and bonus

        for (int i = 0; i < employeeData.length; i++) {
            double salary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonus;
            double newSalary;

            // Calculate bonus and new salary based on years of service
            if (yearsOfService > 5) {
                bonus = salary * 0.05; // 5% bonus
            } else {
                bonus = salary * 0.02; // 2% bonus
            }
            newSalary = salary + bonus; // New salary after adding bonus

            // Store the new salary and bonus in the updated data array
            updatedData[i][0] = newSalary; // New salary
            updatedData[i][1] = bonus; // Bonus
            updatedData[i][2] = salary; // Old salary
        }
        return updatedData; // Return the updated data
    }

    // Method to calculate the sum of old salary, new salary, and total bonus
    public static void calculateAndDisplayTotals(double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-15s %-15s %-15s %-15s%n", "Old Salary", "New Salary", "Bonus", "Years of Service");
        System.out.println("----------------------------------------------------------");

        for (double[] employee : updatedData) {
            double oldSalary = employee[2];
            double newSalary = employee[0];
            double bonus = employee[1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-15.2f %-15.2f %-15.2f %-15.2f%n", oldSalary, newSalary, bonus, employee[2]);
        }

        System.out.println("----------------------------------------------------------");
        System.out.printf("%-15s %-15.2f %-15.2f %-15.2f%n", "Total", totalNewSalary, totalOldSalary, totalBonus);
    }

    public static void main(String[] args) {
        int numberOfEmployees = 10; // Number of employees
        double[][] employeeData = generateEmployeeData(numberOfEmployees); // Generate employee data
        double[][] updatedData = calculateNewSalaryAndBonus(employeeData); // Calculate new salary and bonus
        calculateAndDisplayTotals(updatedData); // Display totals
    }
}