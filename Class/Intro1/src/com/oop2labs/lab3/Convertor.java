package com.oop2labs.lab3;

import java.util.Scanner;

public class Convertor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            double value;
            double result;
            System.out.println("\nPlease Select a Convertion type: ");
            System.out.print("\n1) Distance - Km to Mi" +
                    "\n2) Distance - Mi to Km" +
                    "\n3) Temperature - C to F" +
                    "\n4) Temperature - F to C" +
                    "\n5) Length - cm to in" +
                    "\n6) Length- in to cm" +
                    "\n7) Exit the Program." +
                    "\nSelection:  ");
            int selection = scanner.nextInt();

            // the program will end when 7 is entered.
            if (selection == 7){
                break;
            }

            // Switch between each conversion
            switch (selection){
                case 1:
                    System.out.print("\nPlease enter Km value: ");
                    value = scanner.nextDouble();
                    result = value * 0.621371; // Converts km to Mi
                    System.out.println("Km: " + value + " to Mi: " + result);
                    
                    //wait for output
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 2:
                    System.out.print("\nPlease enter Mi value: ");
                    value = scanner.nextDouble();
                    result = value * 1.609344; // Converts Mi to KM
                    System.out.println("Mi: " + value + " to Km: " + result);

                    //wait for output
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 3:
                    System.out.print("\nPlease enter C value: ");
                    value = scanner.nextDouble();
                    result = value * 1.8 + 32; // Converts C to F
                    System.out.println("C: " + value + " to F: " + result);

                    //wait for output
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 4:
                    System.out.print("\nPlease enter F value: ");
                    value = scanner.nextDouble();
                    result = (value - 32) * 5/9; // Converts F to C
                    System.out.print("F: " + value + " to C: " + result);

                    //wait for output
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 5:
                    System.out.print("\nPlease enter cm value: ");
                    value = scanner.nextDouble();
                    result = value / 2.54; // Converts cm to in
                    System.out.println("cm: " + value + " to in: " + result);

                    //wait for output
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 6:
                    System.out.print("\nPlease enter in value: ");
                    value = scanner.nextDouble();
                    result = value * 2.54; // Converts in to cm
                    System.out.println("in: " + value + " to c: " + result);

                    //wait for output
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 7:
                    System.out.println("\n\nThe program will exit.");
                    System.exit(0); // Used to exit the program

                    //wait for output
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                default:
                    System.out.println("\n\nYou have entered a incorrect value. Please try again.");

                    //wait for output
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
            }
        }
        return;
    }
}
