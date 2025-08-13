package boj_1110;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value = n;
        int count = 1;

        while(true){
            int a = value/10;
            int b = value%10;
            int tmp = a + b;
            value = b*10 + tmp%10;

            if (n == value) break;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
