package math;

public class War {
    public static void main(String[] args) {

        int warrior_li = 13;
        int achier_li = 24;
        int rider_li = 46;
        int count_li = 860;

        int warrior_min = 9;
        int achier_min = 35;
        int rider_min = 12;
        double count_min = 860 * 1.5;


        double attack_power_li = warrior_li * count_li + achier_li * count_li + rider_li * count_li;
        double attack_power_min = warrior_min * count_min + achier_min * count_min + rider_min * count_min;

        System.out.println("Сила таки династии Ли :" + attack_power_li);
        System.out.println("Сила таки династии Минь :" + attack_power_min);
    }
}
