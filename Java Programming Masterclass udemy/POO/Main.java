package com.company;

public class Main {

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Pluto";
        cachorro1.corOlhos = "azuis";
        cachorro1.peso = 53;
        cachorro1.quantPatas = 4;

        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "Rex";
        cachorro2.corOlhos = "amarelo";
        cachorro2.peso = 22;
        cachorro2.quantPatas = 3;

        Cachorro cachorro3 = new Cachorro();
        cachorro3.nome = "Bob";
        cachorro3.corOlhos = "marrom";
        cachorro3.peso = 13;
        cachorro3.quantPatas = 4;

        System.out.println("O nome do cachorro1 é " + cachorro1.nome + ".");
        System.out.println("A cor dos olhos do cachorro3 é " +cachorro3.corOlhos+ ".");

    }
}
