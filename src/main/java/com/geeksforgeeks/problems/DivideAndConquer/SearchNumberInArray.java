package com.geeksforgeeks.problems.DivideAndConquer;

/**
 * THIS PATTERN INVOLVES DIVIDING A DATA SET INTO SMALLER CHUNKS &
 * THEN REPEATING A PROCESS WITH A SUBSET OF DATA
 * THIS PROCESS TREMENDOUSLY DECREASE TIME COMPLEXITY
 *
 * TimeComplexity O(N)
 */
public class SearchNumberInArray {

    public static void main(String[] args) {
        int[] num1 = {1,2,3,4,5,6}; // index 3
        int[] num2 = {1,2,3,4,5,6}; // index 5
        int[] num3 = {1,2,3,4,5,6}; // index -1

        System.out.println(searchNumberInArray(num1, 4));
        System.out.println(searchNumberInArray(num2, 6));
        System.out.println(searchNumberInArray(num3, 11));
    }

    private static int searchNumberInArray(int[] nums, int num) {

        if(nums.length == 0) {
            return -1;
        }

        if(nums.length == 1 && nums[0] == num) {
            return 0;
        }

        // Divide and Conquer
        int min = 0;
        int max = nums.length-1;

        while (min <= max) {

            int middle = (int)Math.floor((min+max)/2);

            if(nums[middle] < num) {
                min = middle + 1;
            } else if (nums[middle] > num) {
                max = middle-1;
            } else {
                return middle;
            }
        }

        return -1;
    }
}
