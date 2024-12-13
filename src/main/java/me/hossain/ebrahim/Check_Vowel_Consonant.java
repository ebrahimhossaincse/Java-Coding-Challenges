package me.hossain.ebrahim;

public class Check_Vowel_Consonant {
    public static void main(String[] args) {

        // Declare and initialize a character variable
        char ch = 'A';

        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            // Print if it's a vowel
            System.out.println(ch + " is a vowel.");
        } else {
            // Print if it's a consonant
            System.out.println(ch + " is a consonant.");
        }
    }
}
