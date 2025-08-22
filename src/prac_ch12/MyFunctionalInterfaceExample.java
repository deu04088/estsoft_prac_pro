package prac_ch12;

interface MyFunctionalInterface {
    void method();
}

public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface finter;

        finter = () -> {
            String str = "method call 1";
            System.out.println(str);
        };
        finter.method();

        finter = () -> {
            System.out.println("method call 2");
        };
        finter.method();

        finter = () -> {
            System.out.println("method call 3");
        };
        finter.method();
    }
}
