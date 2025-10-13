package TrabajoPractico7;

import java.util.ArrayList;

import TrabajoPractico7.Ejercicio1.Auto;
import TrabajoPractico7.Ejercicio2.Figura;
import TrabajoPractico7.Ejercicio2.Circulo;
import TrabajoPractico7.Ejercicio2.Rectangulo;
import TrabajoPractico7.Ejercicio3.Empleado;
import TrabajoPractico7.Ejercicio3.EmpleadoPlanta;
import TrabajoPractico7.Ejercicio3.EmpleadoTemporal;
import TrabajoPractico7.Ejercicio4.Animal;
import TrabajoPractico7.Ejercicio4.Gato;
import TrabajoPractico7.Ejercicio4.Perro;
import TrabajoPractico7.Ejercicio4.Vaca;

public class TrabajoPractico7 {

    public static void main(String[] args) {

        System.out.println("--- Ejercicio 1 ---");
        Auto auto = new Auto("Toyota", "Yaris", 5);

        auto.mostrarinfo();

        System.out.println("--- Ejercicio 2 ---");
        Figura[] figuras = new Figura[2];

        figuras[0] = new Circulo("Circulo", 5);
        figuras[1] = new Rectangulo("Rectangulo", 6,8);

        for (Figura figura : figuras) {
            figura.mostrarNombre();
            System.out.println("Área: " + figura.calcularArea());  
            System.out.println("-------------------------");
        }
    
        System.out.println("--- Ejercicio 3 ---");
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Luis"));
        empleados.add(new EmpleadoTemporal("Andres"));

        for (Empleado emp : empleados) {
            System.out.println("Empleado: " + emp.getNombre());
            System.out.println("Sueldo: $" + emp.calcularSueldo());

        
        if (emp instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Planta permanente");
        } else if (emp instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Contrato temporal");
        }

        System.out.println("-------------------------");

        }

        System.out.println("--- Ejercicio 4 ---");
        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro());
        animales.add(new Gato());
        animales.add(new Vaca());

        for (Animal animal : animales) {
            animal.describirAnimal(); 
            System.out.println("Sonido: " + animal.hacerSonido()); 
            System.out.println("-------------------------");
        }

    }

}