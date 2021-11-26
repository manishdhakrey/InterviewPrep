package recursion;

import java.util.Scanner;

public class convertStringToInteger {

    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        System.out.println(stringToInt(str, n));
        sc.close();
    }

    public static int stringToInt(String str, int n) {
        if (n == 1) {
            return str.charAt(0) - '0';
        }

        return (10 * stringToInt(str, n - 1) + str.charAt(n - 1) - '0');
    }

}
