package sorting;

import java.util.Arrays;

public class SortAndCopy {
    public static void main(String[] args) {

        int[] initial = new int[10];

        for (int i = 0; i < initial.length; i++) {
            initial[i] = (int) (Math.random() * 100);

        }
        System.out.println("Первоначальный массив " + Arrays.toString(initial));

        int[] increase = Arrays.copyOfRange(initial, 0, 5);
        int[] down = Arrays.copyOfRange(initial, 5, 10);
        System.out.println("Первый массив " + Arrays.toString(increase));
        System.out.println("Второй массив " + Arrays.toString(down));

        boolean sort = false;

        while (sort != true) {
            sort = true;

            for (int i = 0; i < increase.length - 1; i++) {
                int temp;
                if (increase[i] > increase[i + 1]) {
                    sort = false;
                    temp = increase[i];
                    increase[i] = increase[i + 1];
                    increase[i + 1] = temp;
                }

            }
        }
        sort = false;

        while (sort != true) {
            sort = true;

            for (int i = 0; i < down.length - 1; i++) {
                int temp;
                if (down[i] < down[i + 1]) {
                    sort = false;
                    temp = down[i];
                    down[i] = down[i + 1];
                    down[i + 1] = temp;
                }

            }
        }
        System.out.println("Первый массив после сортировки " + Arrays.toString(increase));
        System.out.println("Второй массив после сортировки " + Arrays.toString(down));

    }
}
