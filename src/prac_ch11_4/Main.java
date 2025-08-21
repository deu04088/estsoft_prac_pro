package prac_ch11_4;

import java.util.Arrays;

class Util {
    public static <T> void swap (T[] t, int a, int b){
        T temp = t[a];
        t[a] = t[b];
        t[b] = temp;
    }
}

public class Main {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3};
        Util.swap(a, 0, 2);
        System.out.println(Arrays.toString(a));

        String[] b = {"테", "스", "트"};
        Util.swap(b, 1, 2);
        System.out.println(Arrays.toString(b));
    }
}