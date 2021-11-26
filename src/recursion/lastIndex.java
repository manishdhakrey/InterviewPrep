package recursion;

import java.util.Scanner;

public class lastIndex {
    public class Main {
        public static void main(String args[]) {
            // Your Code Here
            Scanner scannerObject = new Scanner(System.in);
            int n = scannerObject.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = scannerObject.nextInt();
            }
            int m = scannerObject.nextInt();
            lastIndex(arr,n-1,m);
        }
        public static void lastIndex(int[] arr, int i,int m){
            if(i <0){
                System.out.print("-1");
                return;
            }
            if(m == arr[i]){
                System.out.print(i);
                return;
            }
            
            lastIndex(arr,i-1,m);
        }
}
