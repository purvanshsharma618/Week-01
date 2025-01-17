public class UnitConversion {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yardsToFeet = 3.0; // 1 yard = 3 feet
        return yards * yardsToFeet; // Convert yards to feet
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feetToYards = 0.333333; // 1 foot = 1/3 yard
        return feet * feetToYards; // Convert feet to yards
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double metersToInches = 39.3701; // 1 meter = 39.3701 inches
        return meters * metersToInches; // Convert meters to inches
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inchesToMeters = 0.0254; // 1 inch = 0.0254 meters
        return inches * inchesToMeters; // Convert inches to meters
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inchesToCm = 2.54; // 1 inch = 2.54 centimeters
        return inches * inchesToCm; // Convert inches to centimeters
    }

    public static void main(String[] args) {
        // Example usage of the UnitConverter methods
        double yards = 5.0;
        double feetFromYards = convertYardsToFeet(yards);
        System.out.printf("%.2f yards is equal to %.2f feet.%n", yards, feetFromYards);

        double feet = 15.0;
        double yardsFromFeet = convertFeetToYards(feet);
        System.out.printf("%.2f feet is equal to %.2f yards.%n", feet, yardsFromFeet);

        double meters = 2.0;
        double inchesFromMeters = convertMetersToInches(meters);
        System.out.printf("%.2f meters is equal to %.2f inches.%n", meters, inchesFromMeters);

        double inches = 10.0;
        double metersFromInches = convertInchesToMeters(inches);
        System.out.printf("%.2f inches is equal to %.2f meters.%n", inches, metersFromInches);

        double inchesForCm = 12.0;
        double centimetersFromInches = convertInchesToCentimeters(inchesForCm);
        System.out.printf("%.2f inches is equal to %.2f centimeters.%n", inchesForCm, centimetersFromInches);
    }
}