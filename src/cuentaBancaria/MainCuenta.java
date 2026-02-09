package cuentaBancaria;

public class MainCuenta {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Iker", "123456V");
        Cuenta cuenta1 = new Cuenta(cliente1, 1000);

        System.out.println("\n---ESTADO INICIAL---");
        cuenta1.estadoCuenta();

        System.out.println("\n---OPERACIONES---");
        cuenta1.ingresar(300);
        System.out.println("---------------------------------------------------");
        cuenta1.retirar(100);
    }
}
