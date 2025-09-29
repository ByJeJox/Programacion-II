package TrabajoPractico5.Ejercicio05;

public class Computadora {

    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre; 
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modelo, chipset);
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }

    public void mostrarComputadora() {
        System.out.println("Computadora");
        System.out.println("Marca: " + marca);
        System.out.println("Numero de Serie: " + numeroSerie);
        System.out.println("Placa Madre - Modelo: " + placaMadre.getModelo() + ", Chipset: " + placaMadre.getChipset());
        if (propietario != null) {
            System.out.println("Propietario: " + propietario.getNombre() + ", DNI: " + propietario.getDni());
        } else {
            System.out.println("Propietario: No asignado");
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    

}
