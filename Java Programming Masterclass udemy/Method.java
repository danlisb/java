package com.company;

public class Metod {

    public static void main(String[] args) {
        calculateScore(800, true, 5, 100);
        calculateScore(10000,true, 8,200);
    }

    public static void calculateScore(int score, boolean gameOver, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was: " + finalScore);
        }
    }
}
