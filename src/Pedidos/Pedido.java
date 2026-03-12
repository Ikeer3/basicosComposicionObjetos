package Pedidos;

public class Pedido {

    private int numero;
    private Producto[] listaCompra;

    public Pedido(int numero, Producto[] listaCompra) {
        this.numero = numero;
        this.listaCompra = listaCompra;
    }

    public void calularPrecioTotal() {
        double precioTotal = 0.0;
        for (Producto productos: listaCompra) {
            precioTotal = precioTotal + productos.getPrecio();
            System.out.println("El precio total del pedido " + numero + " es " + precioTotal + "€");
        }
    }
}
