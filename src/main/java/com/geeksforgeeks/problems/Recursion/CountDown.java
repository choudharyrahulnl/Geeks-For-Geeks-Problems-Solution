package com.geeksforgeeks.problems.Recursion;

public class CountDown {

    public static void main(String[] args) {

        countDown(5);
    }

    private static void countDown(int num) {
        // Base Case
        if(num <= 0) {
            System.out.println();
            System.out.println("All done");
            return;
        }

        System.out.print(num + " ");

        num--;

        countDown(num);
    }
}
