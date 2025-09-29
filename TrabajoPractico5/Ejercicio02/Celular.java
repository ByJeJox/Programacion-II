package TrabajoPractico5.Ejercicio02;

public class Celular {

    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; // Agregacion
    private Usuario usuario; // Asociacion bidireccional

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public void setTitular(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this); // Mantener la asociacion bidireccional
            
        }
    }

    public void mostrarCelular() {
        System.out.println("IMEI: " + imei);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: ");
        System.out.println("  Modelo: " + bateria.getModelo());
        System.out.println("  Capacidad: " + bateria.getCapacidad());
        if (usuario != null) {
            System.out.println("Usuario: ");
            System.out.println("  Nombre: " + usuario.getNombre());
            System.out.println("  DNI: " + usuario.getDni());
        } else {
            System.out.println("No tiene usuario asignado.");
        }
    }

    public String getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Usuario getUsuario() {
        return usuario;
    } 
}
