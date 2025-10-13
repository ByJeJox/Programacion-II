package TrabajoPractico7.Ejercicio1;

public class Vehiculo {
    private String marca;
    private String modelo;
 
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarinfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}
