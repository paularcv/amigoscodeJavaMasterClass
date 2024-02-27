package com.amigoscode.loopsAndArrays;

import java.util.Arrays;

public class Exercise13 {

    public static void main(String[] args) {
        String[] array = {"i", "sure", "do", "love", "bees"};
        // create a for loop which goes through each string in our array
        // grab the first letter of our word
        // capitalise the first letter
        // add the capitalised letter to the rest of the provided word
        // assign the value to an array
        // print our resulting array

//        for (int i = 0; i < array.length; i++) {
//            String word = array[i];
//            String firstLetter = word.substring(0, 1).toUpperCase();
//            String restOfWord = word.substring(1);
//            String capitalisedWord = firstLetter + restOfWord;
//            array[i] = capitalisedWord;
//        }

        for (int i = 0; i < array.length; i++) {
            String word = array[i];
            array[i] = Character.toUpperCase(word.charAt(0)) + word.substring(1);
        }

        System.out.println(Arrays.toString(array));
    }
}
