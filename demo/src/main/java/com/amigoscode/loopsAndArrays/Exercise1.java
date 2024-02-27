package com.amigoscode.loopsAndArrays;

import java.util.Arrays;

public class Exercise1 {

    public static void main(String[] args) {
        // declare an empty integer array of length = 3
        // print the contents to the console
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println(Arrays.toString(numbers));
    }
}
