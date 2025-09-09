package boj_2869;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();
        int day;
//        int total = 0;
//        int cnt = 1;

//        while (true) {
//            if(total + A >= V)
//                break;
//            else {
//                total = A - B + total;
//                cnt ++;
//            }
//        }
        day = (int)Math.ceil((double)(V - B) / (A - B));
        System.out.println(day);
    }
}
