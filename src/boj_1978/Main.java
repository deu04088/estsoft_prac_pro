package boj_1978;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for(int i = 0; i < n; i++){
            boolean flag = true;
            int num = sc.nextInt();
            if (num < 2) continue;

            for(int j = 2; j < num; j++){
                if(num%j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
