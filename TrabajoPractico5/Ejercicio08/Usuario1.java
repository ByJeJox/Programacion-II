package TrabajoPractico5.Ejercicio08;

public class Usuario1 { //Al igual que con cliente le cambie el nombre para evitar conflictos con el ejercicio 2

    private String nombre;
    private String email;
    
    public Usuario1(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    } 

}
