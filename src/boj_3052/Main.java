package boj_3052;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = new String[10];
        int count = 1;

        for(int i = 0; i < 10; i++) {
            int x = sc.nextInt();
            nums[i] = String.valueOf(x%42);
        }

        for(int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i].equals(nums[j])) {
                    break;
                }
                if(nums[9] == nums[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
