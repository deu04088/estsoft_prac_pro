package boj_1427;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();

        String result = "";

        for (char c = '9'; c >= '0'; c--) {
            for (int i = 0; i < num.length(); i++) {
                if (num.charAt(i) == c) {
                    result += c;
                }
            }
        }
        System.out.println(result);
    }
}
