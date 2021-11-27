package recursion;

import java.util.Scanner;

public class classAssignment {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println("#" + (i + 1) + " : " + solve(n, "", false));
        }
        sc.close();
    }

    public static int solve(int n, String ans, boolean isPB) {
        if (ans.length() == n) {
            return 1;
        }
        if (ans.length() > n) {
            return 0;
        }
        int count = 0;
        count += solve(n, ans + "a", false);
        if (!isPB) {
            count += solve(n, ans + "b", true);
        }
        return count;
    }

}
