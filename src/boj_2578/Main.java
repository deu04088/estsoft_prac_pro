package boj_2578;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] bingo = new int[5][5];
        int[] answer = new int[25];

        for (int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                bingo[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 25; i++) {
            answer[i] = sc.nextInt();
        }
    }
}
