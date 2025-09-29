package TrabajoPractico5.Ejercicio04;

public class Cliente {

    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjetaCredito;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
        if (tarjetaCredito != null && tarjetaCredito.getCliente() != this) {
            tarjetaCredito.setCliente(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public TarjetaDeCredito getTarjetaCredito() {
        return tarjetaCredito;
    }  

    
}
