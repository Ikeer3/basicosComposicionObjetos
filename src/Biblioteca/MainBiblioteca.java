package Biblioteca;

public class MainBiblioteca {
    public static void main(String[] args) {

        Libro[] catalogo = new Libro[3];
        catalogo[0] = new Libro("\nHarry Potter y el Prisionero de Azkaban", "J.K. Rowling");
        catalogo[1] = new Libro("Alas de Sangre", "Rebecca Yarros");
        catalogo[2] = new Libro("Los Juegos del Hambre", "Suzanne Collins");

        Biblioteca biblioteca1 = new Biblioteca("Municipal de los Rosales", catalogo);

        System.out.println("\n---BIENVENIDO---");
        biblioteca1.mostrarLibros();

        System.out.println("----------------------------------------------------------------------------------");
        Libro libroNuevo1 = new Libro("Normal People", "Sally Rooney");
        biblioteca1.anhadirLibros(libroNuevo1);
        biblioteca1.mostrarLibros();
    }
}
