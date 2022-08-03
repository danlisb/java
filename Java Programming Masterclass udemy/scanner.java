import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Lê a entrada do teclado
        System.out.print("Insira uma palavra: ");
        String string = scanner.nextLine();
        // Capitalização da primeira letra
        String primeiraLetraMaiscula = string.substring(0, 1).toUpperCase();
        String palavraCapitalizada = primeiraLetraMaiscula + string.substring(1);
        // Output
        System.out.println("A palavra inserida foi: " + palavraCapitalizada + ".");

        // Lê a entrada do teclado
        System.out.print("Insira um número: ");
        int integer = scanner.nextInt();
        // Output
        System.out.println("O número inserido foi: " + integer + ".");
    }
}
