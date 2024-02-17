package creditsolution;

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

import java.util.Scanner;

public class Client {

    private int idNumber;
    private String firstName;
    private String lastName;
    private int age;
    private Card card;

    public Client(){};
    public Client(int newIdNumber, String newFirstName, String newLastName){
        this.idNumber = newIdNumber;
        this.firstName = newFirstName;
        this.lastName = newLastName;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Card getCard() {
        return card;
    }
    public void display(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your First Name");
        this.firstName = scanner.nextLine();

        System.out.println("Please enter your First Name");
        this.lastName = scanner.nextLine();

        System.out.println("Please enter your First Name");
        this.age = scanner.nextInt();

        System.out.println("Please enter your First Name");
        this.idNumber = scanner.nextInt();
    }
}
