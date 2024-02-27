package com.amigoscode.conditionals;

public class E5 {
    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 12;
        int number3 = 13;

        if (number1 > number2 && number1 < number3) {
            System.out.println("Number 1 is greater than number 2 and less than number 3");
        } else if (number1 < number2 && number1 > number3) {
            System.out.println("Number 1 is less than number 2 and greater than number 3");
        } else {
            System.out.println("Number 1 is equal to number 2 or number 3");
        }

        if (number1 > number2 || number1 > number3) {
            System.out.println("Number 1 is greater than number 2 or number 3");
        } else if (number1 < number2 || number1 < number3) {
            System.out.println("Number 1 is less than number 2 or number 3");
        } else {
            System.out.println("Number 1 is equal to number 2 or number 3");
        }
    }
}
