package stack;

import java.util.*;

public class histogram {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(Area(arr));

    }

    public static int Area(int[] arr) {

        Stack<Integer> st = new Stack<>();
        int maxarea = 0;
        for (int i = 0; i < arr.length;) {
            if (st.isEmpty() || arr[i] > arr[st.peek()]) {
                st.push(i);
                i++;
            }

            else {
                int r = i;
                int h = arr[st.pop()];
                if (st.isEmpty()) {
                    int pa = h * r;
                    maxarea = Math.max(maxarea, pa);
                } else {
                    int l = st.peek();
                    int pa = h * (r - l - 1);
                    maxarea = Math.max(maxarea, pa);
                }

            }

        }

        int r = arr.length;
        while (!st.isEmpty()) {
            int h = arr[st.pop()];
            if (st.isEmpty()) {
                int pa = h * r;
                maxarea = Math.max(maxarea, pa);
            } else {
                int l = st.peek();
                int pa = h * (r - l - 1);
                maxarea = Math.max(maxarea, pa);
            }
        }
        return maxarea;

    }
}
