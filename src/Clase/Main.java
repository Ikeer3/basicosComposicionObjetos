package Clase;

public class Main {
    public static void main(String[] args) {

        Alumno[] alumnos = new Alumno[3];

        alumnos[0] = new Alumno("Iker", 8.5);
        alumnos[1] = new Alumno("Isabella", 6.7);
        alumnos[2] = new Alumno("Dani", 7.3);

        Curso curso1 = new Curso("Historia de España", alumnos);
        curso1.mostrarInfo();
    }
}
