package boj_2884;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if((m - 45) < 0) {
            if((h-1) < 0) System.out.printf("%d %d\n", 23, m+15);
            else System.out.printf("%d %d\n", h-1, m+15);
        }
        else {
            System.out.printf("%d %d\n", h, m-45);
        }
        sc.close();
    }
}
