package cuentaBancaria;

public class Cuenta {

    private int saldo;
    private Cliente titular;

    public Cuenta(Cliente titular, int saldoInicial) {
        this.titular = titular;

        if (saldoInicial < 0) {
            this.saldo = 0;
            System.out.println("\nNo puedes tener un saldo negativo!!");
        } else {
            this.saldo = saldoInicial;
        }
    }

    public void ingresar(int saldoIngresar) {
        if (saldoIngresar > 0) {
            saldo = saldo + saldoIngresar;
            System.out.println("Ingresados: " + saldoIngresar + "€" + "\nSaldo actual: " + saldo + "€");
        } else {
            System.out.println("ERROR!! La cantidad a ingresar debe ser positiva");
        }
    }

    public void retirar(int saldoRetirar) {
        if (saldoRetirar > 0 && saldo >= saldoRetirar) {
            saldo = saldo - saldoRetirar;
            System.out.println("Retirados: " + saldoRetirar + "€" + "\nSaldo actual: " + saldo + "€");
        } else if (saldo < saldoRetirar) {
            System.out.println("ERROR!! Estás intentando retirar una cantidad superior a tu saldo");
        } else {
            System.out.println("ERROR!! Cantidad no válida");
        }
    }

    public void estadoCuenta() {
        System.out.println("Nombre: " + titular.getNombre() + " (" + titular.getDNI() + ")");
        System.out.println("Saldo actual: " + saldo + "€");
    }
}
