package boj_10869;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if(score >= 90) {
            System.out.println("등급은 A입니다");
        }
        else if(score >= 80) {
            System.out.println("등급은 B입니다");
        }
        else if(score >= 70) {
            System.out.println("등급은 C입니다");
        }
        else {
            System.out.println("등급은 D입니다");
        }
    }
}
