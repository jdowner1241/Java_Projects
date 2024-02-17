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
import creditsolution.Card;

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

public class Main {

    public static void main(String[] args) {
        Client customer1 = new Client();


        System.out.println("Name: "+customer1.getFirstName());
        System.out.println("last: "+customer1.getLastName());
        System.out.println("Age:  "+customer1.getAge());
        System.out.println("ID Number: "+customer1.getIdNumber());

        customer1.display();
        }
    }
