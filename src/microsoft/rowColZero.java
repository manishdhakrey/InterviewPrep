package microsoft;

import java.util.*;

public class rowColZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        int[][] arr2 = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                arr2[i][j] = arr[i][j];
            }
        }

        sc.close();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    for (int j2 = 0; j2 < m; j2++) {
                        arr2[i][j2] = 0;
                    }
                    for (int j3 = 0; j3 < n; j3++) {
                        arr2[j3][j] = 0;
                    }
                    break;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
