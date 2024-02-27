package com.amigoscode.dataStructures;

import java.util.HashMap;

public class E1 {

    public static void main(String[] args) {

        // E1
        String[] input = {"1, 1, 1, 1, 3, 4, 5, 6, 7, 7, 7, 8, 8"};
        HashMap<String, Integer> result = countOccurrences(input);
        System.out.println(result);
        for (String key : result.keySet()) {
            System.out.println(key + " : " + result.get(key));
        }

        // E2
        System.out.println("most occurences: " + mostOccurrences(input));

    }

    // E1
    // given the string input, find the number of occurrences for each element
    // the method should return a map with the element as the key and the number of occurences as the value
    public static HashMap<String, Integer> countOccurrences(String[] input) {
        HashMap<String, Integer> occurrencesMap = new HashMap<>();
        for (String element : input) {
            String[] elements = element.trim().split(",\\s*");
            for (String e : elements) {
                occurrencesMap.put(e, occurrencesMap.getOrDefault(e, 0) + 1);
            }
        }
        return occurrencesMap;
    }

    // E2
    // find the element that has the most number of occurrences
    // the method should return something like 1 since it occurs 4 times
    public static String mostOccurrences(String[] input) {
        HashMap<String, Integer> occurrencesMap = countOccurrences(input);
        int max = 0;
        String maxElement = "";
        for (String key : occurrencesMap.keySet()) {
            if (occurrencesMap.get(key) > max) {
                max = occurrencesMap.get(key);
                maxElement = key;
            }
        }
        return maxElement;
    }

}
