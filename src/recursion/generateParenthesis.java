package recursion;

import java.util.Scanner;

public class generateParenthesis {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printParenthesis(n, 0, 0, "");
        sc.close();

    }

    public static void printParenthesis(int n, int oc, int cc, String ans) {
        if (oc == n && cc == n) {
            System.out.println(ans);
        }
        if (oc > cc) {
            printParenthesis(n, oc, cc + 1, ans + ')');
        }
        if (oc < n) {
            printParenthesis(n, oc + 1, cc, ans + '(');
        }
    }
}
