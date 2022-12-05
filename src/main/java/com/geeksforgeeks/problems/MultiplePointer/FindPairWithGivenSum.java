package com.geeksforgeeks.problems.MultiplePointer;

import java.util.HashMap;

public class FindPairWithGivenSum {

    public static void main(String[] args) {
        int[] nums = {10, 20, 35, 50, 75, 80};

        findPairWithGivenSum(nums, 70);
    }

    private static void findPairWithGivenSum(int[] nums, int givenSum) {
        // Solution 1
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if(map.containsKey(givenSum-nums[i])) {
//                System.out.println(map.get(givenSum-nums[i]) + ", " + i);
//                return;
//            } else {
//                map.put(nums[i], i);
//            }
//        }
//        System.out.println("not found");

        // Solution 2 {10, 20, 35, 50, 75, 80}
        int start = 0;
        int end = nums.length-1;
        while (start < end) {
            if(nums[start] + nums[end] > givenSum) {
                end--;
            }

            if(nums[start] + nums[end] < givenSum) {
                start++;
            }

            if(nums[start] + nums[end] == givenSum) {
                System.out.println(start + ", " + end);
                return;
            }
        }
        System.out.println("not found");
    }
}
