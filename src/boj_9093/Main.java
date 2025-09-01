package boj_9093;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            String[] strs = str.split(" ");
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < strs.length; j++) {
                String rev =  new StringBuilder(strs[j]).reverse().toString();

                sb.append(rev).append(" ");
            }
            System.out.println(sb);
        }
    }
}
