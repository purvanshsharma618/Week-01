import java.util.Scanner;

public class JourneyDetails {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Taking user input for cities
        System.out.print("Enter your starting city (fromCity): ");
        String fromCity = scanner.nextLine();
        
        System.out.print("Enter your via city (viaCity): ");
        String viaCity = scanner.nextLine();
        
        System.out.print("Enter your destination city (toCity): ");
        String toCity = scanner.nextLine();

        // Taking user input for distances
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double fromToVia = scanner.nextDouble();
        
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
        double viaToFinalCity = scanner.nextDouble();

        // Taking user input for time taken
        System.out.print("Enter the time taken for the journey (in hours): ");
        double timeTaken = scanner.nextDouble();

        // Calculate total distance
        double totalDistance = fromToVia + viaToFinalCity;

        // Print the result
        System.out.printf("Journey Details for %s:%n", name);
        System.out.printf("From: %s to %s via %s%n", fromCity, toCity, viaCity);
        System.out.printf("Total Distance: %.2f miles%n", totalDistance);
        System.out.printf("Time Taken: %.2f hours%n", timeTaken);
        System.out.printf("Average Speed: %.2f miles/hour%n", totalDistance / timeTaken);

        // Close the scanner
        scanner.close();
    }
}