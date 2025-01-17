public class Unit_Converter {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9; // Convert Fahrenheit to Celsius
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32; // Convert Celsius to Fahrenheit
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double poundsToKilograms = 0.453592; // Conversion factor
        return pounds * poundsToKilograms; // Convert pounds to kilograms
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilogramsToPounds = 2.20462; // Conversion factor
        return kilograms * kilogramsToPounds; // Convert kilograms to pounds
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallonsToLiters = 3.78541; // Conversion factor
        return gallons * gallonsToLiters; // Convert gallons to liters
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double litersToGallons = 0.264172; // Conversion factor
        return liters * litersToGallons; // Convert liters to gallons
    }

    public static void main(String[] args) {
        // Example usage of the UnitConverter methods
        double fahrenheit = 100.0;
        double celsiusFromFahrenheit = convertFahrenheitToCelsius(fahrenheit);
        System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius.%n", fahrenheit, celsiusFromFahrenheit);

        double celsius = 37.0;
        double fahrenheitFromCelsius = convertCelsiusToFahrenheit(celsius);
        System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit.%n", celsius, fahrenheitFromCelsius);

        double pounds = 150.0;
        double kilogramsFromPounds = convertPoundsToKilograms(pounds);
        System.out.printf("%.2f pounds is equal to %.2f kilograms.%n", pounds, kilogramsFromPounds);

        double kilograms = 68.0;
        double poundsFromKilograms = convertKilogramsToPounds(kilograms);
        System.out.printf("%.2f kilograms is equal to %.2f pounds.%n", kilograms, poundsFromKilograms);

        double gallons = 5.0;
        double litersFromGallons = convertGallonsToLiters(gallons);
        System.out.printf("%.2f gallons is equal to %.2f liters.%n", gallons, litersFromGallons);

        double liters = 10.0;
        double gallonsFromLiters = convertLitersToGallons(liters);
        System.out.printf("%.2f liters is equal to %.2f gallons.%n", liters, gallonsFromLiters);
    }
}