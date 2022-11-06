public class Animal {
    private String identificador;

    public Animal(String identificador) {
        this.identificador = identificador;
    }

    public void atuar() {
        alimentar();
        alimentar();
        alimentar();
        dormir();
    }

    public void alimentar() {
       System.out.println("Comendo");
    }

    public void dormir() {
        System.out.println("Dormindo");
    }
}