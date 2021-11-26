package recursion;

import java.util.Scanner;

public class allIndices {
    public class Main {
        public static void main(String args[]) {
            // Your Code Here
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int m = sc.nextInt();
            containM(arr, m, 0);
        }

        public static void containM(int[] arr, int m, int i) {
            if (i == arr.length) {
                return;
            }
            if (arr[i] == m) {
                System.out.print(i + " ");
            }
            containM(arr, m, i + 1);
        }
    }
}
