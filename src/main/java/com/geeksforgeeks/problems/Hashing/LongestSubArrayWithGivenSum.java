package com.geeksforgeeks.problems.Hashing;

import java.util.HashMap;

public class LongestSubArrayWithGivenSum {

    public static void main(String[] args) {
        int[] num0 = {8,3,1,5,-6,6,2,2}; // givenSum 4 and answer 4
        int[] num1 = {5,8,-4,-4,9,-2,2}; // givenSum 0 and answer 3
        int[] num2 = {3,1,0,1,8,2,3,6}; // givenSum 5 and answer 4
        int[] num3 = {8,3,7}; // givenSum 15 and answer 0

        System.out.println(findLongestSubArrayWithGivenSum(num0,4));
        System.out.println(findLongestSubArrayWithGivenSum(num1,0));
        System.out.println(findLongestSubArrayWithGivenSum(num2,5));
        System.out.println(findLongestSubArrayWithGivenSum(num3,15));
    }

    private static int findLongestSubArrayWithGivenSum(int[] num, int givenSum) {

        // {8,3,1,5,-6,6,2,2} -> {8,11,12,17,11,17,19,21}
        HashMap<Integer,Integer> map = new HashMap<>();
        int prefixSum = 0;
        int longestSubArray = 0;
        for (int i = 0; i < num.length; i++) {

            prefixSum = prefixSum + num[i];

            // if map contains prefixSum-givenSum then calculate the length
            if(map.containsKey(prefixSum-givenSum)) {
                longestSubArray = Math.max(longestSubArray, i - map.get(prefixSum-givenSum));
            }

            // corner case
            if(prefixSum == givenSum) {
                return i + 1;
            }

            // if map do not contain prefixSum add it, value will be position/index
            if(!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }


        }

        return longestSubArray;
    }
}
