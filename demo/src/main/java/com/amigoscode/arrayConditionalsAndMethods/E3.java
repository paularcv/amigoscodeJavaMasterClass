package com.amigoscode.arrayConditionalsAndMethods;

public class E3 {
//    Write a method that finds the longest string in any given array.
//    i.e. [] -> ""
//    i.e. ["hello", "ola", "bye", "ciao"] -> hello
//    i.e. ["hello", "hello", "ola", "bye", "ciao"] -> hello
//    i.e. ["hello", "bingo", "ola", "bye", "ciao"] -> hello, bingo
    public static void main(String[] args) {
        String[] array1 = {};
        String[] array2 = {"hello", "ola", "bye", "ciao"};
        String[] array3 = {"hello", "hello", "ola", "bye", "ciao"};
        String[] array4 = {"hello", "bingo", "ola", "bye", "ciao"};

        System.out.println("Longest string in array1: \"" + findLongestString(array1) + "\"");
        System.out.println("Longest string in array2: \"" + findLongestString(array2) + "\"");
        System.out.println("Longest string in array3: \"" + findLongestString(array3) + "\"");
        System.out.println("Longest string in array4: \"" + findLongestString(array4) + "\"");
    }

    public static String findLongestString(String[] input) {
        if (input == null || input.length == 0) {
            return "";
        }
        String longestString = "";
        for (String word : input) {
            if (word.length() > longestString.length()) {
                longestString = word;
            }
        }
        return longestString;
    }
}
