package com.amigoscode.loopsAndArrays;

import java.util.Arrays;

public class Exercise3 {

    public static void main(String[] args) {
        // reassign the second value in the array to 17
        // print the array to the console
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 4;
            System.out.println(numbers[i]);
        }
        numbers[1] = 17;
        System.out.println(Arrays.toString(numbers));


    }
}
