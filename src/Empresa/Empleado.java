package Empresa;

public class Empleado {

    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        if (salario < 0) {
            this.salario = 0;
        } else {
            this.salario = salario;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }
}