package TrabajoPractico7.Ejercicio2;

public abstract class Figura {

    private String nombre;
    
    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre(){
        System.out.println(nombre);
    }

    public abstract double calcularArea();

}
