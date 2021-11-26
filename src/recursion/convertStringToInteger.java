package recursion;

import java.util.Scanner;

public class convertStringToInteger {

    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(stringToInt(s));

    }

    public static int stringToInt(String str) {
        if (str.length() == 1)
            return (str.charAt(0) - '0');

        double y = stringToInt(str.substring(1));
        double x = str.charAt(0) - '0';

        x = x * Math.pow(10, str.length() - 1) + y;
        return (int) (x);
    }

}
