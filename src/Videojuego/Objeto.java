package Videojuego;

public class Objeto {

    private String nombre;
    private int cantidad;

    public Objeto(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }
}
