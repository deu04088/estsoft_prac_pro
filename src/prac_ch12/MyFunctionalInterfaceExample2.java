package prac_ch12;

interface MyFunctionalInterface2 {
    void method(int x);
}

public class MyFunctionalInterfaceExample2 {
    public static void main(String[] args) {
        MyFunctionalInterface2 finter2;

        finter2 = (x) -> {
            int result = x * 5;
            System.out.println(result);
        };
        finter2.method(2);

        finter2 = (x) -> {
            System.out.println(x * 5);
        };
        finter2.method(2);

        finter2 = (x) -> System.out.println(x * 5);
        finter2.method(2);
    }
}
