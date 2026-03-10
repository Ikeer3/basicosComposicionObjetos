package Equipo;

public class MainEquipo {
    public static void main(String[] args) {

        Jugador[] plantilla = new Jugador[5];
        plantilla[0] = new Jugador("Carlos", "portero");
        plantilla[1] = new Jugador("Iván", "defensa");
        plantilla[2] = new Jugador("Iker", "delantero");
        plantilla[3] = new Jugador("Daniel", "mediocentro");
        plantilla[4] = new Jugador("Isabella", "lateral");

        Equipo equipo1 = new Equipo("Liceo FC", plantilla);

        equipo1.mostrarInfo();
    }
}