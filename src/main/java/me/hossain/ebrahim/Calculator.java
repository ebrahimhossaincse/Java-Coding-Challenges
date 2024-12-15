package me.hossain.ebrahim;

public class Calculator {

    public static void cal(String condition, int number1, int number2) {

        if (condition.equals("+")) {
            System.out.println("Summation: "+(number1 + number2));
        }else if (condition.equals("-")) {
            System.out.println("Subtraction: "+(number1 - number2));
        }else if (condition.equals("*")) {
            System.out.println("Multiplication: "+(number1 * number2));
        }else if (condition.equals("/")) {
            System.out.println("Division: "+(number1 / number2));
        }else{
            System.out.println("Error");
        }

    }

    public static void main(String[] args) {
        cal("-", 44, 22);
    }
}
