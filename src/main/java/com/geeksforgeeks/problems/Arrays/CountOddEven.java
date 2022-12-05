package com.geeksforgeeks.problems.Arrays;

public class CountOddEven {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        countOddEven(numbers);
    }

    private static void countOddEven(int[] numbers) {
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if((numbers[i] % 2) == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Odd count " + oddCount);
        System.out.println("Even count " + evenCount);
    }
}
