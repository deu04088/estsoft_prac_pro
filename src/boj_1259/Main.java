package boj_1259;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String s = sc.nextLine();
            if(s.charAt(0) == '0') break;

            StringBuilder sb = new StringBuilder(s);
            StringBuilder rev = new StringBuilder(s).reverse();

            if(sb.toString().equals(rev.toString())) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
