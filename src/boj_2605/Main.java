package boj_2605;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int j = sc.nextInt();
            numbers.add(numbers.size() - j, i);
        }

        for(int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
