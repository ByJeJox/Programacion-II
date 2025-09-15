package TrabajoPractico5;

import TrabajoPractico5.Ejercicio3.Libro;
import TrabajoPractico5.Ejercicio1.Pasaporte;
import TrabajoPractico5.Ejercicio1.Titular;
import TrabajoPractico5.Ejercicio2.Bateria;
import TrabajoPractico5.Ejercicio2.Celular;
import TrabajoPractico5.Ejercicio2.Usuario;
import TrabajoPractico5.Ejercicio3.Autor;
import TrabajoPractico5.Ejercicio3.Editorial;

public class TrabajoPractico5 {

    public static void main(String[] args) {

        System.out.println("-----Ejercicio 1-----");
        Pasaporte pasaporte = new Pasaporte("1234DF","12/06/2024","Carita", "Cuadrado");
        Titular titular = new Titular("Agustin Martinez","39964587");
        pasaporte.setTitular(titular);
        
        System.out.println("Pasaporte"); // Como es Asociacion bidireccional, puede mostrar info del titular, en adelante solo usaremos uno solo para la actividad
        pasaporte.mostrarPasaporte();
        System.out.println(" ");
        System.out.println("Titular"); // Como es Asociacion bidireccional, puede mostrar info del pasaporte
        titular.mostrarTitular();

        System.out.println(" ");
        System.out.println("-----Ejercicio 2-----");
        Bateria bateria1 = new Bateria("Litio","4000mAh");
        Celular celular1 = new Celular("123456789012345","Samsung","Galaxy S21",bateria1);
        Usuario usuario1 = new Usuario("Dario Lopez","212345678");
        usuario1.setCelular(celular1);

        celular1.mostrarCelular();

        System.out.println(" ");
        System.out.println("-----Ejercicio 3-----");
        Editorial editorial1 = new Editorial("DEBOLSILLO", "Maipu 123");
        Libro libro1 = new Libro("Dune", "978-84-663-3465-0", editorial1);
        Autor autor1 = new Autor("Frank Herbert", "EE.UU");

        libro1.setAutor(autor1);
        libro1.mostrarLibro();
        


    }
    
}
