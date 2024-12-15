package me.hossain.ebrahim;

import java.util.Scanner;

public class Check_Leap_Year {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Declare and initialize the year variable
        System.out.println("Enter the year: ");
        int year = in.nextInt();

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
