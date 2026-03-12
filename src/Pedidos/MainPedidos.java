package Pedidos;

public class MainPedidos {
    public static void main(String[] args) {

        Producto[] listaCompra = new Producto[4];
        listaCompra[0] = new Producto("Pepinillos", 3.2);
        listaCompra[1] = new Producto("Pizza", 5.6);
        listaCompra[2] = new Producto("Leche", 7.4);
        listaCompra[3] = new Producto("Rape", 17.8);

        Pedido pedido1 = new Pedido(1, listaCompra);

        pedido1.calularPrecioTotal();
    }
}
