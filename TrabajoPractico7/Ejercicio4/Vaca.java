package TrabajoPractico7.Ejercicio4;

public class Vaca extends Animal{

    @Override
    public String hacerSonido() {
        return "Muuu";
    }

    @Override
    public void describirAnimal() {
        System.out.println("Esta es una vaca.");
    }
}
