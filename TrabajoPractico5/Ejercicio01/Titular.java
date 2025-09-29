package TrabajoPractico5.Ejercicio01;

public class Titular {

    private String nombre;
    private String dni;
    private Pasaporte pasaporte; // Asociacion bidireccional
    
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this); // Mantener la asociacion bidireccional
            
        }
    }
    

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public void mostrarTitular() {  // Como es Asociacion bidireccional, puede mostrar info del pasaporte
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        if (pasaporte != null) {
            System.out.println("Pasaporte Numero: " + pasaporte.getNumero());
        } else {
            System.out.println("Pasaporte: No asignado");
        }
    }
}
