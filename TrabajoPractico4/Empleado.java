package TrabajoPractico4;

public class Empleado {

    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;  // No hay que hacerlo pero lo pide la consigna
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    public Empleado(String nombre, String puesto) {
        this.id = ++totalEmpleados; // Esto puede causar problemas si se crean empleados con IDs específicos pero cumple el requisito para la consigna
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 500000;
    }

    // Reciba un porcentaje de aumento
    public void actualizarSalario(double porcentajeAumento) {
        if (porcentajeAumento > 0) {
            this.salario += this.salario * (porcentajeAumento / 100);
        } else {
            System.out.println("El porcentaje de aumento debe ser positivo.");
        }
    }

    // Aumento por cantidad fija
    public void actualizarSalario(int aumentoFijo) {
        if (aumentoFijo > 0) {
            this.salario += aumentoFijo;
        } else {
            System.out.println("El aumento fijo debe ser positivo.");
        }
    }

    // Metodo toString():
    @Override
    public String toString() {
        return "Empleado [id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + "]";
    }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // Getters y Setters 

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
