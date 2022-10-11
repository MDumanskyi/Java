package inheritance;

public class DoubleBurger extends Burgers {

    String additionalCheese;
    String additionalMeat;

    DoubleBurger (String bun, String meat, String cheese, String greens, String sauce, String additionalCheese, String additionalMeat){
        super(bun, meat, cheese, greens, sauce);
        this.additionalCheese = additionalCheese;
        this.additionalMeat = additionalMeat;
    }

    public void compoundDouble() {
        System.out.println("Бургер состоит из: " + bun + " булка, " + cheese + ", " + additionalCheese + ", " + meat  + ", " + additionalMeat + ", " + greens + ", " + sauce);
    }


}
