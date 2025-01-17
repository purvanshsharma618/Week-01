public class SpringSeason {

    // Method to check if the given date is in the spring season
    public static boolean isSpringSeason(int month, int day) {
        // Check if the month is March
        if (month == 3 && day >= 20 && day <= 31) {
            return true;
        }
        // Check if the month is April
        else if (month == 4 && day >= 1 && day <= 30) {
            return true;
        }
        // Check if the month is May
        else if (month == 5 && day >= 1 && day <= 31) {
            return true;
        }
        // Check if the month is June
        else if (month == 6 && day >= 1 && day <= 20) {
            return true;
        }
        // If none of the above conditions match, it's not spring season
        return false;
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide the month and day as command line arguments.");
            return;
        }

        // Parse the month and day from command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Call the method to check if it's a spring season
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
