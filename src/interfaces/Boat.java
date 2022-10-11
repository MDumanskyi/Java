package interfaces;

public class Boat implements Swimable, Transportable{

    public void swim() {
        System.out.println("Плаваю прямо");
    }

    public void transport() {
        System.out.println("Я могу перевозить");
    }
}
