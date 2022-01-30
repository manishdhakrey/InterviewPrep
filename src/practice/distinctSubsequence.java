package practice;

public class distinctSubsequence {
    public static void main(String[] args) {
        String s = "babgbag";
        String t = "bag";
        System.out.println(noOfWays(s, t, 0, 0));
    }

    public static int noOfWays(String s, String t, int m, int n) {
        if (n == t.length()) {
            return 1;
        }
        if (m == s.length()) {
            return 0;
        }
        int inc = 0;
        int exc = 0;
        if (s.charAt(m) == t.charAt(n)) {
            inc += noOfWays(s, t, m + 1, n + 1);
        }
        exc += noOfWays(s, t, m + 1, n);
        return inc + exc;
    }
}
