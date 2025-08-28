package TrabajoPractico3;

public class NaveEspacial {

    String nombre;
    int combustible;

    public void despegar() {
        System.out.println("La nave " + nombre + " ha despegado.");
    }

    public void avanzar(int distancia) {
        if (distancia <= combustible) {
            combustible -= distancia;
            System.out.println(nombre + " ha avanzado " + distancia + " km.");
        } else {
            System.out.println("Combustible insuficiente para avanzar " + distancia + " km.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= 100) {
            combustible += cantidad;
            System.out.println("Combustible recargado. Nivel actual: " + combustible);
        } else {
            combustible = 100;
            System.out.println("Recarga ajustada al límite. Nivel actual: " + combustible);
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible restante: " + combustible);
    }

}

