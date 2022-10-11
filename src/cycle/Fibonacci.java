package cycle;

public class Fibonacci {
    public static void main(String[] args) {

        int next = 1;
        int previous = 1;
        int result = 0;
        System.out.println(next);
        System.out.println(previous);

        for (int i = 0; i < 10; i++) {
            result = previous + next;
            previous = next;
            next = result;
            System.out.print(result + " ");
        }
    }
}
