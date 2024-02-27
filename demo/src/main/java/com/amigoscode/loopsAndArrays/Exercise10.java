package com.amigoscode.loopsAndArrays;

import java.util.Arrays;

public class Exercise10 {

    public static void main(String[] args) {
        // create an array. Remember to manually set the size
        // create a for loop which goes from 0 to 10, adding each value to an array
        // print our array
        int[] array = new int[11];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
    }
}
