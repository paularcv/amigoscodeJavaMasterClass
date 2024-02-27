package com.amigoscode.loopsAndArrays;

public class Exercise8 {

    public static void main(String[] args) {
        String[] a = {"a", "b", "c", "d"};
        // create a `for` loop which prints each item in the array
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        for (String letter : a) {
            System.out.println(letter);
        }
    }

}
