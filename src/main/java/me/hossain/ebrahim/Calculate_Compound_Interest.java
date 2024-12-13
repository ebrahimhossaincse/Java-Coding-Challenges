package me.hossain.ebrahim;

public class Calculate_Compound_Interest {
    public static void main(String[] args) {

        // Declare and initialize variables for principal, rate, and time
        double principal = 15000, rate = 5.5, time = 3;

        // Calculate compound interest
        double compoundInterest = principal * (Math.pow((1 + rate / 100), time)) - principal;

        // Print the calculated compound interest
        System.out.println("Compound Interest: " + compoundInterest);
    }
}
