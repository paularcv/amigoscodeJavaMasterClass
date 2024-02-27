package com.amigoscode.conditionals;

public class E2 {

    public static void main(String[] args) {
        String string1 = "test";
        String string2 = "test";
        if (string1.equals(string2)) {
            System.out.println("The strings are equal");
        } else {
            System.out.println("The strings are not equal");
        }

        if (string1 == string2){
            System.out.println("The strings are equal");
        } else {
            System.out.println("The strings are not equal");
        }
    }
}
