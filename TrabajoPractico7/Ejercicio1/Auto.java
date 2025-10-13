package TrabajoPractico7.Ejercicio1;

public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarinfo() {
        super.mostrarinfo();
        System.out.println("Puertas: " + cantidadPuertas);
    }

}
