package TrabajoPractico4;

public class TrabajoPractico4 {

    public static void main(String[] args) {
    
        // Constructor con todos los parametros
        Empleado empleado1 = new Empleado(1,"Javier","Arquitecto", 1500000);
        // Constructor con parametros nombre y puesto
        Empleado empleado2 = new Empleado("Mario","Programador");   
        
        System.out.println("Informacion inicial de los empleados:");
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());

        empleado1.actualizarSalario(7.5); // Aumento del 7.5%
        empleado2.actualizarSalario(200000); // Aumento fijo de 200000

        System.out.println("Informacion de los empleados luego del aumento:");
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());

        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados()); // Mostrar cantidad total de empleados

    }
}
