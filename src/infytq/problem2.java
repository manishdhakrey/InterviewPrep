/*
A string which is a mixture of letters, numbers, and special characters from which produce the largest
even number from the available digit after removing the duplicates digits.
If an even number did not produce then return -1.
Ex: infosys@337
O/p : -1
— — — — — — — — — — — -
Hello#81@21349
O/p : 984312
*/

package infytq;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class problem2 {
    static boolean isDigit(char digit) {
        if (digit >= '0' && digit <= '9') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            if (isDigit(input.charAt(i))) {
                String dig = String.valueOf(input.charAt(i));
                hs.add(Integer.parseInt(dig));
            }
        }
        ArrayList<Integer> digitList = new ArrayList<>(hs);
        Collections.sort(digitList, Collections.reverseOrder());
        int len = digitList.size();
        boolean evenDigitFound = false;
        for (int i = len - 1; i >= 0; i--) {
            int digit = digitList.get(i);
            if (digit % 2 == 0) {
                digitList.remove(i);
                digitList.add(digit); // adding even digit at end
                evenDigitFound = true;
                break;
            }
        }
        if (evenDigitFound == false) {
            System.out.print(-1);
        } else {
            for (int dig : digitList)
                System.out.print(dig); // printing largest even digits
        }
    }
}
