package com.geeksforgeeks.problems.Hashing;

import java.util.HashMap;

public class FrequencyOfArrayElements {

    public static void main(String[] args) {
        int[] num = {10,12,10,15,10,20,12,12};

        frequencyOfArrayElement(num);
    }

    private static void frequencyOfArrayElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums) {
            if(map.containsKey(num)) {
                map.put(num,map.get(num)+1);
            } else {
                map.put(num,1);
            }
        }

        System.out.println(map);
    }
}
