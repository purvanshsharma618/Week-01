import java.time.*;

public class DateArithmetic {
    public static void main(String[] args) {
        //getting an local date
        LocalDate inputDate = LocalDate.of(2025, 1, 14); // Example input date
        //updating the localdate by inbuilt methods
        LocalDate updatedDate = inputDate.plusDays(7).plusMonths(1).plusYears(2);
        updatedDate = updatedDate.minusWeeks(3);
        //printing the original and updated methods
        System.out.println("Original Date: " + inputDate);
        System.out.println("Updated Date: " + updatedDate);
    }
}
