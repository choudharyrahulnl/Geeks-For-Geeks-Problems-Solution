package com.geeksforgeeks.problems.MultiplePointer;

/**
 * Multiple Pointer
 * CREATING POINTER/VALUE THAT CORRESPOND TO AN INDEX/POSITION AND MOVE TOWARDS
 * THE BEGINNING, END OR MIDDLE BASED ON CERTAIN CONDITION
 * VERY EFFICIENT FOR SOLVING PROBLEMS WITH MINIMAL SPACE COMPLEXITY
 *
 * Array should be sorted
 * Used for searching pair in sorted array
 *
 * array question deals with finding two numbers in an array that satisfy a certain condition,
 * either directly or indirectly, two-pointer should be the first strategy that comes to mind
 *
 *
 */
public class FindPairWithSumZero {

    public static void main(String[] args) {
        // find first pair with sum zero
        int[] nums1 = {-3,-2,-1,0,1,2,3};
        int[] nums2 = {-2,0,1,3};
        int[] nums3 = {1,2,3};

        findPairWithSumZero(nums1);
        findPairWithSumZero(nums2);
        findPairWithSumZero(nums3);
    }

    private static void findPairWithSumZero(int[] nums) {

        int start = 0;
        int end = nums.length-1;

        while (start < end) {
            if(nums[start] + nums[end] == 0) {
                System.out.println(start + ", " + end);
                return;
            }
            start++;
            end--;
        }
        System.out.println("not found");
    }
}
