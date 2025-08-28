package TrabajoPractico3;

public class Mascotas {
    
    String nombre;
    String especie;
    int edad;

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + " Especie: " + especie + " Edad: " + edad);
    }

    public void cumplirAnos(){
        edad += 1; 
    }
}
