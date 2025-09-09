package boj_1193;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1,  b = 1;

        for(int i = 1; i <= n; i++) {
            if(i == n) {
                System.out.println(a +"/"+ b);
            }

            if(a == b) {
                b++;
            }
            else {

            }
        }
    }
}
