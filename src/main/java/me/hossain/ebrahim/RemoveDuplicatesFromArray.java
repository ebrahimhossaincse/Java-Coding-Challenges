package me.hossain.ebrahim;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5, 6, 6};

        // Call method to remove duplicates
        int[] uniqueNumbers = removeDuplicates(numbers);

        // Print the result
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueNumbers));
    }

    public static int[] removeDuplicates(int[] array) {
        // Create an ArrayList to store unique elements
        ArrayList<Integer> uniqueList = new ArrayList<>();

        // Add only unique elements to the ArrayList
        for (int num : array) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        // Convert the ArrayList back to an array
        int[] uniqueArray = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            uniqueArray[i] = uniqueList.get(i);
        }

        return uniqueArray;
    }
}
