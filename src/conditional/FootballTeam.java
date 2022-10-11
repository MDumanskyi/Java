package conditional;

import java.util.Scanner;

public class FootballTeam {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер команды от 1 до 5:");
        int teamNumber = sc.nextInt();
        String teamName = "";

        switch (teamNumber) {
            case 1:
                teamName = "Dynamo";
                break;
            case 2:
                teamName = "MU";
                break;
            case 3:
                teamName = "Bayern";
                break;
            case 4:
                teamName = "Arsenal";
                break;
            case 5:
                teamName = "Vorohta";
                break;
        }

        if (teamName.isEmpty()) {
            System.out.println("Вы ввели неккоректные данные");
            return;
        }
        System.out.println("Ваша любимая команда " + teamName);

        System.out.println("Введите количество очков от 0 до 200:");
        int point = sc.nextInt();

        if (point < 0 || point > 200) {
            System.out.println("Вы ввели неккоректные данные");
            return;
        }

        System.out.println("Введите коэффициент ставок на команду от 1 до 10:");

        double coefficient = sc.nextDouble();
        if (coefficient < 1 || coefficient > 10) {
            System.out.println("Вы ввели неккоректные данные");
            return;
        }

        double totalQuantity = point * coefficient;

        if (totalQuantity < 1000) {
            System.out.println("Команда будет играть в чемпионате страны");
        } else if (totalQuantity >= 1000 && totalQuantity < 2000) {
            System.out.println("Команда будет играть в лиге европы");
        } else {
            System.out.println("Команда будет играть в лиге чемпионов");
        }
    }
}
