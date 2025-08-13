package boj_1546;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] score = new String[n];
        double big = 0;
        double sum = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            score[i] = String.valueOf(num);
            if (big < num) big = num;

        }
        for (int j = 0; j < n; j++) {
            sum += Double.parseDouble(score[j])/big*100;
        }
        System.out.println(sum/n);
    }
}
