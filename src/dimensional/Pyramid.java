package dimensional;

public class Pyramid {
    public static void main(String[] args) {

        int x = 5;
        int y = x * 2 - 1;

        char[][] pyramid = new char[x][y];

        int a = y / 2;
        System.out.println(a);

        for (int i = 0; i < pyramid.length; i++) {
            for (int j = 0; j < pyramid[i].length; j++) {
                if (pyramid[i][j]==pyramid[i][x]){
                    pyramid[i][j] = '0';
                }else {
                    pyramid[i][j] = '3';
                }
                System.out.print(pyramid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
