package com.amigoscode.arrayConditionalsAndMethods;

public class E2 {

    /*
    Given the following String input
    String input = "   amig os cod e  "
    Write a method that transforms input into: Amigoscode
*/

    public static void main(String[] args) {

        String input = "   amig os cod e  ";
        System.out.println(removeSpaces(input));
    }

    public static String removeSpaces(String input) {

        if (input == null || input.isEmpty()) {
            return "Invalid input";
        }
//        String result = input.replaceAll(" ", "");

        String[] words = input.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word: words) {
            if (!word.isEmpty()) {
                result.append(word);
            }
        }

//        result = result.substring(0, 1).toUpperCase() + result.substring(1);
        result.replace(0, 1, result.substring(0, 1).toUpperCase());
        return result.toString();
    }
}
