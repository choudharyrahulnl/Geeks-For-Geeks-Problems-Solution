package com.geeksforgeeks.problems.MultiplePointer;

public class FindAveragePair {

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 4}; // 3.5
        int[] nums2 = {-2,0,1,2,4,5,6,7}; // 5.5

        findAveragePair(nums1, 3.5);
        findAveragePair(nums2, 5.5);
    }

    private static void findAveragePair(int[] nums, double givenAvg) {
        int start = 0;
        int end = nums.length-1;

        while (start < end) {
            int avg = (nums[start] + nums[end]) / 2;

            if(avg == givenAvg) {
                System.out.println(start + ", " + end);
                return;
            } else if(avg > givenAvg) {
                end--;
            } else {
                start++;
            }
        }
        System.out.println("not found");
    }
}
