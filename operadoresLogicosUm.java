public class operadoresLogicosUm {
    public static void main(String[] args) {

        int temp = 12;

        if (temp > 30) {
            System.out.println("A temperatura agora está quente.");
        }
        else if (temp >= 20 && temp <= 30) {
            System.out.println("A temperatura agora está amena.");
        }
        else {
            System.out.println("A temperatura agora está fria.");
        }
    }
}
