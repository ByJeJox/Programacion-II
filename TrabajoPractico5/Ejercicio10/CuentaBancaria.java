package TrabajoPractico5.Ejercicio10;

public class CuentaBancaria {

    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad;
    private Titular1 titular;

    public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion);
    }

    public void setTitular(Titular1 titular) {
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria() != this) {
            titular.setCuentaBancaria(this);         
        }
    }

    public void mostrarCuentaBancaria() {
        System.out.println("CBU: " + cbu);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Clave de Seguridad: " + claveSeguridad.getCodigo());
        System.out.println("Ultima Modificacion de Clave: " + claveSeguridad.getUltimaModificacion());
        if (titular != null) {
            System.out.println("Titular: " + titular.getNombrE() + ", DNI: " + titular.getDni());
        } else {
            System.out.println("No tiene titular asignado.");
        }
    }

    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public Titular1 getTitular() {
        return titular;
    }
}
