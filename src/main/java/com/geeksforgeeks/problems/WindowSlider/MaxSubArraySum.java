package com.geeksforgeeks.problems.WindowSlider;

/**
 * THIS PATTERN INVOLVES CREATING A WINDOW WHICH CAN EITHER BE AN ARRAY OR
 * A NUMBER FROM ONE POSITION TO OTHER
 * DEPENDING ON A CERTAIN CONDITION, WINDOW CAN EITHER BE INCREASES OR CLOSES (AND NEW WINDOW IS CREATED)
 * VERY USEFUL TO KEEP TRACK OF SUBSET OF DATA IN AN ARRAY/STRING etc
 *
 * very useful to solve problems in which you are asked to find the longest/shortest string, subarray,
 * or a desired value which you need to calculate from sub arrays.
 *
 * The basic idea behind the sliding window technique is to transform two nested loops into a single loop.
 * The problem will be based on an array, list or string type of data structure
 * It will ask to find subrange in that array or string will have to give longest, shortest, or target values
 * Its concept is mainly based on ideas like the longest sequence or shortest sequence of something that
 * satisfies a given condition perfectly.
 *
 * Max Avg Sub Array
 *
 */
public class MaxSubArraySum {

    public static void main(String[] args) {
        int[] num1 = {1,2,5,2,8,1,5};
        int[] num2 = {1,2,5,2,8,1,5};
        int[] num3 = {4,2,1,6};
        int[] num4 = {4,2,1,6,2};
        int[] num5 = {};

        findMaxSubArraySum(num1, 2); // 10
        findMaxSubArraySum(num2, 4); // 17
        findMaxSubArraySum(num3, 1); // 6
        findMaxSubArraySum(num4, 4); // 13
        findMaxSubArraySum(num5, 4); // null
    }

    private static void findMaxSubArraySum(int[] nums, int num) {

        if(nums.length == 0) {
            System.out.println("null");
            return;
        }

        int maxSum=0;
        int tempSum=0;

        for (int i = 0; i < num; i++) {
            maxSum += nums[i];
        }

        tempSum = maxSum;

        for (int i = num; i < nums.length; i++) {
            tempSum += nums[i] - nums[i-num];
            maxSum = Math.max(maxSum,tempSum);
        }

        System.out.println(maxSum);
    }

}
