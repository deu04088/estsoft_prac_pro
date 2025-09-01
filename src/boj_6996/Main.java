package boj_6996;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            String str1 = sc.next();
            String str2 = sc.next();

            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(Arrays.equals(arr1, arr2)){
                System.out.printf("%s & %s are anagrams.\n", str1, str2);
            }
            else{
                System.out.printf("%s & %s are NOT anagrams.\n", str1, str2);
            }
        }
    }
}
