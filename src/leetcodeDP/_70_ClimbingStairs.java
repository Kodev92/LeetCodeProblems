package leetcodeDP;

public class _70_ClimbingStairs {
    public int climbStairs(int n) {
        if (n < 3) return n;

        int[] c = new int[50];
        c[1] = 1;
        c[2] = 2;

        for (int i = 3; i <= n; i++) c[i] = c[i - 1] + c[i -2];
        return c[n];
    }


}
