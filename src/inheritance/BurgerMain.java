package inheritance;

public class BurgerMain {
    public static void main(String[] args) {
        Burgers burger = new Burgers("Цельнозерновая", "Курица", "Маздам", "Укроп", "Кетчуп");
        burger.compound();

        DoubleBurger doubleBurger = new DoubleBurger("Цельнозерновая", "Курица", "Маздам", "Укроп", "Кетчуп", "Гауда", "Бекон");
        doubleBurger.compoundDouble();
    }
}
