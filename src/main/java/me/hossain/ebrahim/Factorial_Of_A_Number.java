package me.hossain.ebrahim;

public class Factorial_Of_A_Number {
    public static void main(String[] args) {

        // Declare and initialize the number and factorial variables
        int num = 10, factorial = 1;

        // Loop to calculate the factorial
        for (int i = 1; i <= num; ++i) {
            // Multiply the current value of factorial by i
            factorial *= i;
        }

        // Print the factorial result
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
