package com.geeksforgeeks.problems.Arrays;

public class MaxInArray {

    public static void main(String[] args) {
        int[] numbers = {4,2,6,3};
        maxInArray(numbers);
    }

    private static void maxInArray(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int num: numbers) {
            if(num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}
