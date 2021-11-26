package recursion;

import java.util.Scanner;

public class Subsequence {
    public class Main {
        public static void main(String args[]) {
            // Your Code Here
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            String res = "";
    
            printSequences(str,res,0);
            System.out.println();
            System.out.print(count);
        }
        static int count = 0;
        public static void printSequences(String str, String res ,int i){
            if(i == str.length()){
                if(res.length() >= 0){
                    System.out.print(res+" ");
                    count+=1;
                }
                return;
            }
            char ch = str.charAt(i);
            printSequences(str, res , i+1);
            printSequences(str, res + ch ,i+1);
    
        }
}