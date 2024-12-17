package me.hossain.ebrahim;

public class Second_Largest_Number_In_Array {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 20, 5, 15, 30}; // Example array

        int secondLargest = findSecondLargest(numbers);

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest number found.");
        } else {
            System.out.println("The second largest number is: " + secondLargest);
        }
    }

    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return Integer.MIN_VALUE; // Indicates no second largest number
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }
}
