package me.hossain.ebrahim;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        sortArray(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }
}
