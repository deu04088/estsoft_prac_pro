package prac_ch11_3;

class Holder<T> {
    private T t;

    public void set(T t){
        this.t = t;
    }
    public T getOrDefault(T t){
        if (this.t == null){
            return t;
        }
        else{
            return this.t;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Holder<String> h = new Holder<>();
        System.out.println(h.getOrDefault("empty"));
        h.set("Hello");
        System.out.println(h.getOrDefault("empty"));
    }
}
