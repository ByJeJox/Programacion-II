package TrabajoPractico7.Ejercicio3;

public class EmpleadoPlanta extends Empleado{
    // no tiene mucho sentido este ejercicio ya que no nos dan la informacion
    // para calcular el suelto

    public EmpleadoPlanta(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularSueldo() {
        return 3000000; //sueldo inventado ya que no se brinda la informacion
    }

}
