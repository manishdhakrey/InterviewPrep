package leetcode;

import java.util.Scanner;

/**
 * Problem198-House Robber
 */
public class Problem198 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }
        scn.close();
        int[] dp = new int[nums.length];
        for (int i = 0; i < n; i++) {
            dp[i] = -1;
        }

        System.out.print("Maximum amount : " + robDp(nums, 0, dp));

    }

    public static int robDp(int[] nums, int i, int[] dp) {
        if (i >= nums.length) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }

        int rob = nums[i] + robDp(nums, i + 2, dp);
        int dontRob = robDp(nums, i + 1, dp);

        return dp[i] = Math.max(rob, dontRob);
    }

}