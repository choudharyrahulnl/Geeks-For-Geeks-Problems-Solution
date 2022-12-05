package com.geeksforgeeks.problems.Arrays;

public class AvgOfArray {

    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        avgOfArray(numbers);
    }

    private static void avgOfArray(int[] numbers) {
        int sum = 0;
        for (int num: numbers) {
            sum += num;
        }
        System.out.println(sum/ numbers.length);
    }
}
