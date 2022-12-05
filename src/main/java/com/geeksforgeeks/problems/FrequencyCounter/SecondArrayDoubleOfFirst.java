package com.geeksforgeeks.problems.FrequencyCounter;

import java.util.HashMap;
import java.util.Map;

/**
 * THIS PATTERN USES OBJECTS OR SETS TO COLLECT VALUES/FREQUENCIES OF VALUES
 * THIS CAN OFTEN AVOID NEED OF NESTED LOOPS OR O(n^2) OPERATIONS WITH ARRAYS AND STRINGS
 *
 * Used to compare 2 arrays or string like arrays are same or double
 * String are anagram
 * This pattern reduces the time complexity from O(N²) to O(N)
 */
public class SecondArrayDoubleOfFirst {

    public static void main(String[] args) {
        int[] num1 = {1, 2, 3};
        int[] num2 = {1, 4, 9};
        boolean isEqual = checkIfSecondArrayIsDoubleOfFirst(num1, num2);
        System.out.println(isEqual ? "Equal" : "Not Equal");
    }

    private static boolean checkIfSecondArrayIsDoubleOfFirst(int[] num1, int[] num2) {
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
            if (map2.get(entry.getKey() * entry.getKey()) == null) return false;

            // check values are matching
            if(entry.getValue() != map2.get(entry.getKey() * entry.getKey())) return false;
        }

        return true;
    }
}
