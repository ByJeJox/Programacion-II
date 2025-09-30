package TrabajoPractico6.CasoPractico2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Biblioteca {

    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo,int anioPublicacion, Autor1 autor1) {
        if (!isbn.equals("") && isbn !=null && !titulo.equals("") && titulo !=null && anioPublicacion > 0 && autor1 != null) {
            libros.add(new Libro(isbn, titulo, anioPublicacion, autor1));
        }
    }

    public void listarLibros() {
        System.out.println("Los libros de la biblioteca " + nombre + " son: ");
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public void eliminarLibro(String isbn) {
        if (isbn != null) {
            Libro libroEliminar = this.buscarLibroPorIsbn(isbn);
            if (libroEliminar !=null) {
                libros.remove(libroEliminar);
            }
        }
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }


    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> libroPorAnio = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libroPorAnio.add(libro);
            }
        }
        return Collections.unmodifiableList(libroPorAnio);
    }

   public void mostrarAutoresDisponibles() {
        for (Libro libro : libros) {
        System.out.println(libro.getAutor().mostrarInfo());
         }
    }   
}
