package com.geeksforgeeks.problems.Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class AddUpToGivenTarget {

    public static void main(String[] args) {
        int[] nums = {1,3,7,9,2};

        findIndicesOfTwoNumberThatAddUptoTarget(nums,11);;
    }

    private static void findIndicesOfTwoNumberThatAddUptoTarget(int[] nums, int target) {


        if(nums.length == 0) {
            System.out.println("Not found");
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if(map.containsKey(nums[i])) {
                System.out.println(nums[i] + ", " + i);
            } else {
                map.put(target-nums[i], i);
            }
        }

        System.out.println("Not found");
    }
}
