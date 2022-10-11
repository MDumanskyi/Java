package math;

public class Snowman {
    public static void main(String[] args) {

        double h = 1;
        double f = 0.5;
        double d = 0.2;

        double weight_layer1 = 0.7 * (double) 4 / 3 * Math.PI * Math.pow(h, 3);
        double weight_layer2 = 0.7 * (double) 4 / 3 * Math.PI * Math.pow(f, 3);
        double weight_layer3 = 0.7 * (double) 4 / 3 * Math.PI * Math.pow(d, 3);

        double snowman = weight_layer1 + weight_layer2 + weight_layer3;

        System.out.println("Вес снеговика " + snowman);
    }
}