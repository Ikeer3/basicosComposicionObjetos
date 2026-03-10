package Equipo;

public class Equipo {

    private String nombre;
    private Jugador[] plantilla;

    public Equipo(String nombre, Jugador[] plantilla) {
        this.nombre = nombre;
        this.plantilla = plantilla;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarInfo() {
        System.out.println("---BIENVENIDO AL " + nombre + "---");
        System.out.println("En el " + nombre + " hay " + plantilla.length + " jugadores");
        for (Jugador jugadores: plantilla) {
            System.out.println(jugadores.getNombre() + " juega en la posición: " + jugadores.getPosicion());
        }
    }
}
