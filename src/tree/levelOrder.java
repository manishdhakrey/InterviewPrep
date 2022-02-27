package tree;

import java.util.*;

public class levelOrder {
    public class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            // TODO Auto-generated constructor stub
            this.data = data;
        }

        public Node() {
            // TODO Auto-generated constructor stub
        }
    }

    Scanner sc = new Scanner(System.in);
    private Node root;

    public void levelorder_Linewise() {

        Queue<Node> qq = new LinkedList<>();
        Queue<Node> helper = new LinkedList<>();

        qq.add(this.root);
        while (qq.isEmpty() == false) {

            Node rv = qq.remove();
            System.out.print(rv.data + " ");
            if (rv.left != null) {
                helper.add(rv.left);
            }
            if (rv.right != null) {
                helper.add(rv.right);

            }

            if (qq.isEmpty()) {
                qq = helper;
                helper = new LinkedList<>();
                System.out.println();
            }

        }

    }

    public static void main(String[] args) {
        levelOrder lo = new levelOrder();
        lo.levelorder_Linewise();
    }
}
