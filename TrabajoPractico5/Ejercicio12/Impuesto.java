package TrabajoPractico5.Ejercicio12;

public class Impuesto {

    private double monto;
    private Contribuyente contribuyente;

    public Impuesto(double monto) {
        this.monto = monto;
    }
    
    public double getMonto() {
        return monto;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }

    public void mostrarImpuesto() {
        System.out.println("Monto: " + monto);
        if (contribuyente != null) {
            System.out.println("Contribuyente: " + contribuyente.getNombre() + ", CUIL: " + contribuyente.getCuil());
        } else {
            System.out.println("No tiene contribuyente asignado.");
        }
    }

}
