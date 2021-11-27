package recursion;

import java.util.Scanner;

public class boardPath {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int m = scannerObject.nextInt();
        int ans = totalWays(m, n, 0, "");
        System.out.println();
        System.out.println(ans);
        scannerObject.close();
    }

    public static int totalWays(int m, int n, int curr, String ans) {

        if (curr == n) {
            System.out.print(ans + " ");
            return 1;
        }
        if (curr > n) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i <= m; i++) {
            count += totalWays(m, n, curr + i, ans + i);
        }
        return count;
    }
}
