package microsoft;

import java.util.*;

public class sumWithTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int[] tv = new int[2];
        sc.close();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == (t - arr[i])) {
                    tv[0] = i;
                    tv[1] = j;
                    break;
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            System.out.print(tv[i] + " ");
        }
    }
}
