package solvers;

import java.util.ArrayList;
import java.util.List;

public class P002 {
    public static long solve() {
        List<Long> fibs = getFibonacciNumbersBelowN(4_000_000);

        long sum = 0;
        for (Long fib : fibs) {
            if (fib % 2 == 0) {
                sum += fib;
            }
        }

        return sum;
    }

    private static List<Long> getFibonacciNumbersBelowN(int maxN) {
        ArrayList<Long> fibs = new ArrayList<>();
        fibs.add((long) 1);
        fibs.add((long) 1);

        while (true) {
            int lastIndex = fibs.size() - 1;
            long next = fibs.get(lastIndex) + fibs.get(lastIndex - 1);

            if (next > maxN) {
                break;
            }

            fibs.add(next);
        }

        return fibs;
    }
}
