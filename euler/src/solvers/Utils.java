package solvers;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static List<Long> primeFactorization(long n) {
        long test = 2;
        ArrayList<Long> factors = new ArrayList<>();

        if (n < 2) {
            return factors;
        }

        while (test == 2) {
            if (n % test == 0) {
                n /= test;
                factors.add(test);
            } else {
                test += 1;
            }
        }

        while (n != 1) {
            if (n % test == 0) {
                n /= test;
                factors.add(test);
            } else {
                test += 2;
            }
        }

        return factors;
    }
}
