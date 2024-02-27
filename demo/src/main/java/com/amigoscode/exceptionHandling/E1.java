package com.amigoscode.exceptionHandling;

public class E1 {

    public static void main(String[] args) {

        // write a program that converts program arguments to an integer
        // if value cannot be converted to int store them somewhere
        // calculate sum for numbers that can be converted to int
        // finally print the numbers that cannot be converted to an int

        int sum = 0;
        StringBuilder nonInts = new StringBuilder();

        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                sum += num;
            } catch (NumberFormatException e) {
                if (nonInts.length() > 0) {
                    nonInts.append(", ");
                }
                nonInts.append(arg);
            }
        }
        System.out.println("Sum: " + sum);

        if (nonInts.length() > 0) {
            System.out.println("Non-integers: " + nonInts);
        }
    }
}
