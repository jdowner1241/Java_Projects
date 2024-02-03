package com.Intro1.ooplab;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordCheck {
    public static boolean isValidPassword(String password){
        //Check if password is at lease 8 characters
        if (password.length() < 8){
            return false;
        }

        //check for at least one uppercase letter
        if(!Pattern.compile("[A-Z]").matcher(password).find()){

            return false;
        }

        //check for a lease one lowercase letter
        if(!Pattern.compile("[a-z]").matcher(password).find()){

            return false;
        }

        //check for at least one digit
        if (!Pattern.compile("[0-9]").matcher(password).find()){
            return false;
        }

        //check for at least one special character
        if (!Pattern.compile("[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?]").matcher(password).find()){
            return false;
        }

        return true;
    }
    public static void main(String[] args) {

        //Full name
        String fullName = "Jamario Downer";
        boolean result1 = isValidPassword(fullName);
        System.out.println("Test string 1: " + fullName);
        System.out.println(result1 ? "true" : "false");

        //First name + last 4 digits of student id + symbol
        String firstName = "Jamario1241&";
        boolean result2 = isValidPassword(firstName);
        System.out.println("Test string 1: " + firstName);
        System.out.println(result2 ? "true" : "false");

        //Accept a password from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Password: ");
        String userPassword = scanner.nextLine();
        boolean result3 = isValidPassword(userPassword);
        System.out.println("Test user password: " + userPassword);
        System.out.println(result3  ? "true" : "false");

        scanner.close();
    }
}
