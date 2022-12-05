package com.geeksforgeeks.problems.Strings;

public class PatternSearching {

    public static void main(String[] args) {
        String pattern = "geeks";
        String text = "geeks for geeks";
        patternSearch(text,pattern);
    }

    private static void patternSearch(String text, String pattern) {
        int position = text.indexOf(pattern);
        while (position >= 0) {
            System.out.println(position);
            position = text.indexOf(pattern, position + 1);
        }
    }
}
