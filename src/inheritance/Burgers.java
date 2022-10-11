package inheritance;

public class Burgers {
    String bun;
    String meat;
    String cheese;
    String greens;
    String sauce;

    Burgers(String bun, String meat, String cheese, String greens, String sauce) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.sauce = sauce;
    }

    public void compound() {
        System.out.println("Бургер состоит из: " + bun + " булка, " + cheese + ", " + meat + ", " + greens + ", " + sauce);
    }

}
