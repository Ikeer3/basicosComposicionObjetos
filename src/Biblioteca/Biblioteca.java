package Biblioteca;

public class Biblioteca {

    private String nombre;
    private Libro[] catalogo;

    public Biblioteca(String nombre, Libro[] catalogo) {
        this.nombre = nombre;
        this.catalogo = catalogo;
    }

    public String getNombre() {
        return nombre;
    }

    public void anhadirLibros(Libro l) {
        Libro[] nuevo = new Libro[catalogo.length + 1];
        for (int i = 0; i < catalogo.length; i++) {
            nuevo[i] = catalogo[i];
        }
        nuevo[nuevo.length - 1] = l;
        catalogo = nuevo;
    }

    /*
    public void eliminarLibros() {
        int numeroEliminar = 0;

        for (Libro l: catalogo) {
            if (l.getPrecio() > cantidad) {
                numeroEliminar++;
            }
        }

        Libro[] resultado = new Libro[catalogo.length - numeroEliminar];
        int posicionActualAnhadir = 0;
        for (Libro l: catalogo) {
            if (l.getPrecio() <= cantidad) {
                resultado[posicionActualAnhadir] = l;
                posicionActualAnhadir++;
            }
        }
        catalogo = resultado;
    }
    */

    public void mostrarLibros() {
        System.out.println("En la biblioteca " + nombre + " hay " + catalogo.length + " libros");
        for (Libro libro: catalogo) {
            System.out.println(libro.getTitulo() + " escrito por " + libro.getAutor());
        }
    }
}
