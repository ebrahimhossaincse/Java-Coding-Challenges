package me.hossain.ebrahim;

public class Check_Leap_Year {
    public static void main(String[] args) {

        // Declare and initialize the year variable
        int year = 2025;

        // Check if the year is a leap year
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            // Print if it's a leap year
            System.out.println(year + " is a leap year.");
        } else {
            // Print if it's not a leap year
            System.out.println(year + " is not a leap year.");
        }
    }
}
