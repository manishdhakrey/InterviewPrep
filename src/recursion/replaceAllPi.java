package recursion;

import java.util.Scanner;

public class replaceAllPi {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        for (int i = 0; i < n + 1; i++) {
            String str = scannerObject.nextLine();
            System.out.println(replaceAllPis(str));
        }
        scannerObject.close();
    }

    public static String replaceAllPis(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return str;
        }
        if (str.charAt(0) == 'p' && str.charAt(1) == 'i') {
            return "3.14" + replaceAllPis(str.substring(2));
        } else {
            return str.charAt(0) + replaceAllPis(str.substring(1));
        }
    }
}
