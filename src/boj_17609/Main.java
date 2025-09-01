package boj_17609;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            boolean check = false;
            String str1 = sc.nextLine();
            String rev1 = new StringBuilder(str1).reverse().toString();

            if(str1.equals(rev1)){
                System.out.println(0);
                continue;
            }
            else{
                for(int j = 0; j < str1.length(); j++) {
                    String str2 = str1.substring(0,j) + str1.substring(j+1);
                    String rev2 = new StringBuilder(str2).reverse().toString();

                    if(str2.equals(rev2)){
                        System.out.println(1);
                        check = true;
                        break;
                    }
                }
            }
            if(check == false){
                System.out.println(2);
            }
        }
    }
}
