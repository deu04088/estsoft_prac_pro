package boj_8958;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            int score = 0;
            int result = 0;

            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == 'O'){
                    score++;
                    result += score;
                }
                else {
                    score = 0;
                }
            }
            System.out.println(result);
        }
        sc.close();
    }
}
