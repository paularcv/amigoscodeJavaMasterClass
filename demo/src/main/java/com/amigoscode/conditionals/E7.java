package com.amigoscode.conditionals;

public class E7 {
    public static void main(String[] args) {

        // create a String variable and assign it a value
        // create an `if` statement which grabs the first letter of your word and compares it against a Character value
        // print something to the console if the condition is met

        String string1 = "Test";
        if (string1.charAt(0) == 'a') {
            System.out.println("The first character is a");
        } else {
            System.out.println("The first character is not a");
        }

        // case insensitive
        if (string1.toLowerCase().charAt(0) == 't') {
            System.out.println("The first character is t");
        } else {
            System.out.println("The first character is not t");
        }
    }
}
