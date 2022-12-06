package com.geeksforgeeks.problems.Recursion;

public class Factorial {

    public static void main(String[] args) {

        System.out.println(factorial(5)); // 120
    }

    private static int factorial(int num) {
        // 5 -> 5 * 4 * 3 * 2 *1
        if(num == 1) {
            return 1;
        }

        return num * factorial(num-1);
    }
}
