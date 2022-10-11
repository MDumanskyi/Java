package inheritance.comp;

public class Computer {
    boolean processor;
    boolean monitor;
    int price;
    int weight;

    public Computer(boolean processor, boolean monitor, int price, int weight){
        this.processor = processor;
        this.monitor = monitor;
        this.price = price;
        this.weight = weight;
    }

    public Computer(Notebook original) {
        this.processor = original.processor;
        this.monitor = original.monitor;
        this.price = original.price;
        this.weight = original.weight;
    }
}
