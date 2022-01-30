package dynamicprogramming;

import java.util.*;

public class valentineMagic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        int[][] dp = new int[m][n];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(ValentineMagic(arr1, arr2, 0, 0, dp));
        sc.close();
    }

    public static int ValentineMagic(int boys[], int girls[], int i, int j, int[][] dp) {

        if (i == boys.length) {
            return 0;
        }
        if (j == girls.length) {
            return 10000000;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int gs = Math.abs(boys[i] - girls[j]) + ValentineMagic(boys, girls, i + 1, j + 1, dp);
        int gr = ValentineMagic(boys, girls, i, j + 1, dp);
        return dp[i][j] = Math.min(gs, gr);

    }
}
