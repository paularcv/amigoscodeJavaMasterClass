package com.amigoscode.conditionals;

public class E3 {
    public static void main(String[] args) {
        String string1 = new String("hello");
        String string2 = new String("hello");

        if (string1 == string2) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are not the same");
        }

        if (string1.equals(string2)) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are not the same");
        }
    }
}
