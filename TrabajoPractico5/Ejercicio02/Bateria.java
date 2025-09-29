package TrabajoPractico5.Ejercicio02;

public class Bateria {

    private String modelo;
    private String capacidad; // Lo hacemos como String porque no lo vamos a usar mas que para info
    
    public Bateria(String modelo, String capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
}
