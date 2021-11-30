package recursion;

import java.util.Scanner;

public class moveAllXToEnd {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String str = scannerObject.nextLine();
        System.out.println(moveXToEnd(str));
        scannerObject.close();
    }

    public static String moveXToEnd(String str) {
        if (str.length() == 0) {
            return str;
        }
        if (str.charAt(0) == 'x') {
            return moveXToEnd(str.substring(1)) + 'x';
        } else {
            return str.charAt(0) + moveXToEnd(str.substring(1));
        }

    }
}
