package TrabajoPractico5.Ejercicio1;

public class Pasaporte {

    private String numero;
    private String fechaEmision;
    private Foto foto; // Composicion
    private Titular titular; // Asociacion bidireccional
    
    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato); // Composicion
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this); // Mantener la asociacion bidireccional
            
        }
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Titular getTitular() {
        return titular;
    }

    public void mostrarPasaporte() { // Como es Asociacion bidireccional, puede mostrar info del titular
        System.out.println("Numero: " + numero);
        System.out.println("Fecha de Emision: " + fechaEmision);
        System.out.println("Foto: " + foto.getImagen() + ", Formato: " + foto.getFormato());
        if (titular != null) {
            System.out.println("Titular: " + titular.getNombre() + ", DNI: " + titular.getDni());
        } else {
            System.out.println("Titular: No asignado");
        }
    }

}
