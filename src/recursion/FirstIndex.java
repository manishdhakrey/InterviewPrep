package recursion;

import java.util.Scanner;

public class FirstIndex {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scannerObject.nextInt();
        }
        int m = scannerObject.nextInt();
        firstIndex(arr, 0, m);
        scannerObject.close();
    }

    public static void firstIndex(int[] arr, int i, int m) {
        if (i > arr.length - 1) {
            System.out.print("-1");
            return;
        }
        if (m == arr[i]) {
            System.out.print(i);
            return;
        }

        firstIndex(arr, i + 1, m);
    }
}
