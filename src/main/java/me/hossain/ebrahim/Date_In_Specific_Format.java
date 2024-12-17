package me.hossain.ebrahim;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_In_Specific_Format {
    public static void main(String[] args) {
        // Current date and time
        LocalDateTime now = LocalDateTime.now();

        // Define a custom date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Format the current date
        String formattedDate = now.format(formatter);

        // Print the formatted date
        System.out.println("Formatted Date: " + formattedDate);
    }
}
