package solvers;

public class P006 {
    public static long solve() {
        long sum_of_squares = 0;
        for (long i = 1; i <= 100; i++) {
            sum_of_squares += i * i;
        }

        long square_of_sum = (long) Math.pow(101 * 100 / 2, 2);

        return square_of_sum - sum_of_squares;
    }
}
