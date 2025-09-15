package TrabajoPractico5.Ejercicio3;

public class Libro {

    private String titulo;
    private String isbn;
    private Autor autor; // Asociacion unidireccional
    private Editorial editorial; // Agregacion

    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }    

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void mostrarLibro() {
        System.out.println("Titulo: " + titulo);
        System.out.println("ISBN: " + isbn);
        System.out.println("Editorial: " + editorial.getNombre() + ", Direccion: " + editorial.getDireccion());
        if (autor != null) {
            System.out.println("Autor: " + autor.getNombre() + ", Nacionalidad: " + autor.getNacionalidad());
        } else {
            System.out.println("Autor: No asignado");
        }
    }
}
    
