package boj_2903;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 2;

        for(int i=1;i<=n;i++){
            m = m-1 + m;
        }
        System.out.println(m*m);
    }
}
