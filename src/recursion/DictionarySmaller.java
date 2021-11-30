package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DictionarySmaller {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String str = scannerObject.nextLine();
        String strCopy = new String(str);
        char[] temp = str.toCharArray();
        Arrays.sort(temp);
        str = new String(temp);
        List<String> list = new ArrayList<>();
        findAllPermutations(str, list, "");
        int idx = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(strCopy) == 0) {
                idx = i;
                break;
            }
        }
        for (int i = 0; i < idx; i++) {
            System.out.println(list.get(i));
        }
        scannerObject.close();
    }

    public static void findAllPermutations(String ques, List<String> list, String ans) {
        if (ques.length() == 0) {
            list.add(ans);
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char charAti = ques.charAt(i);
            findAllPermutations(ques.substring(0, i) + ques.substring(i + 1), list, ans + charAti);
        }
    }
}
