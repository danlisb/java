import java.util.Scanner;

public class whileLoopDois {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome = "";

        do {
            System.out.println("Insira seu nome: ");
            nome = scanner.nextLine();
        }
        while (nome.isBlank());
        System.out.println("Olá "+nome+".");
    }
}
