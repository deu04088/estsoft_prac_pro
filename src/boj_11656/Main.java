package boj_11656;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] result = new String[str.length()];

        for(int i = 0; i < result.length; i++) {
            result[i] = str.substring(i,str.length());
        }
        Arrays.sort(result);

        for(String s : result)  {
            System.out.println(s);
        }

    }
}
