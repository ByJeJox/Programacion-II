package TrabajoPractico5.Ejercicio4;

public class TarjetaDeCredito {

    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;
    private Banco banco;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjetaCredito() != this) {
            cliente.setTarjetaDeCredito(this);
        }
    }

    public void mostrarTarjeta() {
        System.out.println("Tarjeta de Credito:");
        System.out.println("Numero: " + numero);
        System.out.println("Fecha de Vencimiento: " + fechaVencimiento);
        if (cliente != null) {
            System.out.println("Cliente: " + cliente.getNombre() + ", DNI: " + cliente.getDni());
        } else {
            System.out.println("No tiene cliente asignado.");
        }
        if (banco != null) {
            System.out.println("Banco: " + banco.getNombre() + ", CUIT: " + banco.getCuit());
        } else {
            System.out.println("No tiene banco asignado.");
        }
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Banco getBanco() {
        return banco;
    }


}
