package solvers;

import java.util.ArrayList;

public class P021 {
    public static long solve() {
        long limit = 10000;
        ArrayList<Long> amicables = new ArrayList<>();

        for (long n = 1; n < limit; n++) {
            if (isAmicable(n)) {
                amicables.add(n);
            }
        }

        return amicables.stream().mapToLong(Long::valueOf).sum();
    }

    private static long sumProperFactors(long n) {
        return Utils.properFactorization(n).stream().mapToLong(Long::valueOf).sum();
    }

    private static boolean isAmicable(long a) {
        long b = sumProperFactors(a);
        return (a != b) && (sumProperFactors(b) == a);
    }
}
