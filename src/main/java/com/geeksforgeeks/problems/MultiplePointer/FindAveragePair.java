package com.geeksforgeeks.problems.MultiplePointer;

public class FindAveragePair {

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 4}; // 2.5
        int[] nums2 = {-2,0,1,2,4,5,6,7}; // 5.5

        findAveragePair(nums1, 2.5f);
        findAveragePair(nums2, 5.5f);
    }

    private static void findAveragePair(int[] nums, float givenAvg) {
        int start = 0;
        int end = nums.length-1;

        while (start < end) {
            float avg = ((float) nums[start] + nums[end]) / 2;

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
