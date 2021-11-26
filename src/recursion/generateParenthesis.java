package recursion;

import java.util.Scanner;

public class generateParenthesis {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printParenthesis(n, 0, 0, "");

    }

    public static void printParenthesis(int n,int oc,int cc,String s){
            if(oc ==n && cc ==n){
                System.out.println(s);
            }
            if(oc > cc){
                printParenthesis(n,oc,cc+1,s+')');
            }
            if(oc<n){
                printParenthesis(n,oc+1,cc,s+'(');
            }
        }
