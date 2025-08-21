package boj_2750;

import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new TreeSet<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            set.add(num);
        }
        for(int num: set) {
            System.out.println(num);
        }
    }
}
