package solvers;

public class P012 {
    public static long solve() {
        long n = 0;

        while (true) {
            n++;
            long triangle = Utils.triangleNumber(n);
            if (Utils.fullFactorization(triangle).size() > 500) {
                return triangle;
            }
        }
    }
}
