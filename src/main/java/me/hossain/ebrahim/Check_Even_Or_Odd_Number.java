package me.hossain.ebrahim;

public class Check_Even_Or_Odd_Number{
        public static void main(String[] args) {

            // Declare and initialize an integer variable
            int num = 5;

            // Check if the number is even or odd using the modulo operator (%)
            if (num % 2 == 0) {
                // If the number is divisible by 2, it's even
                System.out.println(num + " is even.");
            } else {
                // Otherwise, it's odd
                System.out.println(num + " is odd.");
            }
        }
}
