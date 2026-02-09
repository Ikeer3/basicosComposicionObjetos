package Clase;

public class Curso {

    private String nombre;
    private Alumno[] alumnos;

    public Curso(String nombre, Alumno[] alumnos) {
        this.nombre = nombre;
        this.alumnos = alumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Curso: " + alumnos.length + " alumnos");
        for (Alumno alumno: alumnos) {
            System.out.println(alumno.getNombre() + ": " + alumno.getNotaMedia() + " nota media");
        }
    }
}
