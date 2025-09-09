package boj_2563;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] w_paper = new boolean[100][100];
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int j = x; j < x+10; j++) {
                for(int k = y; k < y+10; k++) {
                    if(w_paper[j][k] == true) {count++;}
                    w_paper[j][k] = true;
                }
            }
        }
        System.out.println(10*10*n-count);
    }
}
