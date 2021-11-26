package recursion;

import java.util.Scanner;

public class asciiSubsequence {

    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = "";
        FindSub(str, res, 0);
        System.out.println();
        System.out.println(count);
        sc.close();
    }

    static int count = 0;

    static void FindSub(String str, String res, int i) {
        // Base Case
        if (i == str.length()) {

            if (res.length() >= 0) {

                System.out.print(res + " ");
                count += 1;
            }
            return;
        }

        char ch = str.charAt(i);
        FindSub(str, res, i + 1);
        FindSub(str, res + ch, i + 1);
        FindSub(str, res + (int) ch, i + 1);
    }

}
