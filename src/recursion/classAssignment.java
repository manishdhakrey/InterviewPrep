package recursion;

import java.util.Scanner;

public class classAssignment {
    public class Main {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                System.out.println("#" + (i + 1) + " : " + distinctNumber(n, ""));
            }
        }

        public static int distinctNumber(int n, String ans) {
            if (ans.length() == n)
                return 1;
            int count = 0;
            count = count + distinctNumber(n, ans + 'a');
            if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'b') {
                count = count + distinctNumber(n, ans + 'b');
            }
            return count;
        }
    }
}
