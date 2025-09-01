package boj_1316;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int cnt = 0;

        for(int i =0; i < n; i++){
            String str = sc.nextLine();
            char[] c = str.toCharArray();

            for(int j = 0; j < c.length-1; j++){
                if (c[j] != c[j+1]){
                    char compare = c[j];
//                    if()
                }
            }
        }
    }
}
