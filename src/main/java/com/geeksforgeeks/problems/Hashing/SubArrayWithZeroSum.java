package com.geeksforgeeks.problems.Hashing;

import java.util.HashSet;

public class SubArrayWithZeroSum {

    public static void main(String[] args) {
        int[] numbers = {1,4,13,-3,-10,5};
        boolean subArrayWithSumZero = findSubArrayWithSumZero(numbers);
        System.out.println(subArrayWithSumZero);

        int[] numbers2 = {3,-1,-2,5};
        boolean subArrayWithSumZero2 = findSubArrayWithSumZero(numbers2);
        System.out.println(subArrayWithSumZero2);
    }

    private static boolean findSubArrayWithSumZero(int[] numbers) {
        // if length is 0 return false
        if (numbers.length == 0 ) return false;

        // Using HashSet to find repeated element
        HashSet<Integer> set = new HashSet<>();
        int prefixSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            prefixSum = prefixSum + numbers[i];

            // find prefix sum
            // if element in prefix sum array is repeated it means we find subarray
            // {1,4,13,-3,-10,5} -> {1,5,18,15,5,10}
            if(set.contains(prefixSum)) {
                return true;
            }

            // corner case: starting from index 0 we find subarray sum = 0 ie 3,-1,-2
            // {3,-1,-2,5} -> {3,2,0,5}
            if(prefixSum == 0) {
                return true;
            }

            set.add(prefixSum);
        }

        return false;
    }
}
