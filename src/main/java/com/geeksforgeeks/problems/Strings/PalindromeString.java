package com.geeksforgeeks.problems.Strings;

public class PalindromeString {

    public static void main(String[] args) {
        String input = "abba";
        checkForPalindrome(input);
    }

    private static void checkForPalindrome(String input) {
        int start = 0;
        int end = input.length()-1;
        while (start < end) {
            if(input.charAt(start) != input.charAt(end)){
                System.out.println("Not a palindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println("Palindrome");
    }
}
