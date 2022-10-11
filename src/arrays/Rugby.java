package arrays;

public class Rugby {

    public static void main(String[] args) {

//        int[] teamOne = new int[25];
//        int[] teamTwo = new int[25];
//        int previous = 0;
//        int sum1 = 0;
//        int sum2 = 0;
//
//        for (int i = 0; i < teamOne.length; i++) {
//            int random = (int) (Math.random() * 22 + 18);
//            teamOne[i] = random;
//            if (i < teamOne.length - 1){
//                System.out.print(teamOne[i] + ", ");
//            } else {
//                System.out.print(teamOne[i] + "\n");
//            }
//
//            sum1 = random + previous;
//            previous = sum1;
//        }
//
//        previous = 0;
//
//        for (int i = 0; i < teamTwo.length; i++) {
//            int random = (int) (Math.random() * 22 + 18);
//            teamTwo[i] = random;
//            if (i < teamTwo.length - 1){
//                System.out.print(teamTwo[i] + ", ");
//            } else {
//                System.out.print(teamTwo[i] + "\n");
//            }
//
//            sum2 = random + previous;
//            previous = sum2;
//        }
        int firstTeam = 25;
        int secondTeam = 25;
        double firstTeamAverageAge = countPoint(firstTeam);
        double secondTeamAverageAge = countPoint(secondTeam);


        System.out.println("Средний возраст игроков первой команды: " + firstTeamAverageAge);
        System.out.println("Средний возраст игроков второй команды: " + secondTeamAverageAge);

        if (firstTeamAverageAge > secondTeamAverageAge) {
            System.out.println("Первая команда старше");
        } else if (firstTeamAverageAge < secondTeamAverageAge) {
            System.out.println("Вторая команда старше");
        } else {
            System.out.println("У команд одинаковый средний возраст");
        }
    }
    public static double countPoint(int x) {
        int[] team = new int[x];

        double sum = 0;

        System.out.print("Возраст игроков: ");
        for (int i = 0; i < team.length; i++) {
            team[i] = (int) (Math.random() * 22 + 18);

            if (i < team.length - 1) {
                System.out.print(team[i] + ", ");
            } else {
                System.out.print(team[i] + "\n");
            }

            sum = team[i] + sum;
        }
        return sum / x;
    }
}
