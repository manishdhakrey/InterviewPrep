package recursion;

import java.util.Scanner;

public class lastIndex {

    public static void main(String args[]) {
        // Your Code Here
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scannerObject.nextInt();
        }
        int m = scannerObject.nextInt();
        lastOccurence(arr, n - 1, m);
        scannerObject.close();
    }

    public static void lastOccurence(int[] arr, int i, int m) {
        if (i < 0) {
            System.out.print("-1");
            return;
        }
        if (m == arr[i]) {
            System.out.print(i);
            return;
        }

        lastOccurence(arr, i - 1, m);
    }

}
