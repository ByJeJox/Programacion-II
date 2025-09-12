package TrabajoPractico5.Ejercicio2;

public class Usuario {

    private String nombre;
    private String dni;
    private Celular celular; // Asociacion bidireccional

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
        if (celular != null && celular.getUsuario() != this) {
            celular.setTitular(this); // Mantener la asociacion bidireccional
            
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Celular getCelular() {
        return celular;
    }
}

    
