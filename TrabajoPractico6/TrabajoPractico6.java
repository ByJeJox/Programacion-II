package TrabajoPractico6;

import java.util.ArrayList;
import java.util.List;

import TrabajoPractico6.CasoPractico1.CategoriaProducto;
import TrabajoPractico6.CasoPractico1.Inventario;
import TrabajoPractico6.CasoPractico1.Producto;
import TrabajoPractico6.CasoPractico2.Biblioteca;
import TrabajoPractico6.CasoPractico2.Autor1;
import TrabajoPractico6.CasoPractico2.Libro;

public class TrabajoPractico6 {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        inventario.agregarProducto(new Producto("1", "Fideos", 220, 120, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("2", "TV", 1000000, 30, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("3", "Silla", 3000, 100, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("4", "Lavarropas", 500000, 6, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("5", "Jean", 2500, 460, CategoriaProducto.ROPA));

        inventario.listarProductos();

        System.out.println("Producto por ID:");
        Producto productoPorId = inventario.buscarProductoPorId("2");
        productoPorId.mostrarInfo();

        System.out.println("Productos filtrados: ");
        ArrayList<Producto> productosPorCategoria = inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        for (Producto p : productosPorCategoria) {
             p.mostrarInfo();
        }

        System.out.println("Eliminar producto de id 2: ");
        inventario.eliminarProducto("2");
        System.out.println("Nuevo inventario:");
        inventario.listarProductos();

        inventario.actualizarStock("5", 400);

        System.out.println("Producto con mayor Stock");
        inventario.obtenerProductoConMayorStock().mostrarInfo();

        System.out.println("Productos entre 1000 y 3000");
        ArrayList<Producto> productosFiltradosPorPrecio = inventario.filtrarProductosPorPrecio(1000, 3000);
        for (Producto p : productosFiltradosPorPrecio) {
            p.mostrarInfo();
        }

        inventario.mostrarCategoriasDisponibles();

        System.out.println("-----Caso 2-----");

        Biblioteca biblioteca = new Biblioteca("Biblioteca de La Plata");

        Autor1 miguel = new Autor1("1","Miguel de Cervantes", "España");
        Autor1 jane = new Autor1("2","Jane Austen", "Reino Unido");
        Autor1 stephen = new Autor1("3","Stephen King", "Estados Unidos");

        biblioteca.agregarLibro("E6534", "Don Quijote", 1605, miguel);
        biblioteca.agregarLibro("E6757", "La Galatea", 1585, miguel);
        biblioteca.agregarLibro("A6764", "Orgullo y prejuicio", 0, jane);
        biblioteca.agregarLibro("I6874", "It", 1986, stephen);
        biblioteca.agregarLibro("I9768", "El resplandor", 1977, stephen);

        System.out.println("Listado de los libros de la biblioteca: ");
        biblioteca.listarLibros();
        System.out.println("");

        System.out.println("Buscar el libro de isbn E6757: ");
        biblioteca.buscarLibroPorIsbn("E6757").mostrarInfo();;
        System.out.println("");

        int anioFiltrado = 1977;
        System.out.println("Los libros del año 1977 son: ");
        List<Libro> librosPorAnio = biblioteca.filtrarLibrosPorAnio(anioFiltrado);
        for (Libro libro : librosPorAnio) {
             libro.mostrarInfo();
        }
        System.out.println("");

        biblioteca.eliminarLibro("I6874");

        System.out.println("Mostramos los libros totales: " + biblioteca.obtenerCantidadLibros());
        System.out.println("");

        System.out.println("Autores de los libros de la biblioteca:");
        biblioteca.mostrarAutoresDisponibles();
        
    }
}
