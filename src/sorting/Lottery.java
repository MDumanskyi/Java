package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {

        int[] company = new int[7];
        int[] mine = new int[7];
        int coincidence = 0;

        for (int i = 0; i < company.length; i++) {
            company[i] = (int) (Math.random() * 10 + 1);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Введите 7 чисел от 1 до 10 :");
        for (int i = 0; i < mine.length; i++) {
            mine[i] = input.nextInt();
        }

        Arrays.sort(company);
        Arrays.sort(mine);

        for (int i = 0; i < 6; i++) {
            if (company[i] == mine[i]) {
                coincidence++;

            }
        }

        System.out.println(Arrays.toString(company));
        System.out.println(Arrays.toString(mine));
        System.out.println("Количество совпадений: " + coincidence);
    }
}
