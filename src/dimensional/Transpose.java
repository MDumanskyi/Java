package dimensional;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int inputN = input.nextInt();
        System.out.println("Введите количество столбцов: ");
        int inputM = input.nextInt();


        int[][] array = new int[inputN][inputM];
        int[][] arrayTrans = new int[inputM][inputN];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int a = (int) (Math.random() *10);
                array[i][j]= a;
            }
        }

        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrayTrans[j][i] = array[i][j];
            }
        }

        for (int[] ints : arrayTrans) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
