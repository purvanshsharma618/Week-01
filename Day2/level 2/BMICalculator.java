import java.util.Scanner;
public class BMICalculator {
	public static void main(String[] args) {
		
	
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter weight in kg ");
		double weight = input.nextDouble(); // taking weight as input
		
		
		System.out.println("Enter height in cm " );
		double heightCm = input.nextDouble(); // taking height in cm as input
		
		
		double heightM = heightCm / 100; // Converting height from cm to meters
		
		
		double bmi = weight / (heightM * heightM); // Calculating BMI
		
		// Check weight status based on BMI
		String status;
		if (bmi <= 18.4) {
			status = "Underweight";
		}
		else if (bmi <= 24.9) {
			status = "Normal";
		}
		else if (bmi <= 39.9) {
			status = "Overweight";
		}
		else {
			status = "Obese";
		}
	
		System.out.println("BMI: " + bmi);
		System.out.println("Status: " + status);
		
		input.close();
	}
}
