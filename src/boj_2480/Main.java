package boj_2480;

import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = 0;

        if(a==b && a==c && b==c){
            result = a*1000 + 10000;
        }
        else if(a==b && a!=c){
            result = a*100 + 1000;
        }
        else if(b==c && b!=a){
            result = b*100 + 1000;
        }
        else if(a==c && b!=a){
            result = c*100 + 1000;
        }
        else {
            int big = a;
            if(b>big) big = b;
            if(c>big) big = c;

            result = big*100;
        }

        System.out.println(result);
    }
}
