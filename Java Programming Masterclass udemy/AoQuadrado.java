package com.company;
import java.util.Scanner;

public class AoQuadrado {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x, y;
        int resultado = 1;

        System.out.println("Informe o valor de x: ");
        x = scan.nextInt();

        System.out.println("Informe o valor de y: ");
        y = scan.nextInt();

        for(int i = y; i >= 1; i--){

            resultado *= x;
        }
        System.out.println("Resultado: " + resultado);
        scan.close();
    }
}
