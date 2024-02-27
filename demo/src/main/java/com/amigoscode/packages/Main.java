package com.amigoscode.packages;

import com.amigoscode.packages.E1.email.EmailValidator;


public class Main {

    public static void main(String[] args) {

        // E1
        EmailValidator emailValidator = new EmailValidator();
        System.out.println(emailValidator.validateEmail("test"));

    }
}
