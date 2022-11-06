public class Bicicleta extends Veiculo {
    private int numeroDeMarchas;
    private boolean bagageiro;
    
    public Bicicleta(String marca, String modelo, int qtdRoda, int numeroDeMarchas) {
        super("Ford", "Lala", 6);
        this.numeroDeMarchas = numeroDeMarchas;
        this.bagageiro = bagageiro;
    }
    
    public void imprimirinformacoes() {
        super.imprimirinformacoes();
        System.out.println("Número de marchas: " + numeroDeMarchas);
        System.out.println("Bagageiro: " + (bagageiro ? "Com bagageiro" : "Sem bagageiro"));
    }
}
