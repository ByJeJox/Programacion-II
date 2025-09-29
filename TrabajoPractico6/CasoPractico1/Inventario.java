package TrabajoPractico6.CasoPractico1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Inventario {

    ArrayList <Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p)   {
        productos.add(p);
    }

    public void listarProductos()  {
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id) {
        Producto productoEncontrado = null;
        int i = 0;

        while (i < productos.size() && !this.productos.get(i).getId().equalsIgnoreCase(id)) {
            i++;
        }

        if (i < this.productos.size()) {
            productoEncontrado = this.productos.get(i);
        }

        return productoEncontrado;
    } 

    public void eliminarProducto(String id)  {
        Producto p = buscarProductoPorId(id);

        if (p !=null) {
            this.productos.remove(p);
            System.out.println("El producto se ha eliminado");
        } else {
            System.out.println("No se encontro el ID");
        }
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);

        if (p != null && nuevaCantidad > 0) {
            p.setCantidad(nuevaCantidad);
            System.out.println("Se agrego la nueva cantidad");
        } else if (nuevaCantidad < 0) {
            System.out.println("La cantidad ingresada debe ser positiva");
        } else if (p == null) {
            System.out.println("No se encontro el ID del producto");
        }
    } 

    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> productosFiltrados = new ArrayList<>();

        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                productosFiltrados.add(p);
            }
        }
        return productosFiltrados;
    }

    public int obtenerTotalStock() {
        int totalStock = 0;
        for (Producto p : productos) {
            totalStock += p.getCantidad()
        }
        return totalStock;
    }

    public Producto obtenerProductoConMayorStock()  {
        int maxStock = -1;
        Producto productoMaxStock = null;
        for (Producto p : productos) {
            if (p.getCantidad() >= maxStock) {
                maxStock = p.getCantidad();
                productoMaxStock = p;
            }
        }
        return productoMaxStock;
    }

    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max)  {
        ArrayList<Producto> productosFiltrados = new ArrayList<>();

        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                productosFiltrados.add(p);
            }
            
        }
        return productosFiltrados;
    }

    public void mostrarCategoriasDisponibles()  {
        System.out.println("Categorias disponibles: ");
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println("Categoria: " + c);
            System.out.println("Descripcion: " + c.getDescripcion());
        }
    }
}
