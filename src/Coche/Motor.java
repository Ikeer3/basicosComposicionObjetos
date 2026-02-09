package Coche;

public class Motor {

    private int potencia;
    private boolean estado;

    public Motor(int potencia) {
        this.potencia = potencia;
        this.estado = false;
    }

    public void arrancar() {
        if (!estado) {
            estado = true;
            System.out.println("El coche con " + potencia + "CV se ha encendido!!");
        } else {
            System.out.println("El coche ya estaba encendido...");
        }
    }

    public void apagar() {
        if (estado) {
            estado = false;
            System.out.println("El coche se detiene y se apaga");
        } else {
            System.out.println("El coche ya estaba apagado...");
        }
    }
}
