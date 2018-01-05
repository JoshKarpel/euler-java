package solvers;

public class P009 {
    public static long solve() {
        long sum = 1000;
        for (long a = 1; a <= sum; a++) {
            for (long b = 1; b <= sum - a; b++) {
                long c = sum - a - b;
                if (isPythagoreanTriplet(a, b, c)) {
                    return a * b * c;
                }
            }
        }

        return 0;
    }

    private static boolean isPythagoreanTriplet(long a, long b, long c) {
        return (a * a) + (b * b) == (c * c);
    }
}
