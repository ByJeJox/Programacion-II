package TrabajoPractico6.CasoPractico2;

public class Autor1 { //Cambio de nombre para que este todo en la misma carpeta y no tenga problemas con el TP5

    private String id;
    private String nombre;
    private String nacionalidad;

    public Autor1(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String mostrarInfo() {
        return "ID: " + id + "\nNombre: " + nombre + "\nNacionalidad: " + nacionalidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

}
