package inheritance.comp;

public class CompFactory {
    public static void main(String[] args) {
        PC lenovo = new PC(true, false, 100, 1000, true);
        Notebook macbook = new Notebook(true, true, 10000, 250, true);
        Console ps4 = new Console(true, false, 1000, 680, true);

        lenovo.upgrade();
        macbook.open();
        ps4.play();

        Notebook samsung = new Notebook(macbook);
        samsung.open();
    }
}




