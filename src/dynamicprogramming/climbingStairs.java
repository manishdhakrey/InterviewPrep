package dynamicprogramming;

import java.util.*;

public class climbingStairs {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        sc.close();
        System.out.println(noways(0, n, dp));
        // Print_path(0, n, "");

    }

    public static int noways(int curr, int dis, int[] dp) {
        if (curr == dis) {
            return 1;
        }
        if (curr > dis) {
            return 0;
        }
        if (dp[curr] != -1) {
            return dp[curr];
        }

        // int Steps1 = noways(curr + 1, dis);
        // int Steps2 = noways(curr + 2, dis);
        // int Steps3 = noways(curr + 3, dis);
        int ans = 0;
        for (int step = 1; step <= dis; step++) {
            ans += noways(curr + step, dis, dp);

        }
        return dp[curr] = ans;

    }

    public static void Print_path(int curr, int dis, String ans) {
        if (curr == dis) {
            System.out.println(ans);
            return;
        }
        if (curr > dis) {
            return;
        }

        // int Steps1 = noways(curr + 1, dis);
        // int Steps2 = noways(curr + 2, dis);
        // int Steps3 = noways(curr + 3, dis);

        for (int step = 1; step <= 3; step++) {
            Print_path(curr + step, dis, ans + step);

        }

    }
}
