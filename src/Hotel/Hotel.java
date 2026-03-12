package Hotel;

public class Hotel {

    private String nombre;
    private Habitacion[] listaHabitaciones;

    public Hotel(String nombre, Habitacion[] listaHabitaciones) {
        this.nombre = nombre;
        this.listaHabitaciones = listaHabitaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarHabitaciones() {
        System.out.println("\nEl hotel " + nombre + " tiene " + listaHabitaciones.length + " habitaciones");
        for (Habitacion habitaciones: listaHabitaciones) {
            System.out.println("La habitación número " + habitaciones.getNumero() + " cuesta por noche "
                    + habitaciones.getPrecio() + "€");
        }
    }

    public void calcularPrecioTotalEstancia() {
        double precioTotal = 0.0;
        for (Habitacion precioHabitacion: listaHabitaciones) {
            precioTotal = precioTotal + precioHabitacion.getPrecio();
        }
        System.out.println("\nEl precio total de la estancia en el hotel " + nombre + " son " + precioTotal + "€");
    }
}
