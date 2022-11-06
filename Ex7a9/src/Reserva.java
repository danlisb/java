public class Reserva {
    Animal[] animais;

    public void simularAtuacao() {
        for (int animal = 0; animal < animais.length; animal++) {
            animais[animal].atuar();
        }
    }

    public static void main(String[] args) {
        Reserva reserva = new Reserva();
        reserva.animais = new Animal[] {
            new Leao("1"),
            new Quepardo("2"),
            new Quepardo("3"), 
            new Zebra("4"),
            new Zebra("5"),
            new Antilope("6"),
            new Antilope("7"),
            new Antilope("8")
        };

        for (int dia = 0; dia < 30; dia++) {
            reserva.simularAtuacao();
        }
    }
}