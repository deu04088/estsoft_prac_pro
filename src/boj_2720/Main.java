package boj_2720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int quarter = 0;
        int dime = 0;
        int nickel = 0;
        int penny = 0;
        int tmp = 0;

        for (int i = 0; i < n; i++) {
            int money = sc.nextInt();
            if (money >= 25) {
                quarter = money / 25;
                dime = money % 25 / 10;
                nickel = money % 25 % 10 / 5;
                penny = money % 25 % 10 % 5;
            }
            else if (money >= 10) {
                dime = money / 10;
                nickel = money % 10 / 5;
                penny = money % 10 % 5;
            }
            else if (money >= 5) {
                nickel = money / 5;
                penny = money % 5;
            }
            else {
                penny = money;
            }
            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
    }
}
