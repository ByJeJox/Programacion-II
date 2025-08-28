package TrabajoPractico3;

public class TrabajoPractico3 {

    public static void main(String[] args) {
        Estudiantes estudiante1 = new Estudiantes();
        Mascotas mascota1 = new Mascotas(); 
        Libro libro1 = new Libro();

        System.out.println("Ejercicio 1");
        estudiante1.nombre = "Agustin";
        estudiante1.apellido = "Martinez";
        estudiante1.curso = "3A";
        estudiante1.calificacion = 7.5;

        estudiante1.mostrarInfo();
        estudiante1.subirCalificacion(1.5);
        estudiante1.mostrarInfo();
        estudiante1.bajarCalificacion(1.0);
        estudiante1.mostrarInfo();

        System.out.println("");

        System.out.println("Ejercicio 2");
        mascota1.nombre = "Firu";
        mascota1.especie = "Labrador";
        mascota1.edad = 3;

        mascota1.mostrarInfo();
        mascota1.cumplirAnos();
        mascota1.cumplirAnos();
        System.out.println("Pasaron 2 años");
        mascota1.mostrarInfo();

        System.out.println("");

        System.out.println("Ejercicio 3");
        libro1.setTitulo("El Quijote");
        libro1.setAutor("Miguel de Cervantes");
        libro1.setAñoPublicacion(1605);
        libro1.mostrarInfo();

        libro1.setAñoPublicacion(1400); // Año inválido
        libro1.setAñoPublicacion(2020); // Año válido
        libro1.mostrarInfo();

    }
}
