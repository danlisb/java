import java.util.Scanner;

public class operadoresLogicosDois {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Você está jogando um jogo, Digite q ou Q para sair.");
        String resposta = scanner.next();

        if (resposta.equals("q") || resposta.equals("Q")) {
            System.out.println("Você saiu do jogo.");
        }
        else {
            System.out.println("Você ainda está jogando *pew pew*");
        }
    }
}
