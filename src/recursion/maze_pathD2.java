package recursion;

import java.util.Scanner;

public class maze_pathD2 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        scannerObject.close();

        System.out.println(printAllPaths(n - 1, "", 0, 0));
    }

    public static int printAllPaths(int d, String ans, int cr, int cc) {
        if (d == cr && d == cc) {
            System.out.print(ans + " ");
            return 1;
        }
        if (cr > d || cc > d) {
            return 1;
        }
        int count = 0;
        count += printAllPaths(d, ans + "V", cr + 1, cc);
        count += printAllPaths(d, ans + "H", cr, cc + 1);
        if (cr == cc || (cr + cc) == d) {
            count += printAllPaths(d, ans + "D", cr + 1, cc + 1);
        }
        return count;
    }
}
