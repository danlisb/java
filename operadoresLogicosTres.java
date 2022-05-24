import java.util.Scanner;

public class operadoresLogicosTres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Você está jogando um jogo, aperte q ou Q para sair.");
        String resposta = scanner.next();

        if (!resposta.equals("q") && !resposta.equals("Q")) {
            System.out.println("Você ainda está jogando *pew pew*");
        }
        else {
            System.out.println("Você saiu do jogo.");
        }
    }
}