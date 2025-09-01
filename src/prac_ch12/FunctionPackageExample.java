package prac_ch12;

import java.util.function.*;

public class FunctionPackageExample {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Runnable 인터페이스 test");
        r.run();

        Supplier<String> s = () -> "Supplier 인터페이스 test";
        System.out.println(s.get());

        Consumer<String> c = (test) -> System.out.println("Consumer 인터페이스 test");
        c.accept("test");

        Function<Integer, String> f = a ->String.valueOf(a);
        System.out.println(f.apply(5).getClass().getSimpleName());

        Predicate<String> isEmptyStr = str -> str.length() == 0;
        if(isEmptyStr.test("")){
            System.out.println("empty");
        }
    }
}
