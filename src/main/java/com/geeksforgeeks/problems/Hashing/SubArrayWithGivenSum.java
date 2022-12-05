package com.geeksforgeeks.problems.Hashing;

import java.util.HashSet;

public class SubArrayWithGivenSum {

    public static void main(String[] args) {
        int[] num1 = {5,8,6,13,3,-1}; // sum 22 answer yes
        int[] num2 = {15,2,8,10,-5,-8,6}; // sum 3 answer yes
        int[] num3 = {3,2,5,6}; // sum 10 answer yes

        System.out.println(findSubArrayWithGivenSum(num1,22));
        System.out.println(findSubArrayWithGivenSum(num2,3));
        System.out.println(findSubArrayWithGivenSum(num3,10));
    }

    private static boolean findSubArrayWithGivenSum(int[] num, int givenSum) {

        if(num.length == 0) return false;

        HashSet<Integer> set = new HashSet<>();
        int prefixSum = 0;

        for (int i = 0; i < num.length; i++) {

            prefixSum = prefixSum + num[i];

            // {5,8,6,13,3,-1} -> prefixSum Array {5,13,19,32,35,34}
            // 35 - 22 = 13 which is present in prefix sum
            // 19,32,35 is the sub array with sum 22 or index 2 to 4
            // in original array index 2 to 4 is 6,13,3
            if(set.contains(prefixSum-givenSum)) {
                return true;
            }

            // corner case
            // {1,2,4,7} -> {1,3,7,14} and givenSum is 3
            // we don't find it, so we just check the prefixSum == givenSum
            if(prefixSum == givenSum) {
                return true;
            }

            set.add(prefixSum);
        }

        return false;

    }
}
