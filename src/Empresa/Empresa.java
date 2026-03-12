package Empresa;

public class Empresa {

    private String nombre;
    private Empleado[] listaEmpleados;

    public Empresa(String nombre, Empleado[] listaEmpleados) {
        this.nombre = nombre;
        this.listaEmpleados = listaEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarEmpleados() {
        System.out.println("La empresa " + nombre + " tiene " + listaEmpleados.length + " empleados");
        for (Empleado empleados: listaEmpleados) {
            System.out.println("El empleado " + empleados.getNombre() + " tiene un salario mensual de "
                    + empleados.getSalario() + "€");
        }
    }

    public void calcularGastoSalarioTotal() {
        double salarioTotal = 0.0;
        for (Empleado gastoEmpleados: listaEmpleados) {
            salarioTotal = salarioTotal + gastoEmpleados.getSalario();
        }
        System.out.println("El gasto total en salario de la empresa " + nombre + " asciende a " + salarioTotal + "€");
    }
}
