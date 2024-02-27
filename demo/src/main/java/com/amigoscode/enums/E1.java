package com.amigoscode.enums;

public class E1 {

    public static void main(String[] args) {

        // E2
        System.out.println("Tshirt size: " + TshirtSize.M);

        // E3
        TshirtSize[] sizes = TshirtSize.values();
        for (TshirtSize size : sizes) {
            String lowercaseName = size.name().toLowerCase();
            System.out.println(lowercaseName);
        }
    }
}
