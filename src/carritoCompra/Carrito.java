package carritoCompra;

public class Carrito {

    private Producto[] listaCompra;

    public Carrito(Producto[] listaCompra) {
        this.listaCompra = listaCompra;
    }

    public void mostrarProductos() {
        System.out.println("\nEl carrito tiene " + listaCompra.length + " productos");
        for (Producto productos: listaCompra) {
            System.out.println("El producto " + productos.getNombre() + " tiene un precio de " + productos.getPrecio() + "€");
        }
    }
}
