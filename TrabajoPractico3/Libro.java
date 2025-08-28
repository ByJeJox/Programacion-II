package TrabajoPractico3;

public class Libro {
    
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() {
            return titulo;
    }

    public void setTitulo(String titulo) {
            this.titulo = titulo;
    }

    public String getAutor() {
            return autor;
    }

    public void setAutor(String autor) {
            this.autor = autor;
    }

    public int getAñoPublicacion() {
            return anioPublicacion;
    }

    public void setAñoPublicacion(int anio) {
        if (anio >= 1500 && anio <= 2025) {
            anioPublicacion = anio;
        } else {
            System.out.println("El año de publicacion es invalido, introduzca un año entre 1500 y 2025.");
        }
    }
    
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
    }

}
