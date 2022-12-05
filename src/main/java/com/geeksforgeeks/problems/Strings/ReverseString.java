package com.geeksforgeeks.problems.Strings;

public class ReverseString {

    public static void main(String[] args) {
        String input = "geeks";
        reverseString(input);
    }

    private static void reverseString(String input) {
        String reverse = "";
        char[] chars = input.toCharArray();
        for (Character c: chars) {
            reverse = c + reverse;
        }
        System.out.println(reverse);
    }
}
