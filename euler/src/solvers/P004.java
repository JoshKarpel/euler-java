package solvers;

import java.util.ArrayList;

public class P004 {
    public static long solve() {
        ArrayList<Integer> palindromes = new ArrayList<>();
        for (int a = 100; a <= 999; a++) {
            for (int b = 100; b <= 999; b++) {
                if (Utils.isPalindrome(a * b)) {
                    palindromes.add(a * b);
                }
            }
        }

        palindromes.sort((a, b) -> Integer.compare(b, a));

        return palindromes.get(0);
    }
}
