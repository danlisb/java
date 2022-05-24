public class arrays {
    public static void main(String[] args) {

        String [] Carros = {"Honda", "Fiat", "Tesla"};

        for (int i = 0; i < Carros.length; i++) {
            System.out.println(Carros[i]);
        }
        /*  Outro modo
        for (String carro : Carros) {
            System.out.println(carro);
        }*/
    }
}
