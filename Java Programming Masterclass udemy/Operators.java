package com.company;

public class Operators {

    public static void main(String[] args) {

        double result = 1;
        System.out.println(result);

        result--; //result = result - 1
        System.out.println(result);

        result++; // result = result + 1
        System.out.println(result);

        result += 2; // result = result + 2
        System.out.println(result);

        result -= 4; // result = result - 3
        System.out.println(result);

        result *= 5; // result = result * 5
        System.out.println(result);

        result /= 2; // result = result / 2
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It's not an alien!");
            System.out.println("And I'm scared of aliens");
        }
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        //and
        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than secondTopScore and less than 100");
        }

        //or
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        double doubleValue = 20d;
        double secondDoubleValue = 80d;
        double doubleOperation = (doubleValue + secondDoubleValue) * 100d;
        System.out.println("doubleOperation: " + doubleOperation);
        double remainderOperation = doubleOperation % 40d;
        System.out.println("remainderOperation: " + remainderOperation);
        boolean booleanTest = (remainderOperation == 0) ? true : false;
        System.out.println("isNoRemainder: " + booleanTest);
        if (!booleanTest) {
            System.out.println("Got some remainder");
        }
    }
}
