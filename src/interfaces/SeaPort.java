package interfaces;

public class SeaPort {
    public static void main(String[] args) {
        Boat haydamak = new Boat();
        Duck ukta = new Duck();
        Human nazar = new Human();

        haydamak.swim();
        haydamak.transport();
        System.out.println("___________");
        ukta.swim();
        System.out.println("___________");
        nazar.swim();
    }
}
