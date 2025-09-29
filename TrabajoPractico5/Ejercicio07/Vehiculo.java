package TrabajoPractico5.Ejercicio07;

public class Vehiculo {

    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }

    public void mostrarVehiculo() {
        System.out.println("Patente: " + patente);
        System.out.println("Modelo: " + modelo);
        if (motor != null) {
            System.out.println("Motor Tipo: " + motor.getTipo());
            System.out.println("Motor Numero de Serie: " + motor.getNumeroSerie());
        } else {
            System.out.println("Motor: No asignado");
        }
        if (conductor != null) {
            System.out.println("Conductor Nombre: " + conductor.getNombre());
            System.out.println("Conductor Licencia: " + conductor.getLicencia());
        } else {
            System.out.println("Conductor: No asignado");
        }
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public Conductor getConductor() {
        return conductor;
    }

}
