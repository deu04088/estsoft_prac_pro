package boj_14916;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] answer = {-1, -1};
        int n = sc.nextInt();

        if(n%5==0){
            System.out.println(n/5);
        }
        else{
            int i = 0;
            while(true) {
                if(n-(i*5) < 0) break;

                if((n-(i*5))%2==0){
                    answer[0] = i;
                    answer[1] = (n-(5*i))/2;
                }
                i++;
            }
            if (answer[0] == -1 && answer[1] == -1) System.out.println("-1");
            else System.out.println(answer[0] + answer[1]);
        }
    }
}
