package com.amigoscode.loopsAndArrays;

public class Exercise11 {

    public static void main(String[] args) {
        // create an array of n numbers
        // create a sum variable
        // create a loop
        // add each item to the sum value
        // outside the loop print the total sum
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
        System.out.println(1+2+3+4+5+6+7+8+9+10);
    }
}
