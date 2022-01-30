package stack;

import java.util.*;

public class reverseStack {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            st.push(sc.nextInt());
        }
        sc.close();

        reverse(st);
        System.out.println(st);

    }

    public static void reverse(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }

        int item = st.pop();
        reverse(st);
        insertbottom(st, item);

    }

    private static void insertbottom(Stack<Integer> st, int item) {
        // TODO Auto-generated method stub
        if (st.isEmpty()) {
            st.push(item);
            return;
        }
        int i = st.pop();
        insertbottom(st, item);
        st.push(i);

    }
}
