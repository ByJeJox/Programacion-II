package TrabajoPractico3;

public class Mascotas {
    private String nombre;
    private String especie;
    private int edad;

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + " Especie: " + especie + " Edad: " + edad);
    }

    public void cumplirAnos(){
        edad += 1; 
    }
}
