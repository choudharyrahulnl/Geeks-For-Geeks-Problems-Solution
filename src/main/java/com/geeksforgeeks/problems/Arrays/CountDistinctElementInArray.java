package com.geeksforgeeks.problems.Arrays;

import java.util.HashMap;

public class CountDistinctElementInArray {

    public static void main(String[] args) {
        int[] numbers = {10,20,10,20,30};
        countDistinctElement(numbers);
    }

    private static void countDistinctElement(int[] numbers) {
        int count = 0;
        HashMap<Integer, Integer> map= new HashMap<>();
        for (int num: numbers) {
            if(!map.containsKey(num)) {
                map.put(num, 1);
                count++;
            }
        }
        System.out.println(count);
    }
}
