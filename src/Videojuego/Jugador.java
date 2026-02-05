package Videojuego;

public class Jugador {

    private String nombre;
    private int vida;
    private Objeto[] inventario;

    public Jugador(String nombre, int vida, Objeto[] inventario) {
        this.nombre = nombre;
        this.vida = vida;
        this.inventario = inventario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Vida: " + vida);
        System.out.println("Inventario: " + inventario.length + " objetos");
        for (Objeto objeto:inventario) {
            System.out.println(objeto.getNombre() + ": " + objeto.getCantidad() + " unidades");
        }
    }
}
