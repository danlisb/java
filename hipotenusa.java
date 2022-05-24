import java.util.Scanner;

public class hipotenusa {
    public static void main(String[] args) {

        double x;
        double y;
        double z;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor de x: ");
        x = scanner.nextDouble();

        System.out.println("Insira o valor de y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));
        System.out.println("O valor da hipotenusa é: "+z);
        scanner.close();
    }
}
