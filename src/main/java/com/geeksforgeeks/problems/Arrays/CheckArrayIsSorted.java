package com.geeksforgeeks.problems.Arrays;

public class CheckArrayIsSorted {

    public static void main(String[] args) {
        int[] numbers = {10,20,30};
        checkArrayIsSorted(numbers);
    }

    private static void checkArrayIsSorted(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i-1] > numbers[i]) {
                System.out.println("Not sorted");
            }
        }
        System.out.println("Sorted");
    }
}
