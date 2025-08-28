package TrabajoPractico3;

public class TrabajoPractico3 {

    public static void main(String[] args) {
        Estudiantes estudiante1 = new Estudiantes();
        Mascotas mascota1 = new Mascotas(); 

        System.out.println("Ejercicio 1");
        estudiante1.mostrarInfo();
        estudiante1.subirCalificacion(1.5);
        estudiante1.mostrarInfo();
        estudiante1.bajarCalificacion(1.0);
        estudiante1.mostrarInfo();

        System.out.println("");

        System.out.println("Ejercicio 2");
        mascota1.mostrarInfo();
        mascota1.cumplirAnos();
        mascota1.cumplirAnos();
        System.out.println("Pasaron 2 años");
        mascota1.mostrarInfo();

    }
}
