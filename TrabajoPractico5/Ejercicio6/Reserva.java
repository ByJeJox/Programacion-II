package TrabajoPractico5.Ejercicio6;

public class Reserva {

    private String fecha;
    private String hora;
    private Cliente1 cliente;
    private Mesa mesa;

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public void setCliente(Cliente1 cliente) {
        this.cliente = cliente;
    }

    public void mostrarReserva() {
        System.out.println("Reserva:");
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        if (cliente != null) {
            System.out.println("Cliente: " + cliente.getNombre() + ", DNI: " + cliente.getDni());
        } else {
            System.out.println("Cliente: No asignado");
        }
        System.out.println("Mesa: " + mesa.getNumero() + ", Capacidad: " + mesa.getCapacidad());
    }

}
