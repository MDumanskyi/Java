package dimensional;

public class ChessBoard {
    public static void main(String[] args) {

        char[][] array = new char[8][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i%2 == 0 && j%2 == 0){
                    array[i][j] = 'W';
                } else if (i%2 != 0 && j%2 != 0){
                    array[i][j] = 'W';
                } else
                    array[i][j] = 'B';

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
