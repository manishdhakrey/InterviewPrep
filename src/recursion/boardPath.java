package recursion;

import java.util.Scanner;

public class boardPath {
    public class Main {
        static int count = 0;
        public static void main(String args[]) {
            // Your Code Here
            Scanner scannerObject = new Scanner(System.in);
            int n = scannerObject.nextInt();
            int m = scannerObject.nextInt();
            int[] arr = new int[m];
            for(int i = 0;i<m;i++){
                arr[i] = i+1;
            }
            totalWays(arr, 0, n, "");
            System.out.println();
            System.out.println(count);
        }
    
        public static void totalWays(int[] arr, int amount, int n, String s){
            if(amount > n)
                return;
            if(amount == n){
                count++;
                System.out.print(s+ " ");
                return;
            }
            for(int i = 0; i < arr.length; i++){
                Integer a = arr[i];
                totalWays(arr, amount+arr[i], n, s+a.toString());
            }
        }
}
