package conditional;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        int sum = scan();
        if (sum > 30) {
            System.out.println("Вы ввели неккоректные данные");
        }

        if (sum >= 0 && sum <= 10) {
            System.out.println("Камень");
        } else if (sum > 10 && sum <= 20) {
            System.out.println("Ножницы");
        } else if (sum > 20 && sum <= 30) {
            System.out.println("Бумага");
        }
    }

    public static int scan() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три числа от 1 до 10:");
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        return Math.abs(input1 + input2 + input3);
    }
}
