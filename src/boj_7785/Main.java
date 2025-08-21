package boj_7785;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, String> member = new HashMap<>();
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            String str = sc.nextLine();
            String [] strs = str.split(" ");
            member.put(strs[0], strs[1]);
        }
        if (member.containsValue("leave")){

        }
    }
}
