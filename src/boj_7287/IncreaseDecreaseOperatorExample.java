package boj_7287;

public class IncreaseDecreaseOperatorExample {
    public static void main(TestString[] args) {
        int x = 10;
        int y = 20;
        int z;

        System.out.println("----------------------");
        x++;
        ++x;
        System.out.println("x=" + x);

        System.out.println("----------------------");
        y--;
        --y;
        System.out.println("y=" + y);

        System.out.println("----------------------");
        z = x++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);

        System.out.println("----------------------");
        z = ++x;
        System.out.println("z=" + z);
        System.out.println("x=" + x);

        System.out.println("----------------------");
        z = ++x + y++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}
