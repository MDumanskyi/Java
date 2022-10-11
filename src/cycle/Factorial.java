package cycle;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите, пожалуйста, целое положительное число:");
        int inputDigit = input.nextInt();
        int result = 1;

        for (int i = 1; i <= inputDigit; i++) {
            result = result * i;
        }
        System.out.println("Факториал числа " + inputDigit + " : " + result);
    }
}
