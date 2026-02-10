package Biblioteca;

public class Biblioteca {

    private String nombre;
    private Libro[] catalogo;

    public Biblioteca(String nombre, Libro[] libros) {
        this.nombre = nombre;
        this.catalogo = new Libro[3];
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

    public void mostrarLibros() {
        System.out.println("En la biblioteca " + nombre + " hay " + catalogo.length + " libros");
        for (Libro libro: catalogo) {
            System.out.println(libro.getTitulo() + " escrito por " + libro.getAutor());
        }
    }
}
