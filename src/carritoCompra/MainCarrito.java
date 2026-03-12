package carritoCompra;

public class MainCarrito {
    public static void main(String[] args) {

        Producto[] productos = new Producto[4];
        productos[0] = new Producto("Zanahoria", 4.6);
        productos[1] = new Producto("Donuts", 5.1);
        productos[2] = new Producto("Langostinos", 12.8);
        productos[3] = new Producto("Cecina", 23.5);

        Carrito carrito1 = new Carrito(productos);

        carrito1.mostrarProductos();
        carrito1.CalcularTotalProductos();

        Producto productoNuevo = new Producto("Patatas", 3.2);
        carrito1.anhadirProductos(productoNuevo);
        carrito1.mostrarProductos();
        carrito1.CalcularTotalProductos();
    }
}
