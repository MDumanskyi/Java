package StaticConstEnam.drinksMachine;

import java.util.Scanner;

public class DrinksMachine {
    public static void main(String[] args) {

        System.out.println("Вы можете у нас приобрести: coffee, tea, lemonade, mohito, cola. Если не желаете ничего заказывать то укажите nothing.");
        int option = 0;
        Scanner enterType = new Scanner(System.in);
        System.out.println("Выберите желаемый напиток: ");

        do {

            String enteredValue = enterType.nextLine();
            String upperValue = enteredValue.toUpperCase();
            TypesOfDrinks drink = TypesOfDrinks.valueOf(upperValue);


            switch (drink) {
                case COFFEE:
                    new Drinks(upperValue, Drinks.coffee, Drinks.count);
                    Drinks.count++;
                    option = 1;
                    break;
                case TEA:
                    new Drinks(upperValue, Drinks.tea, Drinks.count);
                    Drinks.count++;
                    option = 1;
                    break;
                case LEMONADE:
                    new Drinks(upperValue, Drinks.lemonade, Drinks.count);
                    Drinks.count++;
                    option = 1;
                    break;
                case MOHITO:
                    new Drinks(upperValue, Drinks.mohito, Drinks.count);
                    Drinks.count++;
                    option = 1;
                    break;
                case COLA:
                    new Drinks(upperValue, Drinks.cola, Drinks.count);
                    Drinks.count++;
                    option = 1;
                    break;
                case NOTHING:
                    option = 0;
                    break;
            }
        } while (option != 0);

        if (Drinks.sum != 0) {
            System.out.println("Итого к оплате: " + Drinks.sum + ", количество напитков: " + Drinks.count);
        } else {
            System.out.println("До встречи");
        }

    }
}
