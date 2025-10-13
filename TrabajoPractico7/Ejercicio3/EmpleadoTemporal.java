package TrabajoPractico7.Ejercicio3;

public class EmpleadoTemporal extends Empleado{

    public EmpleadoTemporal(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularSueldo() {
        return 1500000;
    }

}
