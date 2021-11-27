package recursion;

import java.util.Scanner;

public class smartKeypad {
    public static void main(String args[]) {
        String[] table = { " ", ".+@$", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n / 10;
        int b = n % 10;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println(table[a].charAt(i) + table[b].charAt(j));
            }
        }
        sc.close();
    }
}
