package TrabajoPractico5.Ejercicio10;

public class Titular1 { // Tambien lo cambio a Titular1 por el mismo motivo

    private String nombrE;
    private String dni;
    private CuentaBancaria cuentaBancaria;

    public Titular1(String nombrE, String dni) {
        this.nombrE = nombrE;
        this.dni = dni;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
        if (cuentaBancaria != null && cuentaBancaria.getTitular() != this) {
            cuentaBancaria.setTitular(this);         
        }
    }

    public String getNombrE() {
        return nombrE;
    }

    public String getDni() {
        return dni;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    

}
