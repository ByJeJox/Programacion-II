package TrabajoPractico6.CasoPractico2;

public class Libro {

    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor1 autor1;

  
    public Libro(String isbn, String titulo, int anioPublicacion, Autor1 autor1) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor1 = autor1;
    }

    public void mostrarInfo() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Título: " + titulo);
        System.out.println("Año de Publicación: " + anioPublicacion);
        System.out.println("Autor : " + autor1.mostrarInfo());
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public Autor1 getAutor() {
        return autor1;
    }

    public void setAutor(Autor1 autor1) {
        this.autor1 = autor1;
    }

    

}
