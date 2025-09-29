package TrabajoPractico6;

import java.util.ArrayList;

import TrabajoPractico6.CasoPractico1.CategoriaProducto;
import TrabajoPractico6.CasoPractico1.Inventario;
import TrabajoPractico6.CasoPractico1.Producto;

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
    }
}
