package StaticConstEnam;

public class GoProFactory {
    public static void main(String[] args) {

        GoPro camera0 = new GoPro();
        GoPro camera1 = new GoPro();
        GoPro camera2 = new GoPro();
        GoPro camera3 = new GoPro();
        GoPro camera4 = new GoPro();

        System.out.println(GoPro.count);


    }
}
