package com.geeksforgeeks.problems.Strings;

import java.util.HashMap;

public class FirstUniqueCharInString {

    public static void main(String[] args) {
        System.out.println(firstUniqueCharInString("leetcode")); // 0
        System.out.println(firstUniqueCharInString("loveleetcode")); // 2
        System.out.println(firstUniqueCharInString("aabb")); // -1
    }

    private static int firstUniqueCharInString(String s) {

        if(s.length() == 0) {
            return -1;
        }

        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
        }
        System.out.println(map);

        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
