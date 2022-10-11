package StaticConstEnam.drinksMachine;

public class Drinks {
    static final int coffee = 20;
    static final int tea = 15;
    static final int lemonade = 14;
    static final int mohito = 22;
    static final int cola = 17;


    static int count;
    static int sum;

    Drinks(String drink, int price, int count){
        System.out.println(drink + " готовится");
        sum = sum + price;
        count = count + 1;
        System.out.println("Сумма заказаных напитков: " + Drinks.sum + ", количество напитков: " + count);
        System.out.println("Желаете заказать ещё что-нибудь? Если не желаете ничего заказывать то укажите nothing.");
    }

}
