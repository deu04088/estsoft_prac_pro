package boj_28278;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> numbers = new Stack<>();
        for (int i = 0; i < n; i++) {
            int command = sc.nextInt();
            switch(command) {
                case 1:
                    int num = sc.nextInt();
                    numbers.push(num);
                    break;
                case 2:
                    if(numbers.empty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(numbers.pop());
                    }
                    break;
                case 3:
                    System.out.println(numbers.size());
                    break;
                case 4:
                    if(numbers.empty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case 5:
                    if(numbers.empty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(numbers.peek());
                    }
                    break;
            }
        }
    }
}
