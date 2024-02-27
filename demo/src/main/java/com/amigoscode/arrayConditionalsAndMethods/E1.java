package com.amigoscode.arrayConditionalsAndMethods;

public class E1 {

    /*
    Write a method that reverses any String and print to console
    Input should be a string
    Output should be reversed input
*/

    public static void main(String[] args) {
//        String string1 = "test";
//        String string2 = "this is a longer test string";
//
//        String reversedString = "";
//
//        for (int i = string2.length()-1; i>=0; i--) {
//            reversedString += string2.charAt(i);
//        }
//        System.out.println(reversedString);


        String input = "Hello, World!";
        String reversedInput = reverseString(input);
        System.out.println(reversedInput);
    }


    public static String reverseString(String input){
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();

    }

}
