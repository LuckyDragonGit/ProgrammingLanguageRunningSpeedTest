import java.time.Instant;

public class Java {

    public static int fibonacci(int n) {
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /*
    More functions is being planning.
    更多函数，敬请期待。
     */

    public static void main(String[] args) {
        int n = 35;
        Instant start = Instant.now();
        System.out.printf("%d\n", fibonacci(n));
        Instant end = Instant.now();

        double timeTaken = (double) (end.toEpochMilli() - start.toEpochMilli()) / 1000;
        System.out.printf("Fibonacci Time Taken: %.3fs\n", timeTaken);
    }
}
