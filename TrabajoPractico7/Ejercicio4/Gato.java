package TrabajoPractico7.Ejercicio4;

public class Gato extends Animal{

    @Override
    public String hacerSonido() {
        return "Miau";
    }

    @Override
    public void describirAnimal() {
        System.out.println("Este es un gato.");
    }
}
