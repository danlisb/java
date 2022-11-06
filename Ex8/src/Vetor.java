public class Vetor {
    private int tamanho;
    private String[] vetor;
    private int posicao;

    public Vetor(int tamanhoInicial) {
        this.tamanho = tamanhoInicial;
        this.vetor = new String[tamanho];
        this.posicao = 0;
    }

    public void Insert(String palavra) {
        if (posicao >= tamanho) {
            aumentarTamanho();
        }
        vetor[posicao] = palavra;
        posicao++;
    }

    public String Get(int posicao) {
        if (posicao >= tamanho || posicao >= this.posicao) {
            return null;
        }
        return vetor[posicao];
    }

    public int Size() {
        return posicao;
    }

    public int getTamanho() {
        return tamanho;
    }

    public String[] getVetor() {
        return vetor;
    }

    public int getPosicao() {
        return posicao;
    }

    private void aumentarTamanho() {
        int novoTamanho = tamanho + 1;
        String[] novoVetor = new String[novoTamanho];
        for (int posicao = 0; posicao < vetor.length; posicao++) {
            novoVetor[posicao] = vetor[posicao];
        }
        tamanho = novoTamanho;
        vetor = novoVetor;
    }
}
    