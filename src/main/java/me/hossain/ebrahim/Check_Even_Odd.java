package me.hossain.ebrahim;

public class Check_Even_Odd {

    public static void even_odd(int number){
        if(number%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        even_odd(2);
        even_odd(3);
    }

}
