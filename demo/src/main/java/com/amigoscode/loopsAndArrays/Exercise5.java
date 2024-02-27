package com.amigoscode.loopsAndArrays;

import java.util.Arrays;

public class Exercise5 {

    public static void main(String[] args) {
        // declare and initialize a String array which holds the values "a", "b", "c" and "d"
        // print the array to the console
        String[] letters = {"a", "b", "c", "d"};
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }
        System.out.println(Arrays.toString(letters));

    }
}
