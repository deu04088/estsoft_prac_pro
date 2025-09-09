package boj_2581;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        sc.nextLine();
        int n = sc.nextInt();
        int sum = 0, min = n;

        for(int i = m; i <= n; i++){
            boolean flag = true;
            if(i == 1) continue;

            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag == true) {
                sum += i;
                if(min > i) min = i;
            }
        }
        if(sum == 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
