package TrabajoPractico7.Ejercicio2;

public class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        return base * altura;
    }   

}
