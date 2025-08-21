package prac_ch11_5;

import java.util.Arrays;

class Util{
    public static <T> void reverse(T[] t){
        int start = 0;
        int end = t.length-1;
        while(start < end) {
            T temp = t[start];
            t[start] = t[end];
            t[end] = temp;
            start++;
            end--;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String[] s = {"a", "b", "c", "d"};
        Util.reverse(s);
        System.out.println(Arrays.toString(s));

        Integer[] a = {1, 3, 5, 7};
        Util.reverse(a);
        System.out.println(Arrays.toString(a));
    }
}