package com.amigoscode.loopsAndArrays;

public class Exercise12 {

    public static void main(String[] args) {
        String[] array = {"i", "sure", "do", "love", "bees"};
        // create a for loop which goes through each string in our array
        // make each word uppercase
        // assign the value in the array to the uppercase string
        // print our resulting array
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toUpperCase();
        }
        for (String word : array) {
            System.out.println(word);
        }
    }
}
