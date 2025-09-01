package boj_9012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < t; i++) {
            String str = sc.nextLine();

            int cnt = 0;

            for(int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);

                if(c == '(') {cnt++;}
                else {
                    cnt--;
                    if(cnt < 0) break;
                }
            }

            if(cnt < 0) {
                System.out.println("NO");
            }
            else if(cnt == 0) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
