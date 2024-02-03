package com.oop2labs.lab1;

//Lab1:

import java.util.Scanner;

public class StandardDeviation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //variables to store input
        double sum = 0;
        double sumOfSquares = 0;
        int n = 0;

        while(true) {
            System.out.print("Enter a value (enter 0 to stop): ");
            double value = scanner.nextDouble();

            if(value == 0){
                break;
            }

            sum += value; // sum = sum + value
            sumOfSquares += value * value;
            n++;

        } // end while loop

        if (n == 0) {
            System.out.println("No values entered. Cannot calculate mean and standard deviation");
        }else{
            //Calculate the mean
            double mean = sum / n;

            // Calculate the standard deviation
            double variance = (sumOfSquares / n) - (mean * mean);
            double standardDeviation = Math.sqrt(variance);

            System.out.println("The mean of the set is " + mean);
            System.out.println("The standard deviation of the set is " + standardDeviation);

        }
    }
}
