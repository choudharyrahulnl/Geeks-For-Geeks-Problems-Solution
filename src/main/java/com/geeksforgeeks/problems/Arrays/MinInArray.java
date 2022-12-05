package com.geeksforgeeks.problems.Arrays;

public class MinInArray {

    public static void main(String[] args) {
        int[] numbers = {4,2,6,3};
        minInArray(numbers);
    }

    private static void minInArray(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int num: numbers) {
            if(num < min) {
                min = num;
            }
        }
        System.out.println(min);
    }
}
