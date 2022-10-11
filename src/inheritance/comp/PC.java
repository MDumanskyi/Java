package inheritance.comp;

public class PC extends Computer{
    boolean mouse;

    public PC(boolean processor, boolean monitor, int price, int weight, boolean mouse) {
        super(processor, monitor, price, weight);
        this.mouse = mouse;
    }

    public void upgrade (){
        System.out.println("I can upgrade");
    }
}
