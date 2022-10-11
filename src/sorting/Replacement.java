package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Replacement {
    public static void main(String[] args) {
        Scanner inputArrayLength = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int[] array = new int[inputArrayLength.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println("Первоначальный массив: " + Arrays.toString(array));
        int first = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = first;
        System.out.println("Массив после перестановки: " + Arrays.toString(array));
    }
}
