package com.geeksforgeeks.problems.Recursion;

public class SumRange {

    public static void main(String[] args) {

        System.out.println(sumRange(1)); // 1
        System.out.println(sumRange(2)); // 3
        System.out.println(sumRange(3)); // 6
        System.out.println(sumRange(4)); // 10
    }

    private static int sumRange(int num) {

        if(num == 1) {
            return 1;
        }

        // 4 -> 4 + 3 + 2 + 1
        return num + sumRange(num - 1);
    }
}
