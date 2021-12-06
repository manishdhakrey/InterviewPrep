
//Rotate array k times.

package leetcode;

import java.util.Scanner;

class Problem189 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] result = new int[n];
        scn.close();
        int a = n - k - 1;
        while (a < n - 1) {
            for (int i = 0; i < arr.length - k; i++) {
                result[a] = arr[i];
                a++;
            }
        }
        int b = n - k;
        for (int i = 0; i < k; i++) {
            result[i] = arr[b];
            b++;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
// Using Recursion

/*
 * class Problem189 {
 * public void rotate(int[] nums, int k) {
 * k = k % nums.length;
 * reverse(nums, 0, nums.length-1);
 * reverse(nums, 0, k-1);
 * reverse(nums, k, nums.length-1);
 * }
 * 
 * static void reverse(int [] nums, int start, int end){
 * // reversing the Array Using two pointer Method
 * while(start < end){
 * int temp = nums[start];
 * nums[start] = nums[end];
 * nums[end] = temp;
 * start++;
 * end--;
 * }
 * }
 * }
 */