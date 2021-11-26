package recursion;

import java.util.Scanner;

public class nthTriangle {

    public static void main(String args[]) {
        // Your Code Here
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        System.out.println(nthTraingle(n));
        scannerObject.close();
    }

    public static int nthTraingle(int n) {
        int x = n;
        if (n == 1) {
            return 1;
        }
        x = x + nthTraingle(n - 1);
        return x;
    }

}