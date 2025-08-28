package TrabajoPractico2;
import java.util.Scanner;

public class TrabajoPractico2 {

    static double DESCUENTO_ESPECIAL = 0.10; // Constante para el descuento especial del 10%

    public static void main(String[] args) {
        // Variables para todos los ejercicios
        Scanner input = new Scanner(System.in);
        int anio; // Ejercicio 1
        int num1, num2, num3, mayor; // Ejercicio 2
        int edad; // Ejercicio 3
        double precio;// Ejercicio 4
        char categoria; // Ejercicio 4
        int sumaTotal = 0; // Ejercicio 5
        int[] contador; // Ejercicio 6
        int nota; // Ejercicio 7
        double precioBase,impuesto,descuento,precioFinal; // Ejercicio 8
        double precioProducto,peso,costoEnvio,total; // Ejercicio 9
        String zona; // Ejercicio 9
        int stockActual,cantidadVendida,cantidadRecibida,nuevoStock; // Ejercicio 10
        double precio11; // Ejercicio 11
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99}; // Ejercicio 12

        // 1. Verificar año bisiesto
        System.out.println("Ejercicio 1: Verificar si un anio es bisiesto");
        System.out.print("Ingrese un anio: ");
        anio = Integer.parseInt(input.nextLine());
        
             if (esBisiesto(anio)) {
                 System.out.println(anio + " es un anio bisiesto.");
             } else {
                  System.out.println(anio + " no es un anio bisiesto.");
            }


        // 2. Determinar el Mayor de Tres Números
        System.out.println("\nEjercicio 2: Determinar el mayor de tres números");
        System.out.print("Ingrese el primer número: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el segundo número: ");
        num2 = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el tercer número: ");
        num3 = Integer.parseInt(input.nextLine());

    
        mayor = mayorDeTres(num1, num2, num3);     // Llamado a la funcion mayorDeTres
        System.out.println("El mayor de los tres números es: " + mayor);

        // 3. Clasificación de Edad
        System.out.println("\nEjercicio 3: Clasificación de Edad");
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        clasificarEdad(edad); // Llamado a la funcion clasificarEdad

        // 4. Calculadora de Descuento según categoría.
        System.out.println("\nEjercicio 4: Calculadora de Descuento según categoría");
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese la categoría (A B C): ");
        categoria = input.nextLine().toUpperCase().charAt(0);

        mostrarPrecioConDescuento(precio, categoria);
        
        // 5. Suma de Números Pares (while).
        System.out.println("\nEjercicio 5: Suma de Números Pares (while)");
        System.out.println("Ingrese numeros para solo sumar los pares.Para finalizar ingrese el numero 0.");
        sumaTotal = sumaPares(input);
        System.out.println("La suma total de los números pares es: " + sumaTotal);
    
        // 6. Contador de Positivos, Negativos y Ceros (for).
        System.out.println("\nEjercicio 6: Contador de Positivos, Negativos y Ceros (for)");
        System.out.println("Ingrese 10 numeros para contar cantidad de positivos, negativos y ceros.");
        contador = contadorNumeros(input);
        // Imprimir resultados
        System.out.println("Cantidad de números positivos: " + contador[0]);
        System.out.println("Cantidad de números negativos: " + contador[1]);
        System.out.println("Cantidad de ceros: " + contador[2]);

        // 7. Validación de Nota entre 0 y 10 (do-while).
        System.out.println("\nEjercicio 7: Validación de Nota entre 0 y 10 (do-while)");
        System.out.println("Ingrese una nota entre 0 y 10.");
        nota = pedirNota(input);
        System.out.println("La nota " + nota + " se guardo correctamente.");

        // 8. Cálculo del Precio Final con impuesto y descuento.
        System.out.println("\nEjercicio 8: Cálculo del Precio Final con impuesto y descuento");
      
        System.out.print("Ingrese el precio base del producto: ");
        precioBase = input.nextDouble();
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        impuesto = input.nextDouble();
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        descuento = input.nextDouble();
        precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        // Mostrar resultado
        System.out.println("El precio final del producto es: " + precioFinal);

        // 9. Composición de funciones para calcular costo de envío y total de compra.
        System.out.println("\nEjercicio 9: Cálculo de costo de envío y total de compra");
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = input.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        peso = input.nextDouble();
        input.nextLine(); 

        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        zona = input.nextLine();
        
        costoEnvio = calcularCostoEnvio(peso, zona); // Calcular costo de envio

        total = calcularTotalCompra(precioProducto, costoEnvio);  // Calcular total de compra

        // Mostrar resultados
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
    
        // 10. Actualización de stock a partir de venta y recepción de productos
        System.out.println("\nEjercicio 10: Actualización de stock a partir de venta y recepción de productos");
        System.out.print("Ingrese el stock actual del producto: ");
        stockActual = input.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        cantidadVendida = input.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        cantidadRecibida = input.nextInt();

