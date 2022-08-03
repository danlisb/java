package com.company;

public class PrimitiveTypesChallenge {

    public static void main(String[] args) {
	byte myByte = 50;
        short myShort = 35;
        int myInt = 5;
        long myLong = 50000L + (10 * (myByte + myShort + myInt));
        System.out.println(myLong);
    }
}
