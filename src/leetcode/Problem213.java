package leetcode;

import java.util.Scanner;

/**
 * Problem198-House Robber II
 */
public class Problem213 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }
        scn.close();
        int[] dp = new int[nums.length];
        int[] dp2 = new int[nums.length];
        for (int i = 0; i < n; i++) {
            dp[i] = -1;

        }
        for (int i = 0; i < dp2.length; i++) {
            dp2[i] = -1;
        }

        System.out.print("Maximum amount : " + Math.max(robDpF(nums, 0, dp), robDpS(nums, 1, dp2)));

    }

    public static int robDpF(int[] nums, int i, int[] dp) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (i >= nums.length - 1) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }

        int rob = nums[i] + robDpF(nums, i + 2, dp);
        int dontRob = robDpF(nums, i + 1, dp);

        return dp[i] = Math.max(rob, dontRob);
    }

    public static int robDpS(int[] nums, int i, int[] dp2) {
        if (i >= nums.length) {
            return 0;
        }
        if (dp2[i] != -1) {
            return dp2[i];
        }

        int rob = nums[i] + robDpS(nums, i + 2, dp2);
        int dontRob = robDpS(nums, i + 1, dp2);

        return dp2[i] = Math.max(rob, dontRob);
    }

}
