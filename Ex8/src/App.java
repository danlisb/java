public class App {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(4); 
        System.out.println("O tamanho do vetor é " + vetor.getTamanho());
        System.out.println("Inserindo palavras...");
        vetor.Insert("Batata");
        vetor.Insert("Arroz");
        vetor.Insert("Refri");
        vetor.Insert("Coxinha");
        vetor.Insert("Ruffles");
        vetor.Insert("Lays");

        System.out.println(vetor.Get(10));
        System.out.println("O tamanho do vetor é " + vetor.Size());
    }
}
