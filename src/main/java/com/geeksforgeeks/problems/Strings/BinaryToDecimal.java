package com.geeksforgeeks.problems.Strings;

import java.util.Map;

public class BinaryToDecimal {

    public static void main(String[] args) {
        binaryToDecimal("1010");
    }

    private static void binaryToDecimal(String num) {
        int decimal = 0;
        int k = 1;
        for (int i = num.length()-1; i >= 0; i--) {
            decimal += ((num.charAt(i))-'0') * k;
            k *= 2;
        }
        System.out.println(decimal);
    }
}
