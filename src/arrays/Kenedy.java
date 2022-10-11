package arrays;

public class Kenedy {
    public static void main(String[] args) {

        int[] array = {1,2,7,2,8,1,11,5,4,3,10,6};

        int suspect = 0;
        int killer = 0;

        for (int i = 0; i < array.length; i++) {
            if (suspect < array[i] ){
                suspect = array[i];
                killer = i;
            }
        }
        System.out.println("Убийца в ячейке: " + killer);
    }
}
