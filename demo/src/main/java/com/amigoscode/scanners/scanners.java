package com.amigoscode.scanners;

import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class scanners {

    public static void main(String[] args) throws FileNotFoundException {

//        Scanner ourScanner = new Scanner(System.in);
//        String input = ourScanner.nextLine();
//        // nextLine for Strings, nextInt for integers, nextDouble for doubles
//        System.out.println("You entered: " + input);

//        File inputFile = new File("C:/dev/Learning/amigoscode/demo/demo/src/main/java/com/amigoscode/scanners/inputFile.txt");
//        Scanner fileScanner = new Scanner(inputFile);
//        while (fileScanner.hasNext()) {
//            System.out.println("There is another line!");
//            String fileInput = fileScanner.nextLine();
//            System.out.println(fileInput);
//        }

        // E1
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        System.out.println("You entered: " + input);

        // E2
//        if (args.length == 0) {
//            System.out.println("Please provide numbers as program argumnets");
//            return;
//        }
//        for (String arg : args) {
//            try {
//                int number = Integer.parseInt(arg);
//                if (number % 2 == 0) {
//                    System.out.println(number + " is even");
//                } else {
//                    System.out.println(number + " is odd");
//                }
//            } catch (NumberFormatException e) {
//                System.out.println(arg + " is not a valid integer");
//            }
//        }

        // E3
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int number = scanner.nextInt();
//        boolean isPrime = isPrime(number);
//        if (isPrime) {
//            System.out.println(number + " is a prime number");
//        } else {
//            System.out.println(number + " is not a prime number");
//        }

        // E4
        String[] jokes = {
                "Why don't scientists trust atoms? Because they make up everything!",
                "Why did the scarecrow win an award? Because he was outstanding in his field!",
                "What do you call a factory that makes good products? A satisfactory!",
                "Why don't skeletons fight each other? They don't have the guts!",
                "What do you call a fake noodle? An impasta!",
                "Why did the bicycle fall over? Because it was two-tired!",
                "What do you get when you cross a snowman and a vampire? Frostbite!",
                "Why don't seagulls fly over the bay? Because then they'd be bagels!",
                "What do you call a bear with no teeth? A gummy bear!",
                "What do you call cheese that isn't yours? Nacho cheese!"
        };
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Want to hear a joke? (yes/no)");
            String wantJoke = scanner.nextLine().trim().toLowerCase();
            if (wantJoke.equals("no")) {
                System.out.println("Okay, goodbye!");
                break;
            } else if (wantJoke.equals("yes")) {
                int randomNumber = random.nextInt(jokes.length);
                System.out.println(jokes[randomNumber]);
            } else {
                System.out.println("Invalid input, please enter yes or no");
            }
        }
        scanner.close();

    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
