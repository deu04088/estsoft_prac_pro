package boj_2908;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        String rev1 = new StringBuilder(str1).reverse().toString();
        String rev2 = new StringBuilder(str2).reverse().toString();

        int result1 = Integer.parseInt(rev1);
        int result2 = Integer.parseInt(rev2);

        if(result1 > result2) System.out.println(result1);
        else System.out.println(result2);
    }
}
