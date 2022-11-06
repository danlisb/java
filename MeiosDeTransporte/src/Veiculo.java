public class Veiculo {
    private String marca;
    private int qtdRodas;
    private String modelo;
    private int velocidade;

    public Veiculo(String marca, String modelo, int qtdRodas) {
        this.marca = marca;
        this.modelo = modelo;
        this.qtdRodas = qtdRodas;
        this.velocidade = 0;
    }

    public void imprimirinformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Quantidade de rodas: " + qtdRodas);
        System.out.println("Velocidade " + velocidade + "km/h");
    }

    public void acelerar(int valor) {
        this.velocidade += valor;
    }

    public void frear(int valor) {
        this.velocidade -= valor;
    }
}
