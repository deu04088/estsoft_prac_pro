package prac_ch12;

interface MyFunctionalInterface3 {
    int mathod(int x, int y);
}

public class MyFunctionalInterfaceExample3 {
    public static void main(String[] args) {
        MyFunctionalInterface3 finter3;

        finter3 = (x, y) -> {
            int result = x + y;
            return result;
        };
        System.out.println(finter3.mathod(2, 5));

        finter3 = (x, y) -> {
            return x + y;
        };
        System.out.println(finter3.mathod(2, 5));

        finter3 = (x, y) -> x + y;
        System.out.println(finter3.mathod(2, 5));
    }
}
