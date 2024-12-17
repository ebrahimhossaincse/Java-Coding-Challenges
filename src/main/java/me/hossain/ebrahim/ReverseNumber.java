package me.hossain.ebrahim;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();

        // Call the reverseNumber method
        int reversed = reverseNumber(number);

        // Display the reversed number
        System.out.println("Reversed Number: " + reversed);

        scanner.close(); // Close the scanner
    }

    // Method to reverse a number
    public static int reverseNumber(int number) {
        int reversed = 0;

        while (number != 0) {
            // Extract the last digit
            int digit = number % 10;

            // Add it to the reversed number
            reversed = reversed * 10 + digit;

            // Remove the last digit from the original number
            number /= 10;
        }

        return reversed;
    }
}
