package recursion;

import java.util.Scanner;

public class reverseAnArray {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scannerObject.nextInt();
        }
        reverseArray(arr, 0);
        scannerObject.close();
    }

    public static void reverseArray(int[] arr, int i) {
        if (i > arr.length - 1) {
            return;
        }
        reverseArray(arr, i + 1);
        System.out.print(arr[i] + " ");
    }
}
