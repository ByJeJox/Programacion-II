package TrabajoPractico3;

public class TrabajoPractico3 {

    public static void main(String[] args) {
        Estudiantes estudiante1 = new Estudiantes();
        Mascotas mascota1 = new Mascotas(); 
        Gallina gallina1 = new Gallina();
        Gallina gallina2 = new Gallina();
        NaveEspacial nave = new NaveEspacial();

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

        System.out.println("Ejercicio 4");
        gallina1.idGallina = 1;
        gallina1.edad = 2;
        gallina2.idGallina = 2;
        gallina2.edad = 1;

        System.out.println("Estado inicial de las gallinas:");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();

        gallina1.envejecer();
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();

        gallina2.envejecer();
        gallina2.ponerHuevo();

        System.out.println("Luego de 1 año");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();

        System.out.println("");
        System.out.println("Ejercicio 5");
        nave.nombre = "Halcon Milenario";
        nave.combustible = 50;

        nave.despegar();
        nave.avanzar(60); // deberia fallar
        nave.recargarCombustible(30); // sube a 80
        nave.avanzar(60); // ahora sí
        nave.mostrarEstado();
    }
}
