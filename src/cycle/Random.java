package cycle;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 10);
        //System.out.println(random);

        for (int i = 0; i < 4; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Введите, пожалуйста, число от 1 до 10: ");
            int inputDigit = input.nextInt();

            if (inputDigit == random) {
                System.out.println("Поздравляем, вы угадали!");
                break;
            } else if (i == 3) {
                System.out.println("Попытики закончились");
            } else {
                System.out.println("Вы не угадали, попробуйте ещё раз, осталось попыток: " + (3 - i));
            }
        }
    }
}
