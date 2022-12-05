package com.geeksforgeeks.problems.FrequencyCounter;

import java.util.HashMap;
import java.util.Map;

public class SecondArraySameOfFirst {

    public static void main(String[] args) {
        int[] num1 = {1, 8, 3};
        int[] num2 = {1, 8, 3};
        boolean isEqual = checkIfSecondArrayIsSameOfFirst(num1, num2);
        System.out.println(isEqual ? "Equal" : "Not Equal");
    }

    private static boolean checkIfSecondArrayIsSameOfFirst(int[] num1, int[] num2) {
        // Check if both array length are equal
        if (num1.length != num2.length) {
            return false;
        }

        // CREATE MAP OBJETS
        HashMap<Integer, Integer> map1 = new HashMap();
        HashMap<Integer, Integer> map2 = new HashMap();

        // Loop over first array
        for (Integer num : num1) {
            if (map1.get(num) == null) {
                map1.put(num, 1);
            } else {
                map1.put(num, map1.get(num) + 1);
            }
        }
        System.out.println(map1);

        for (Integer num : num2) {
            if (map2.get(num) == null) {
                map2.put(num, 1);
            } else {
                map2.put(num, map2.get(num) + 1);
            }
        }
        System.out.println(map2);

        // Loop over and check
        for(Map.Entry<Integer, Integer> entry: map1.entrySet()) {
            // check if key exists
            if (map2.get(entry.getKey()) == null) return false;

            // check values are matching
            if(entry.getValue() != map2.get(entry.getKey())) return false;
        }

        return true;
    }
}
