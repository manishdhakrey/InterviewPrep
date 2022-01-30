package dynamicprogramming;

import java.util.*;

public class expressNAsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] dp = new long[n + 1][n + 1];
        for (long[] a : dp) {
            Arrays.fill(a, -1);
        }
        sc.close();
        System.out.print(nOfWays(n, n, dp));
    }

    static long count = 0;

    public static long nOfWays(int n, int r, long[][] dp) {

        if (r < 0) {
            return 0;
        }

        if (r == 0) {
            count++;
            dp[n][r] = count;
        }
        if (dp[n][r] != -1) {
            return dp[n][r];
        }

        // 1 step
        nOfWays(n, r - 1, dp);
        // 3 step
        nOfWays(n, r - 3, dp);
        // 4 step
        nOfWays(n, r - 4, dp);

        return count;
    }
}
