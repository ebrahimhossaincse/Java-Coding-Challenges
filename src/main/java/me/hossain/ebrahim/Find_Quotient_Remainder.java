package me.hossain.ebrahim;

import java.util.Scanner;

public class Find_Quotient_Remainder {
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user for the dividend
        System.out.print("Enter dividend: ");
        int dividend = input.nextInt();

        // Prompt the user for the divisor
        System.out.print("Enter divisor: ");
        int divisor = input.nextInt();

        // Calculate the quotient and remainder
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        // Display the results
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Close the Scanner
        input.close();
    }
}
