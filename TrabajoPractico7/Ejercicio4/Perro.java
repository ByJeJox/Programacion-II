package TrabajoPractico7.Ejercicio4;

public class Perro extends Animal{

    @Override
    public String hacerSonido() {
        return "Guau guau";
    }

    @Override
    public void describirAnimal() {
        System.out.println("Esto es un perro.");
    }
}


