public class switches {
    public static void main(String[] args) {

        String dia = "Sexta-Feira";

        switch (dia) {
            case "Domingo": System.out.println("Hoje é Domingo!");
                break;

            case "Segunda-Feira": System.out.println("Hoje é Segunda-Feira!");
                break;

            case "Terça-Feira": System.out.println("Hoje é Terça-Feira!");
                break;

            case "Quarta-Feira": System.out.println("Hoje é Quarta-Feira!");
                break;

            case "Quinta-Feira": System.out.println("Hoje é Quinta-Feira!");
                break;

            case "Sexta-Feira": System.out.println("Hoje é Sexta-Feira!");
                break;

            case "Sábado": System.out.println("Hoje é Sábado!");
                break;

            default: System.out.println("Isso não é um dia!");
        }
    }
}
