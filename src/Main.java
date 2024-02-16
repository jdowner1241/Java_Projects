/*
Module 1
Assignment 1

Program: Credit Solution
Group Members:
    Jamario Downer      -   2201011535
    Rickcolet Benjamin  -   2201010382
    Camoy Edwards       -   2201011768
    Shemar Campbell     -   2201011901
    Saphia Cothrel      –   2201013551
*/

import creditsolution.Client;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        client.display();

        System.out.println("Name: "+client.getFirstName());
        System.out.println("last: "+client.getLastName());
        System.out.println("Age:  "+client.getAge());
        System.out.println("ID Number: "+client.getIdNumber());

        }
    }
