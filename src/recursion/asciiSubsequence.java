package recursion;

import java.util.Scanner;

public class asciiSubsequence {

    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = "";

        printSequences(str, res);
        System.out.println();
        System.out.print(count);
        sc.close();
    }

    static int count = 0;

    public static void printSequences(String str, String res) {
        if (str.length() == 0) {
            System.out.print(res + " ");
            count += 1;
            return;
        }

        char ch = str.charAt(0);
        printSequences(str.substring(1), res);
        printSequences(str.substring(1), res + ch);
        printSequences(str.substring(1), res + (int) ch);
    }

}
