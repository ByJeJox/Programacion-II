package TrabajoPractico5.Ejercicio6;

public class Cliente1 { /*Le cambie el nombre porque ya hay otra clase Cliente asi se puede enviar todo el programa junto*/

    private String nombre;
    private String dni;
    
    public Cliente1(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

}
