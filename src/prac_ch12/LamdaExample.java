package prac_ch12;

interface Operator {
    int max(int a, int b);
}

interface Operator2 {
    void print(String name, int i);
}

interface Operator3 {
    int square(int x);
}

public class LamdaExample {
    public static void main(String[] args) {
        Operator op;
        Operator2 op2;
        Operator3 op3;

        op = (a, b) -> {
            return a > b ? a : b;
        };

        op2 = (name, age) -> {
            System.out.println(name + "=" + age);
        };

        op3 = (x) -> {
            int result = x*x;
            return result;
        };

        System.out.println(op.max(2, 5));
        op2.print("박주영", 29);
        System.out.println(op3.square(8));
    }
}
