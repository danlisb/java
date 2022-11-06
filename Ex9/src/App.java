public class App {
    public static void main(String[] args) throws Exception {
        DespesaDiaPrimeiro primeiraDespesa = new DespesaDiaPrimeiro(6, 50);
        DespesaDia segundaDespesa = new DespesaDia(10, 6, 50);

        System.out.println("Primeira despesa: " + primeiraDespesa.getDia());
        System.out.println("Segunda despesa: " + segundaDespesa.getDia());
    }
}
