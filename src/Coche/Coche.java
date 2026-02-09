package Coche;

public class Coche {

    private String marca;
    private Motor motores;

    public Coche(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void infoCoche() {
        System.out.println("\nEl coche de la marca: " + marca + " tiene una potencia de " + motores.getPotencia());
    }
}
