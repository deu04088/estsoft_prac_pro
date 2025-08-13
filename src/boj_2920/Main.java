package boj_2920;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder tmp = new StringBuilder();
        String[] scale = new String[8];

        for(int i = 0; i < 8; i++) {
            scale[i] = sc.next();
        }
        for(int j = 0; j < 8; j++) {
            tmp.append(scale[j]);
        }

        String ascending = "12345678";
        String descending = "87654321";

        if(tmp.toString().equals(ascending)) {
            System.out.println("ascending");
        }
        else if(tmp.toString().equals(descending)) {
            System.out.println("descending");
        }
        else {
            System.out.println("mixed");
        }
    }
}
