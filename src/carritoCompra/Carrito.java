package carritoCompra;

public class Carrito {

    private Producto[] listaCompra;

    public Carrito(Producto[] listaCompra) {
        this.listaCompra = listaCompra;
    }

    public void anhadirProductos(Producto p) {
        Producto[] nuevo = new Producto[listaCompra.length + 1];
        for (int i = 0; i < listaCompra.length; i++) {
            nuevo[i] = listaCompra[i];
        }
        nuevo[nuevo.length - 1] = p;
        listaCompra = nuevo;
    }

    public void mostrarProductos() {
        System.out.println("\nEl carrito tiene " + listaCompra.length + " productos");
        for (Producto productos: listaCompra) {
            System.out.println("El producto " + productos.getNombre() + " tiene un precio de " + productos.getPrecio() + "€");
        }
    }

    public void CalcularTotalProductos() {
        double totalProductos = 0.0;
        for (Producto productos: listaCompra) {
            totalProductos = totalProductos + productos.getPrecio();
        }
        System.out.println("\nEl total de la compra asciende a " + totalProductos + "€");
    }
}
