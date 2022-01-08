package leetcode;

import java.util.*;

class Problem169 {
    public static void main(String[] args) {
        int arr[] = new int[] { 10, 20, 20, 10, 10, 20, 5, 20 };
        int n = arr.length;
        countFreq(arr, n);
    }

    public static void countFreq(int arr[], int n) {
        boolean visited[] = new boolean[n];

        Arrays.fill(visited, false);

        // Traverse through array elements and
        // count frequencies
        for (int i = 0; i < n; i++) {

            // Skip this element if already processed
            if (visited[i] == true)
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            int[] countArr = new int[visited.length];
            for (int j = 0; j < visited.length; j++) {
                countArr[i] = count;
            }
            int freq = 0;
            for (int k = 0; k < visited.length - 1; k++) {
                freq = Math.max(countArr[k], countArr[k + 1]);
            }
            System.out.println(freq);
        }

    }

}