package com.amigoscode.loopsAndArrays;

public class Exercise14 {

    public static void main(String[] args) {
        String[] content = {"you", "are", "how", "hello"};

        /*
        Write a program that reverses an array of Strings
        String[] content = {"you", "are", "how", "hello"}
        Tip. Use for loop and you to start at highest index.
        Output should be: hello how are you?. Note question mark at the end
    */

//        String[] newArray = new String[content.length];
//        for (int i = content.length; i > 0; i--) {
//            newArray[content.length - i] = content[i - 1];
//        }
//        System.out.println(String.join(" ", newArray) + "?");

        for (int i = content.length - 1; i >= 0; i--) {
            System.out.println(content[i]);
            if (i != 0) {
                System.out.print(" ");
            } else {
                System.out.print("?");
            }
        }
    }
}
