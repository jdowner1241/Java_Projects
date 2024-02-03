package com.myname;

import java.util.Scanner;

public class MyName2 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in); //new scanner object

        System.out.print("Enter your name: ");

        String name = scan.nextLine();

        System.out.print("Enter a decimal number: ");

        double x = scan.nextDouble();

        // System.out.println("Enter a paragraph: ");

        // String paragraph = scan.nextLine();

        System.out.println("Your name is: " + name);
        System.out.println("The rounded value is: " + Math.round(x)); //using built-in Math function
        //System.out.println("\n\n\n\n" + paragraph);

    }
}
