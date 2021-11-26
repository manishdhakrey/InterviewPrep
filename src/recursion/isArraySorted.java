package recursion;

import java.util.Scanner;

public class isArraySorted {

    public static void main(String args[]) {
        // Your Code Here
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scannerObject.nextInt();
        }
        boolean res = isArraySorted(arr, n);
        System.out.println(res);
    }

    public static boolean isArraySorted(int[] arr, int n) {
        if (n == 1 || n == 0) {
            return true;
        }
        if (arr[n - 1] < arr[n - 2]) {
            return false;
        }
        return isArraySorted(arr, n - 1);
    }

}
