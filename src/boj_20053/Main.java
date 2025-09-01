package boj_20053;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            int n  = sc.nextInt();

            int min = 1000000;
            int max = -1000000;

            for (int j = 0; j < n; j++) {
                int num = sc.nextInt();
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }
            sb.append(min).append(" ").append(max).append("\n");
        }
        System.out.print(sb);
    }
}
