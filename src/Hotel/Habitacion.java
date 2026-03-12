package Hotel;

public class Habitacion {

    private int numero;
    private double precio;

    public Habitacion(int numero, double precio) {
        this.numero = numero;
        if (precio < 0) {
            this.precio = 0;
        } else {
            this.precio = precio;
        }
    }

    public int getNumero() {
        return numero;
    }

    public double getPrecio() {
        return precio;
    }
}
