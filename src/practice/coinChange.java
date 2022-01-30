
package practice;

import java.util.Arrays;

public class coinChange {
    public static void main(String[] args) {
        int[] coin = { 2, 5, 3, 6 };
        int amount = 10;
        int[][] dp = new int[amount + 1][4];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
        System.out.print(noOfWays(coin, amount, 0, dp));
    }

    public static int noOfWays(int[] coin, int amount, int i, int[][] dp) {
        if (amount == 0) {
            return 1;
        }
        if (i == coin.length) {
            return 0;
        }
        if (dp[amount][i] != -1) {
            return dp[amount][i];
        }
        int inc = 0;
        int exc = 0;
        if (amount >= coin[i]) {
            inc += noOfWays(coin, amount - coin[i], i, dp);
        }
        exc += noOfWays(coin, amount, i + 1, dp);
        return dp[amount][i] = inc + exc;
    }
}
