package recursion;

import java.util.Scanner;

public class maze_pathD {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n1 = scannerObject.nextInt();
        int n2 = scannerObject.nextInt();
        scannerObject.close();

        System.out.println(printAllPaths(n1 - 1, n2 - 1, "", 0, 0));
    }

    public static int printAllPaths(int dr, int dc, String ans, int cr, int cc) {
        if (dr == cr && dc == cc) {
            System.out.print(ans + " ");
            return 1;
        }
        if (cr > dr || cc > dc) {
            return 1;
        }
        int count = 0;
        count += printAllPaths(dr, dc, ans + "V", cr + 1, cc);
        count += printAllPaths(dr, dc, ans + "H", cr, cc + 1);
        count += printAllPaths(dr, dc, ans + "D", cr + 1, cc + 1);
        return count;
    }
}
