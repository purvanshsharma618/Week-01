public class UnitConverter {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double kmToMiles = 0.621371;
        return km * kmToMiles; // Convert kilometers to miles
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double milesToKm = 1.60934;
        return miles * milesToKm; // Convert miles to kilometers
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double metersToFeet = 3.28084;
        return meters * metersToFeet; // Convert meters to feet
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feetToMeters = 0.3048;
        return feet * feetToMeters; // Convert feet to meters
    }

    public static void main(String[] args) {
        // Example usage of the UnitConverter methods
        double kilometers = 10.0;
        double miles = convertKmToMiles(kilometers);
        System.out.printf("%.2f kilometers is equal to %.2f miles.%n", kilometers, miles);

        double milesInput = 6.2;
        double kilometersFromMiles = convertMilesToKm(milesInput);
        System.out.printf("%.2f miles is equal to %.2f kilometers.%n", milesInput, kilometersFromMiles);

        double meters = 5.0;
        double feet = convertMetersToFeet(meters);
        System.out.printf("%.2f meters is equal to %.2f feet.%n", meters, feet);

        double feetInput = 16.4;
        double metersFromFeet = convertFeetToMeters(feetInput);
        System.out.printf("%.2f feet is equal to %.2f meters.%n", feetInput, metersFromFeet);
    }
}