package com.geeksforgeeks.problems.Arrays;

public class SumOfArray {

    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        sumOfArray(numbers);
    }

    private static void sumOfArray(int[] numbers) {
        int sum = 0;
        for (int num: numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}
