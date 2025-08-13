package boj_10871;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = sc.nextInt();
        sc.nextLine();
        String num = sc.nextLine();

        String[] nums = num.split(" ");
        StringBuilder result  = new StringBuilder();
        for (int i = 0; i < a; i++) {
            int tmp = Integer.parseInt(nums[i]);
            if(tmp < x) {
                result.append(nums[i]);
                result.append(" ");
            }
        }
        System.out.println(result.toString());
    }
}
