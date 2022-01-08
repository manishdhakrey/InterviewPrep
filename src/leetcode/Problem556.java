package leetcode;

import java.util.*;

public class Problem556 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.print(nextGreaterNumber(n));
        scn.close();
    }

    public static int nextGreaterNumber(int n) {
        char[] number = (n + "").toCharArray();
        int i, j;
        int smallest;
        for (i = number.length - 1; i > 0; i--) {
            if (number[i - 1] < number[i]) {
                break;
            }
            if (i == 0) {
                return -1;
            }
            int x = number[i - 1];
            smallest = i;
            for (j = i + 1; j <= number.length - 1; j++) {
                if (number[j] > x && number[j] <= number[smallest]) {
                    smallest = j;
                }
            }
            char temp = number[i - 1];
            number[i - 1] = number[smallest];
            number[smallest] = temp;
            break;

        }

        Arrays.sort(number, i, number.length);

        int n2 = Integer.parseInt(new String(number));
        return n2;
    }
}
