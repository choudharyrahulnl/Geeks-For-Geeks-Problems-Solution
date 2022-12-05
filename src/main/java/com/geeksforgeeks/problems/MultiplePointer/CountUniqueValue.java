package com.geeksforgeeks.problems.MultiplePointer;

public class CountUniqueValue {
    public static void main(String[] args) {
        Integer[] nums1 = {1, 1, 1, 1, 1, 1, 2}; // 2
        Integer[] nums2 = {1, 2, 3, 4, 4, 4, 7, 7, 12, 12, 13}; // 7
        Integer[] nums3 = {0}; // 1
        Integer[] nums4 = {-2, -1, -1, 0, 1}; // 4

        countUniqueValue(nums1);
        countUniqueValue(nums2);
        countUniqueValue(nums3);
        countUniqueValue(nums4);
    }

    private static void countUniqueValue(Integer[] nums) {

        if (nums.length == 0) {
            System.out.println(0);
        }

        // Solution 1
//         HashSet<Integer> set = new HashSet<>(Arrays.asList(nums));
//         System.out.println(set.size());

        // Solution 2
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for (int i = 0; i < nums.length; i++) {
//            if(!map.containsKey(nums[i])) {
//                map.put(nums[i],1);
//            }
//         }
//         System.out.println(map.size());

        // Solution 3 : This depends on Array to be sorted
//        int start = 0;
//        int end = 1;
//        int uniqueCount = 1;
//
//        while (end < nums.length) {
//            if (nums[start] != nums[end]) uniqueCount++;
//            start++;
//            end++;
//        }
//        System.out.println(uniqueCount);
    }
}
