package com.geeksforgeeks.problems.FrequencyCounter;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {

    public static void main(String[] args) {
        String first = "fried";
        String second = "fired";
        System.out.println(checkIsAnagram(first,second) ? "Yes" : "No");
    }

    private static boolean checkIsAnagram(String first, String second) {

        if (first.length() != second.length()){
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < first.length(); i++) {
            if(map1.containsKey(first.charAt(i))) {
                map1.put(first.charAt(i), map1.get(first.charAt(i) + 1));
            } else {
                map1.put(first.charAt(i),1);
            }
        }

        for (int i = 0; i < second.length(); i++) {
            if(map2.containsKey(second.charAt(i))) {
                map2.put(second.charAt(i), map2.get(second.charAt(i) + 1));
            } else {
                map2.put(second.charAt(i),1);
            }
        }

        for (Map.Entry<Character,Integer> entry: map1.entrySet()) {

            if(!map2.containsKey(entry.getKey())) return false;

            if(entry.getValue() != map2.get(entry.getKey())) return false;
        }

        return true;
    }
}
