package solvers;

import java.util.ArrayList;
import java.util.Comparator;
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

    public static boolean isPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }

    public static boolean isPalindrome(long n) {
        return isPalindrome(Long.toString(n));
    }

    public static boolean isPalindrome(int n) {
        return isPalindrome(Integer.toString(n));
    }

    public static List<Long> fullFactorization(long n) {
        ArrayList<Long> factors = new ArrayList<>();

        long limit = ((long) Math.sqrt((double) n)) + 1;
        for (long f = 1; f < limit; f++) {
            if (n % f == 0) {
                factors.add(f);
                factors.add(n / f);
            }
        }

        factors.sort(Comparator.comparingLong(a -> a));
        return factors;
    }

    public static List<Long> properFactorization(long n) {
        List<Long> factors = fullFactorization(n);
        factors.remove(factors.size() - 1);
        return factors;
    }

    public static long triangleNumber(long n) {
        return n * (n + 1) / 2;
    }
}
