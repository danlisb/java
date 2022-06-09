package com.company;
import java.util.Scanner;

public class FloatAndDouble {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 3;
        double myDoubleValue = 5d / 3;
        System.out.println("myIntValue: " +myIntValue);
        System.out.println("myFloatValue: " +myFloatValue);
        System.out.println("myDoubleValue: " +myDoubleValue);

        // pounds to kg -> 1 pound = 0.45359237 kg.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value in pound: ");
        double doubleValue = sc.nextDouble();
        double kgConversion = (doubleValue * 0.4535d);
        System.out.println("The number in kg is: "+kgConversion);

    }
}
