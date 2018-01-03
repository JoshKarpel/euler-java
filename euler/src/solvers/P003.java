package solvers;

import java.util.List;

public class P003 {
    public static long solve() {
        List<Long> factors = Utils.primeFactorization(600_851_475_143L);

        return factors.get(factors.size() - 1);
    }
}
