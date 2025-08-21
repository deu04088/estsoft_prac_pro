package prac_ch11_2;

class Pair<T, M> {
    private T first;
    private M second;

    public Pair(T a, M b) {
        this.first = a;
        this.second = b;
    }

    public T getFirst() {
        return first;
    }
    public M getSecond() {
        return second;
    }

    public void setFirst(T first) {     // 사용되지는 않음
        this.first = first;
    }
    public void setSecond(M second) {
        this.second = second;
    }
}

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> p = new Pair<>("age", 30);
        System.out.println(p.getFirst() + ": " + p.getSecond());
        p.setSecond(31);
        System.out.println(p.getFirst() + ": " + p.getSecond());

        Pair<Double, Float> p2 = new Pair<>(5.0, 5.0f);
        System.out.println(p2.getFirst() + ": " + p2.getSecond());
    }
}