package me.hossain.ebrahim;

import java.util.Scanner;

public class Check_Palindrome_String {
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user for a string
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Convert the string to lowercase to make it case-insensitive
        str = str.toLowerCase();

        // Initialize a boolean variable to check for palindrome
        boolean isPalindrome = true;

        // Loop to check if the string is a palindrome
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                isPalindrome = false; // Not a palindrome
                break;
            }
        }

        // Output the result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        // Close the scanner
        input.close();
    }
}
