package me.hossain.ebrahim;

public class RoundUpResultInteger {
    public static void main(String[] args) {
        int numerator = 7;
        int denominator = 3;

        // Rounded-up integer division
        int result = (int) Math.ceil((double) numerator / denominator);

        System.out.println("Rounded-up result: " + result);
    }
}
