public class ifAdulto {
    public static void main(String[] args) {

        int idade = 14;

        if (idade >= 75) {
            System.out.println("Ok Boomer.");
        }
        else if (idade >= 18) {
            System.out.println("Você é um adulto.");
        }
        else if (idade >= 13) {
            System.out.println("Você é um adolescente.");
        }
        else {
            System.out.println("Você não é um adulto.");
        }
    }
}
