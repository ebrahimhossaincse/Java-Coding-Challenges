package me.hossain.ebrahim;

public class Greatest_Common_Divisor {
    public static void main(String[] args) {
        int num1 = 56, num2 = 98;

        // Calculate GCD
        int gcd = findGCD(num1, num2);

        // Print the result
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
