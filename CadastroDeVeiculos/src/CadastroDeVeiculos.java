public class CadastroDeVeiculos {
    private Veiculo[] lista;
    private int numeroDeVeiculos;

    public CadastroDeVeiculos(int tamanho) {
        lista = new Veiculo[tamanho];
        numeroDeVeiculos = 0;
    }

    public void inserir(Veiculo v) {
        if (numeroDeVeiculos < lista.length) {
            lista[numeroDeVeiculos++] = v; }
        else {
            Veiculo[] novaLista = new Veiculo[lista.length * 2];
            for (int i = 0; i < numeroDeVeiculos; i++)
                novaLista[i] = lista[i];
            novaLista[numeroDeVeiculos++] = v;
            lista = novaLista;
        }
    }

    public Veiculo retornaItem(int posicao) {
        if (posicao >= 0 && posicao < numeroDeVeiculos) {
            return lista[posicao];
        }
        return null;
    }

    public int tamanho() {
        return numeroDeVeiculos;
    }

    public void imprimir() {
        for (int i = 0; i < numeroDeVeiculos; i++)
            lista[i].imprimir();
    }
}
