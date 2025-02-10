package me.hossain.ebrahim;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println("Enter a string to check palindrome: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean isPalindrome = isPalindrome(s);
        System.out.println("Is palindrome: " + isPalindrome);
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
