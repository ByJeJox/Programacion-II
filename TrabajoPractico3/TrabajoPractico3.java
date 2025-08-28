package TrabajoPractico3;

public class TrabajoPractico3 {

    public static void main(String[] args) {
        Estudiantes estudiante1 = new Estudiantes();
       
        estudiante1.mostrarInfo();
        estudiante1.subirCalificacion(1.5);
        estudiante1.mostrarInfo();
        estudiante1.bajarCalificacion(1.0);
        estudiante1.mostrarInfo();
    
    }
}
