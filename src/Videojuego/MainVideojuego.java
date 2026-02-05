package Videojuego;

public class MainVideojuego {
    public static void main(String[] args) {
        Objeto[] inventario = new Objeto[2];
        inventario[0] = new Objeto("Poción A", 20);
        inventario[1] = new Objeto("Poción B", 10);

        Jugador jugador1 = new Jugador("Erik", 100, inventario);
        jugador1.mostrarEstado();
    }
}