package Coche;

public class MainCoche {
    public static void main(String[] args) {

        Coche coche1 = new Coche("Renault", 250);

        coche1.arrancar();
        System.out.println("\n---Viajando---");
        coche1.apagar();
    }
}
