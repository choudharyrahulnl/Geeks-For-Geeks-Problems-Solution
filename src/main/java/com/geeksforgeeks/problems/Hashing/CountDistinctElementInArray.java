package com.geeksforgeeks.problems.Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class CountDistinctElementInArray {

    public static void main(String[] args) {

        Integer[] numbers = {10,20,10,20,30};

        HashSet<Integer> set = new HashSet<>(Arrays.asList(numbers));
        System.out.println(set.size());
    }
}
