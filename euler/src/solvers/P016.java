package solvers;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.IntStream;

public class P016 {
    public static long solve() {
        BigInteger num = new BigInteger("2").pow(1000);

        IntStream digits = Arrays.stream(String.valueOf(num).split("")).mapToInt(Integer::parseInt);

        return digits.sum();
    }
}
