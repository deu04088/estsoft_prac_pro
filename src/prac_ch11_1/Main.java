package prac_ch11_1;

class Box<T>  {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}

public class Main {
    public static void main(String[] args) {
        Box<String> s = new Box<>();
        s.set("Hello");
        Box<Integer> i = new Box<>();
        i.set(123);

        System.out.println(s.get());
        System.out.println(i.get());
    }
}
