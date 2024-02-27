package com.amigoscode.methods;

public class Main {

    public static void main(String[] args) {

        // Exercise
        System.out.println("Rental Yield: " + calculateRentalYield(1200, 100000) + "%");

        // Exercise 7
        String sentence = "Hello, this is a sample sentence.";

        int wordCount = countWordsInSentence(sentence);
        System.out.println("The sentence contains " + wordCount + " words.");
    }

    // Exercise
    // Create a method that calculates rental yields
    private static double calculateRentalYield(double monthlyRent, double propertyValue) {
        double annualRentalIncome = monthlyRent * 12;
        return (annualRentalIncome / propertyValue) * 100;
    }

    // Exercise 1
    private static void printSumOfTwoNumbers(int number1, int number2) {
        System.out.println(number1 + number2);
    }

    // Exercise 2
    // Write a method which takes a number as an argument and returns that number negated, e.g. passing 5 as an argument should return -5; passing -10 should return 10.#
    private static int negateNumber(int number) {
        return -number;
    }

    // Exercise 3
    // Write a method which takes two numbers as arguments, checks if they are the same and returns the appropriate boolean value.
    private static boolean compareTwoNumbers(int number1, int number2) {
//        if (number1 == number2) {
//            return true;
//        } else {
//            return false;
//        }
        return number1 == number2;
    }

    // Exercise 4
    private static void compareTwoNumbersDetailed(int number1, int number2) {
        if (number1 == number2) {
            System.out.println("The numbers are equal");
        } else if (number1 > number2) {
            System.out.println("The first number is larger");
        } else {
            System.out.println("The second number is larger");
        }
    }

    // Exercise 5
    private static String capitalizeFirstLetter(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }

    // Exercise 6
    private static int countNumberOfStringsInArray(String[] array) {
        return array.length;
    }

    // Exercise 7
    private static int countWordsInSentence(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        String[] words = sentence.split(" ");
        return words.length;
    }

}
