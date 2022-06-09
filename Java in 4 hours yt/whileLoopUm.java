import java.util.Scanner;

public class whileLoopUm {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome = "";

        while (nome.isBlank()) {
            System.out.println("Insira seu nome: ");
            nome = scanner.nextLine();
        }
        System.out.println("Olá "+nome+".");
    }
}
