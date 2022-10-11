package cycle;

public class SpaceShuttle {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            String number = String.valueOf(i);

            if (number.contains("4") || number.contains("9")) {

            } else {
                System.out.println(number);
            }
            //if(!(number.contains("4") || number.contains("9")))
            //  System.out.println(number);
            i++;
        }
    }
}
