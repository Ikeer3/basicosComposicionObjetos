package Coche;

public class Coche {

    private String marca;
    private Motor motor;

    public Coche(String marca, int potenciaMotor) {
        this.marca = marca;
        this.motor = new Motor(potenciaMotor);
    }

    public void arrancar() {
        System.out.println("\nGirando la llave del..." + marca);
        motor.activar();
    }

    public void apagar() {
        System.out.println("\nQuitando el contacto del..." + marca);
        motor.desactivar();
    }
}
