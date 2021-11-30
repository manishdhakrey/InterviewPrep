package recursion;

import java.util.Scanner;

public class towerOfHanoi {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        towerOfHanoii(n, 1, 2, 3);
        scannerObject.close();

    }

    public static void towerOfHanoii(int n, int A, int B, int C) {
        if (n > 0) {
            towerOfHanoii(n - 1, A, C, B);
            System.out.println("Move a Disc From " + A + " to " + C);
            towerOfHanoii(n - 1, B, A, C);
        }
    }
}
