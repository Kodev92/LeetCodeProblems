package leetcodeDP;

import java.util.ArrayList;
import java.util.Arrays;

public class _1137_NthTribonacciNumber {

    int[] tribo = new int[40];

    public int tribonacci(int n) {
        Arrays.setAll(tribo, v ->
                v > 2 ? -1 : v == 0 ? 0 : 1);
        return helper(n);
    }

    public int helper(int n){
        if (tribo[n] == -1) tribo[n] = helper(n - 1) + helper(n - 2) + helper(n - 3);
        return tribo[n];
    }

}
// Crazy cool solution
//    Time O(N)
//    Space O(1)

//    public int tribonacci(int n) {
//        if (n < 2) return n;
//        int a = 0, b = 1, c = 1, d;
//        while (n-- > 2) {
//            d = a + b + c;
//            a = b;
//            b = c;
//            c = d;
//        }
//        return c;
//    }
