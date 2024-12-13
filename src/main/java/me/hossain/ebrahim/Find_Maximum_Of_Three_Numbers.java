package me.hossain.ebrahim;

// This is a Java program to find the maximum of three numbers using the ternary operator
public class Find_Maximum_Of_Three_Numbers {
    public static void main(String[] args) {
        // Declare three integer variables and initialize them with values
        int num1 = 10, num2 = 20, num3 = 15, max;

        // Use a nested ternary operator to find the maximum value
        // First condition: Compare num1 and num2. If num1 > num2, check if num1 > num3.
        // If true, num1 is the maximum. Otherwise, num3 is the maximum.
        // If the first condition is false (num2 >= num1), compare num2 and num3.
        // If num2 > num3, num2 is the maximum. Otherwise, num3 is the maximum.
        max = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);

        // Print the maximum value
        System.out.println("Maximum of " + num1 + ", " + num2 + ", and " + num3 + " is " + max);
    }
}

