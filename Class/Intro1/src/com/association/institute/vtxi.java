package com.association.institute;
import java.util.*;
public class vtxi {
}

class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return street + ", " + city + ", " + state + " " + zipCode;
    }
}

class Person {
    private String name;
    private Address address; //association between address and person

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String toString() {
        return "Name: " + name + "\nAddress: " + address;
    }
}

class Main {

    public static void main(String[] args) {

        // Create an Address object
        Address address1 = new Address("123 Main St", "Cityville", "CA", "12345");

        // Create a Person object with the associated Address
        Person person1 = new Person("John Doe", address1);

        // Access and display information
        System.out.println("Person Info:");
        System.out.println(person1);

    }
}