package com.geeksforgeeks.problems.FrequencyCounter;

import java.util.Arrays;
import java.util.HashMap;

public class WordFrequencyCounter {

    public static void main(String[] args) {
        String word = "My name is Xyz He is Abc Is he allright";
        wordFrequencyCounter(word);
    }

    private static void wordFrequencyCounter(String word) {
        // word = word.toLowerCase();
        String[] words = word.split(" ");

        HashMap<String,Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
//            if(map.containsKey(words[i])) {
//                map.put(words[i], map.get(words[i]) + 1);
//            } else {
//                map.put(words[i],1);
//            }
            map.put(words[i].toLowerCase(), map.getOrDefault(words[i].toLowerCase(),0) + 1);
        }

        System.out.println(map);
    }
}
