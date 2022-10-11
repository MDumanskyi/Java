package arrays;

public class Basketball {
    public static void main(String[] args) {

        int[] array = {1, 2, 1, 2, 1, 2, 1, 2, 1, 2};

        int finalResult1 = 0;
        int finalResult2 = 0;

        for (int i = 0; i < array.length; i++) {

            if (i % 2 == 0) {
                finalResult1 = finalResult1 + array[i];
            } else {
                finalResult2 = finalResult2 + array[i];
            }
        }
        System.out.println("Результат стартового состава:" + finalResult1);
        System.out.println("Результат запасного состава:" + finalResult2);
    }
}
