package boj_11720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int n = sc.nextInt();
        String nums = sc.next();

        for(int i = 0; i < n ; i++){
            char tmp = nums.charAt(i);
            sum += Integer.parseInt(String.valueOf(tmp));
        }
        System.out.println(sum);
        sc.close();
    }
}
