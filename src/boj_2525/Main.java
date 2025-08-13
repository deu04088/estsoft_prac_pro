package boj_2525;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.nextLine();
        int C = sc.nextInt();
        int result_hour = 0;
        int result_minute = 0;

        if(B+C >= 60) {
            if(A+((B+C)/60) >= 24) {
                result_hour = A+((B+C)/60) - 24;
                result_minute = (B+C)%60;
            }
            else {
                result_hour = A+((B+C)/60);
                result_minute = (B+C)%60;
            }
        }
        else {
            result_hour = A;
            result_minute = B + C;
        }
        System.out.println(result_hour + " " + result_minute);
        sc.close();
    }
}
