package com.amigoscode.conditionals;

public class E8 {
    public static void main(String[] args) {

        // create a String variable and assign it a value
        // create a `for` loop which wraps around your answer from Question 7
        // modify your `if` statement to check the character at each index
        // Hint: use your internal, incrementing value of your `for` loop within the `.charAt()` method
        // print something to the console if the condition is met

        String string = "Hello World";
        // specify the character to check for:
        char searchChar = 'o';
        boolean charFound = false;
        int numberOfOs = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.toLowerCase().charAt(i) == searchChar) {
                charFound = true;
                numberOfOs++;
            }
        }

        if (charFound) {
            System.out.println("The character " + searchChar + " was found " + numberOfOs + " times in the string");
        } else {
            System.out.println("The character " + searchChar + " was not found in the string");
        }



    }
}
