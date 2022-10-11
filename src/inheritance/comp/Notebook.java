package inheritance.comp;

public class Notebook extends Computer {
    boolean touchpad;

    public Notebook(boolean processor, boolean monitor, int price, int weight, boolean touchpad) {
        super(processor, monitor, price, weight);
        this.touchpad = touchpad;
    }

    public Notebook(Notebook macbook) {
        super(macbook);
    }


    public void open(){
        System.out.println("I can open and close");
    }
}
