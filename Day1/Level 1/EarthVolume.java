public class EarthVolume {
    public static void main(String[] args) {
        // Initialize constants
        double radiusKm = 6378; // Radius of Earth in kilometers
        double kmToMiles = 0.621371; // Conversion factor from kilometers to miles

        // Calculate the volume of Earth in cubic kilometers
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);

        // Convert radius to miles and calculate the volume in cubic miles
        double radiusMiles = radiusKm * kmToMiles;
        double volumeMiles3 = (4.0 / 3) * Math.PI * Math.pow(radiusMiles, 3);

        // Display the results
        System.out.print("The volume of Earth in cubic kilometers is " + volumeKm3 + " and in cubic miles is " + volumeMiles3);
    }
}