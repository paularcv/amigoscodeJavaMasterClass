package com.amigoscode.loopsAndArrays;

import java.util.Arrays;

public class Exercise6 {

    public static void main(String[] args) {
        // using your answer from Q5 above, create a second array which is initialized using your original array
        // hint: instead of using the `new` keyword, try simply giving the name of your original array
        // change the value at index 0 of the new array to "z"
        // print both of your arrays and compare
        String[] letters1 = {"a", "b", "c", "d"};
        String[] letters2 = letters1;
        letters2[0] = "z";
        System.out.println(Arrays.toString(letters1));
        System.out.println(Arrays.toString(letters2));

    }
}