        // Calcular nuevo stock
        nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        // Mostrar resultado
        System.out.println("El nuevo stock del producto es: " + nuevoStock);

        // 11. Cálculo de descuento especial usando variable global.
        System.out.println("\nEjercicio 11: Cálculo de descuento especial usando variable global");
        System.out.print("Ingrese el precio del producto: ");
        precio11 = input.nextDouble();

        calcularDescuentoEspecial(precio11);   // Calcular descuento especial

        // 12. Modificación de un array de precios y visualización de resultados.
        System.out.println("\nEjercicio 12: Modificación de un array de precios y visualización de resultados.");
        
        mostrarPrecios(precios, "Precios originales:"); // Mostrar los precios originales usando función
        modificarPrecio(precios, 2, 129.99); // Modificar el precio de un producto específico (por ejemplo índice 2) 
        mostrarPrecios(precios, "\nPrecios modificados:"); // Mostrar los precios modificados usando función
    }
        
    //Funcion esBisiesto
    public static boolean esBisiesto(int anio) {
        if (anio % 4 == 0) {
            if (anio % 100 == 0) {
                return anio % 400 == 0;
            }
            return true;
        }
        return false;
    }

    //Funcion mayorDeTres
    public static int mayorDeTres(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    //Funcion clasificarEdad
    public static void clasificarEdad(int edad) {
        if (edad < 0) {
           System.out.println("Edad no válida.");
        } else if (edad < 12) {
            System.out.println("Eres un Niño");
        } else if (edad <= 17) { 
            System.out.println("Eres un Adolescente");
        } else if (edad <= 59) {  
            System.out.println("Eres un Adulto");
        } else {
            System.out.println("Eres un Adulto Mayor");
        } 
    }
    // Funcion para los descuentos 
    public static void mostrarPrecioConDescuento(double precio, char categoria) {
        double porcentajeDescuento = 0;

        // Determinar el porcentaje según la categoría
        if (categoria == 'A') {
            porcentajeDescuento = 10;
        } else if (categoria == 'B') {
            porcentajeDescuento = 15;
        } else if (categoria == 'C') {
            porcentajeDescuento = 20;
        } else {
            System.out.println("Categoría no válida.");
            return;
        }

        // Calcular el descuento y el precio final
        double descuento = precio * (porcentajeDescuento / 100);
        double precioFinal = precio - descuento;

        // Mostrar resultados
        System.out.println("El precio original es de $" + precio +
                " con un descuento de " + porcentajeDescuento + "%" +
                " y el precio final es de $" + precioFinal);
    }

    // Funcion para sumar solo los pares
    public static int sumaPares(Scanner input) {  // Queria probar pasar como atributo un Scanner
        int sumaPares = 0;
        int numero;

        while (true) {
            System.out.print("Numero: ");
            numero = Integer.parseInt(input.nextLine());
            if (numero == 0) {
                break; // Salir del bucle si el número es 0
            }

            if (numero % 2 == 0) {
                sumaPares += numero; //Asi sumamos solo los pares
            }
        }

        return sumaPares; 
    }   
    
    public static int[] contadorNumeros(Scanner input) {
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        int num;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Numero " + i + ": ");
            num = input.nextInt();
            input.nextLine();

            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        return new int[]{positivos, negativos, ceros};
    }

    public static int pedirNota(Scanner input) {
    int nota;
        do {
            System.out.print("Ingrese una nota entre 0 y 10: ");
            nota = Integer.parseInt(input.nextLine());
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Intente nuevamente.");
            }
        } while (nota < 0 || nota > 10);
    
        return nota;

    }

    // Método que calcula el precio final
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        // Convertir porcentajes a decimales
        double impuestoDecimal = impuesto / 100;
        double descuentoDecimal = descuento / 100;

        // Fórmula: PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
        return precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
    }

    // Función que calcula el costo de envío según zona y peso
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return 5 * peso;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return 10 * peso;
        } else {
            System.out.println("Zona inválida. Se asumirá Nacional por defecto.");
            return 5 * peso;
        }
    }

    // Función que calcula el total de la compra sumando el precio del producto y el envío
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    // Método que calcula el stock actualizado
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }

    // Método que calcula el descuento especial usando la variable global
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    // Función para mostrar precios con un mensaje
    public static void mostrarPrecios(double[] precios, String mensaje) {
        System.out.println(mensaje);
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }

    // Función para modificar un precio en un índice dado
    public static void modificarPrecio(double[] precios, int indice, double nuevoPrecio) {
        if (indice >= 0 && indice < precios.length) {
            precios[indice] = nuevoPrecio;
        } else {
            System.out.println("Índice inválido. No se pudo modificar el precio.");
        }
    }

}
