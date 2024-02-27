package com.amigoscode.loopsAndArrays;

import java.util.Arrays;

public class Exercise7 {

    public static void main(String[] args) {
        // using your answer to Q6, create another array which is A COPY off of your original array (using the `Arrays.copyOf()` method)
        // NOTE that the `.copyOf()` method accepts two arguments, first being the array that's being copied and second being the length of the new array
        // change the value at index 0 of the new array to "z"
        // print both of the arrays and compare
        String[] letters1 = {"a", "b", "c", "d"};
        String[] letters2 = Arrays.copyOf(letters1, letters1.length);
        letters2[0] = "z";
        System.out.println(Arrays.toString(letters1));
        System.out.println(Arrays.toString(letters2));
    }
}
