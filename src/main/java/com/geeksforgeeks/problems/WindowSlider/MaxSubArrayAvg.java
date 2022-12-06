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
public class MaxSubArrayAvg {

    public static void main(String[] args) {
        int[] num1 = {1,2,5,2,8,1,5};
        int[] num2 = {1,2,5,2,8,1,5};
        int[] num3 = {4,2,1,6};
        int[] num4 = {4,2,1,6,2};
        int[] num5 = {};
        int[] num6 = {1, 12, -5, -6, 50, 3};

        findMaxSubArrayAvg(num1, 2); // 10
        findMaxSubArrayAvg(num2, 4); // 17
        findMaxSubArrayAvg(num3, 1); // 6
        findMaxSubArrayAvg(num4, 4); // 13
        findMaxSubArrayAvg(num5, 4); // null
        findMaxSubArrayAvg(num6, 4); // 12.75
    }

    private static void findMaxSubArrayAvg(int[] nums, int num) {

        if(nums.length == 0) {
            System.out.println("null");
            return;
        }

        int maxSum=0;
        int tempSum=0;
        float maxAvg;

        for (int i = 0; i < num; i++) {
            maxSum += nums[i];
        }

        tempSum=maxSum;

        for (int i = num; i < nums.length; i++) {
            tempSum += nums[i] - nums[i-num];
            maxSum = Math.max(maxSum,tempSum);
        }

        maxAvg = (float) maxSum/num;
        System.out.println(maxAvg);
    }

}
