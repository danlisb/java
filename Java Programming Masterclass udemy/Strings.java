package com.company;

public class Strings {

    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println("myString is equal to: " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to: " + myString);
        myString = myString + " \u00A9 2022";
        System.out.println("myString is equal to: " + myString);

    }
}
