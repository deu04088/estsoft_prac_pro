package boj_10815;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> nums = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int m = sc.nextInt();
            nums.add(m);
        }
        int a = sc.nextInt();
        for(int i = 0; i < a; i++){
            int b = sc.nextInt();
            if(nums.contains(b)) {
                result.add(1);
            }
            else {
                result.add(0);
            }
        }
        for(Integer num: result){
            System.out.print(num + " ");
        }
    }
}
