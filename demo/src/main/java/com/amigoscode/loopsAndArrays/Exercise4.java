package com.amigoscode.loopsAndArrays;

public class Exercise4 {

    public static void main(String[] args) {
        // what happens when you try to reassign index 5 to any integer?
        int[] numbers = {1,2, 3, 4, 5};
        numbers[5] = 6;

        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        //	at com.amigoscode.loopsAndArrays.Exercise4.main(Exercise4.java:8)


    }
}
