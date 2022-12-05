package com.geeksforgeeks.problems.Strings;

public class DecimalToBinary {

    public static void main(String[] args) {
        decimalToBinary(10);
    }

    private static void decimalToBinary(int num) {
        String s = "";
        while (num > 0) {
            s = (num % 2) + s;
            num = num/2;
        }
        System.out.println(s);
    }
}
