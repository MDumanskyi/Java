package inheritance.comp;

public class Console extends Computer{
    boolean joystick;

    public Console(boolean processor, boolean monitor, int price, int weight, boolean joystick) {
        super(processor, monitor, price, weight);
        this.joystick = joystick;
    }

    public void play (){
        System.out.println("I can play");
    }
}
