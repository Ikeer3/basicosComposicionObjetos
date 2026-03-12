package Empresa;

public class MainEmpresa {
    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[5];
        empleados[0] = new Empleado("Carlos", 842.4);
        empleados[1] = new Empleado("Iván", 1074.8);
        empleados[2] = new Empleado("Iker", 1313.6);
        empleados[3] = new Empleado("Dani", 1287.0);
        empleados[4] = new Empleado("Isabella", 621.7);

        Empresa empresa1 = new Empresa("Informáticos S.A.", empleados);

        empresa1.mostrarEmpleados();
        empresa1.calcularGastoSalarioTotal();
    }
}
