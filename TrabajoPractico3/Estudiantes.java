package TrabajoPractico3;

public class Estudiantes {

    private String nombre;
    private String apellido; 
    private String curso;
    private double calificacion;

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + " " + apellido + " Curso: " + curso + " Calificacion: " + calificacion);
    }

    public void subirCalificacion(double puntos){
        calificacion += puntos; 
    }

    public void bajarCalificacion(double puntos){
        calificacion -= puntos; 
    }
}

