package com.company;

public class ByteShortIntLong {

    public static void main(String[] args) {

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Intenger minimum value: = " + myMinIntValue);
        System.out.println("Intenger maximum value: = " + myMaxIntValue);
        System.out.println("Busted minimum value: = " + (myMinIntValue -1)); //Underflow
        System.out.println("Busted maximum value: = " + (myMaxIntValue + 1)); //Overflow

        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;
        System.out.println("Byte minimum value = " + myMinByte);
        System.out.println("Byte maximum value = " +myMaxByte);

        short myMinShort = Short.MIN_VALUE;
        short myMaxShort = Short.MAX_VALUE;
        System.out.println("Short minimum value = " + myMinShort);
        System.out.println("Short maximum value = " +myMaxShort);

        long myLongValue = 100L;
        long myMinLong = Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;
        System.out.println("Long minimum value = " + myMinLong);
        System.out.println("Long maximum value = " +myMaxLong);

        short myNewShort = (short) (myMaxShort / 2); //Casting
        System.out.println(myNewShort);
    }
}
