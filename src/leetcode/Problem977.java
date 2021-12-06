
// Sorting of Squared numbers of Integers.

package leetcode;

import java.util.Scanner;

public class Problem977 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        int left = 0;
        int right = arr.length - 1;
        int pointer = arr.length - 1;
        int[] result = new int[arr.length];

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                result[pointer] = arr[left] * arr[left];
                left++;
            } else {
                result[pointer] = arr[right] * arr[right];
                right--;
            }
            pointer--;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
