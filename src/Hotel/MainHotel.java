package Hotel;

public class MainHotel {
    public static void main(String[] args) {

        Habitacion[] habitaciones = new Habitacion[4];
        habitaciones[0] = new Habitacion(11, 32.5);
        habitaciones[1] = new Habitacion(23, 62.3);
        habitaciones[2] = new Habitacion(17, 91.6);
        habitaciones[3] = new Habitacion(34, 115.0);

        Hotel hotel1 = new Hotel("Attica 21", habitaciones);

        hotel1.mostrarHabitaciones();
        hotel1.calcularPrecioTotalEstancia();
    }
}
