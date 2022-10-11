package polymorphism;

public class Bar {
    public static void main(String[] args) {
        MusicStyles rock = new RockMusic();
        MusicStyles pop = new PopMusic();
        MusicStyles classic = new ClassicMusic();

        MusicStyles [] group  = {rock, pop, classic};

        for (MusicStyles a:group ) {
            a.playMusic();
        }


    }
}
