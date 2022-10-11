package cycle;

import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {

        Scanner ageUser = new Scanner(System.in);
        System.out.println("Введите время обратного отсчета: ");
        int time = ageUser.nextInt();

        while (time > 0) {
            if (time > 3) {
                System.out.println("Осталось " + time + " сек.");
                time--;
            } else if (time == 3) {
                System.out.println("Введите код деактивации: ");
                int password = ageUser.nextInt();
                break;
            }

        }

    }
}