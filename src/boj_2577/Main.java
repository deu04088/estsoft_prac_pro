package boj_2577;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        sc.nextLine();
        int B = sc.nextInt();
        sc.nextLine();
        int C = sc.nextInt();

        int result = A*B*C;
        String nums = String.valueOf(result);

        for (int i = 0; i < 10; i++) {
            int count = 0;
            for  (int j = 0; j < nums.length(); j++) {
                if (nums.charAt(j) == (char)('0' + i)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
