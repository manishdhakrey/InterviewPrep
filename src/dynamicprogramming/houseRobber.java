package dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class houseRobber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        Arrays.fill(dp, -1);
        System.out.print(maximumRobbery(arr, n, 0, dp));
    }

    public static int maximumRobbery(int[] arr, int n, int i, int[] dp) {
        if (i >= n - 1) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        // rob
        int rob = arr[i] + maximumRobbery(arr, n, i + 2, dp);
        // dont rob
        int drob = maximumRobbery(arr, n, i + 1, dp);

        return dp[i] = Math.max(rob, drob);
    }
}
