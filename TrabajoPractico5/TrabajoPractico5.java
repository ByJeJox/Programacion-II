package TrabajoPractico5;

import TrabajoPractico5.Ejercicio3.Libro;
import TrabajoPractico5.Ejercicio4.Banco;
import TrabajoPractico5.Ejercicio4.Cliente;
import TrabajoPractico5.Ejercicio4.TarjetaDeCredito;
import TrabajoPractico5.Ejercicio5.Computadora;
import TrabajoPractico5.Ejercicio5.Propietario;
import TrabajoPractico5.Ejercicio1.Pasaporte;
import TrabajoPractico5.Ejercicio1.Titular;
import TrabajoPractico5.Ejercicio10.CuentaBancaria;
import TrabajoPractico5.Ejercicio10.Titular1;
import TrabajoPractico5.Ejercicio11.Artista;
import TrabajoPractico5.Ejercicio11.Cancion;
import TrabajoPractico5.Ejercicio11.Reproductor;
import TrabajoPractico5.Ejercicio12.Calculadora;
import TrabajoPractico5.Ejercicio12.Contribuyente;
import TrabajoPractico5.Ejercicio12.Impuesto;
import TrabajoPractico5.Ejercicio13.GeneradorQR;
import TrabajoPractico5.Ejercicio13.Usuario2;
import TrabajoPractico5.Ejercicio14.EditorVideo;
import TrabajoPractico5.Ejercicio14.Proyecto;
import TrabajoPractico5.Ejercicio2.Bateria;
import TrabajoPractico5.Ejercicio2.Celular;
import TrabajoPractico5.Ejercicio2.Usuario;
import TrabajoPractico5.Ejercicio3.Autor;
import TrabajoPractico5.Ejercicio3.Editorial;
import TrabajoPractico5.Ejercicio6.Mesa;
import TrabajoPractico5.Ejercicio6.Reserva;
import TrabajoPractico5.Ejercicio7.Conductor;
import TrabajoPractico5.Ejercicio7.Motor;
import TrabajoPractico5.Ejercicio6.Cliente1;
import TrabajoPractico5.Ejercicio7.Vehiculo;
import TrabajoPractico5.Ejercicio8.Documento;
import TrabajoPractico5.Ejercicio8.Usuario1;
import TrabajoPractico5.Ejercicio9.CitaMedica;
import TrabajoPractico5.Ejercicio9.Paciente;
import TrabajoPractico5.Ejercicio9.Profesional;

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

        System.out.println(" ");
        System.out.println("-----Ejercicio 4-----");
        Banco banco1 = new Banco("Galicia", "25-123456678-9");
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("5678-7869-6758-0960", "12/26", banco1);
        Cliente cliente1 = new Cliente("Omar Rios","29964587");

        tarjeta1.setCliente(cliente1);
        tarjeta1.mostrarTarjeta();

        System.out.println(" ");
        System.out.println("-----Ejercicio 5-----");
        Computadora computadora1 = new Computadora("Asus", "34567645", "E1504", "Intel Z690");
        Propietario Propietario1 = new Propietario("Matias Gonzales", "40876534");
        computadora1.setPropietario(Propietario1);
        computadora1.mostrarComputadora();
        
        System.out.println(" ");
        System.out.println("-----Ejercicio 6-----");
        Cliente1 cliente2 = new Cliente1("Sofia Villanueva", "40853492");
        Mesa mesa1 = new Mesa("3", 4);
        Reserva reserva1 = new Reserva("20/06/2024", "20:00", mesa1);
        reserva1.setCliente(cliente2);
        reserva1.mostrarReserva();

        System.out.println(" ");
        System.out.println("-----Ejercicio 7-----");
        Motor motor1 = new Motor("V8", "SN123456789");
        Vehiculo vehiculo1 = new Vehiculo("ABC123", "Ford Mustang", motor1);
        Conductor conductor1 = new Conductor("Lucas Fernandez", "XYZ987654");
        vehiculo1.setConductor(conductor1);
        vehiculo1.mostrarVehiculo();

        System.out.println(" ");
        System.out.println("-----Ejercicio 8-----");
        Usuario1 usuario2 = new Usuario1("Martin Rodriguez", "40328654");
        Documento documento1 = new Documento("Contrato de Alquiler", "Este es el contenido del contrato de alquiler.", "a1b2c3d4e5f6g7h8", "15/06/2024", usuario2);
        documento1.mostrarDocumento();

        System.out.println(" ");
        System.out.println("-----Ejercicio 9-----");
        CitaMedica cita1 = new CitaMedica("24/10/2025", "10:30");
        Paciente paciente1 = new Paciente("Ana Gomez", "OSDE");
        Profesional profesional1 = new Profesional("Dr. Juan Perez", "Cardiologia");
        cita1.setPaciente(paciente1);
        cita1.setProfesional(profesional1);
        cita1.mostrarCitaMedica();

        System.out.println(" ");
        System.out.println("-----Ejercicio 10-----");
        CuentaBancaria cuenta1 = new CuentaBancaria("4359654890", 400000, "5675623453", "10/9/2025");
        Titular1 titular1 = new Titular1("Rodolfo Nuñez", "20947368");
        cuenta1.setTitular(titular1);
        cuenta1.mostrarCuentaBancaria();

        System.out.println(" ");
        System.out.println("-----Ejercicio 11-----");
        Cancion cancion1 = new Cancion("Let It Be");
        Artista artista1 = new Artista("The Beatles", "rock and rol");
        cancion1.setArtista(artista1);
        Reproductor reproductor1 = new Reproductor();
        reproductor1.reproducir(cancion1);

        System.out.println(" ");
        System.out.println("-----Ejercicio 12-----");
        Impuesto impuesto1 = new Impuesto(5);
        Contribuyente contribuyente1 = new Contribuyente("Mariano Medina", "20857436586");
        impuesto1.setContribuyente(contribuyente1);
        Calculadora calculadora1 = new Calculadora();
        calculadora1.calcular(impuesto1);
        impuesto1.mostrarImpuesto();

        System.out.println(" ");
        System.out.println("-----Ejercicio 13-----");
        Usuario2 usuario3 = new Usuario2("Lucas", "Luquitas@gmail.com");
        GeneradorQR generadorQR1 = new GeneradorQR();
        generadorQR1.generar("#CODIGO_QR#", usuario3);

        System.out.println(" ");
        System.out.println("-----Ejercicio 14-----");
        Proyecto proyecto1 = new Proyecto("Video Explicativo", 6.20);
        EditorVideo editorVideo1 = new EditorVideo();
        editorVideo1.exportar("MP4", proyecto1);
    }
    
}
