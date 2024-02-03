package com.myname;

import java.util.Scanner;

public class MyName {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.print("Enter a Number: ");
        double x = scan.nextDouble();

        System.out.println("\nOutput:");
        System.out.println("Name: " + name);
        System.out.println("Number: " + x);

        System.out.println("\nThis is a test...");
        System.out.print("Math output: " + Math.round(3.1415));
    }
}
