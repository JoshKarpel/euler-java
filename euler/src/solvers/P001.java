package solvers;

public class P001 {
    public static long solve() {
        long acc = 0;

        for (long x = 0; x < 1000; x++) {
            if (x % 3 == 0 || x % 5 == 0) {
                acc += x;
            }
        }

        return acc;
    }
}
