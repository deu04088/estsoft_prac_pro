public class Calculator {
    int a;  // 필드 a
    void postfixOperator() {
        this.a++;     // 본인 객체 접근시 this 사용
    }
    Calculator() {}
    Calculator(int a) {
        this.a = ++a;    // this.a는 필드 a, ++a는 매개변수로 입력된 a
    }

    public static void main(String[] args) {
        int a = 5;
        Calculator cal1 = new Calculator();
        Calculator cal2 = new Calculator();
        Calculator cal3 = new Calculator(a);

        cal1.a = 1;
        cal2.a = 15;

        cal1.postfixOperator();     // Before) cal.postfixOperator(cal);
        cal2.postfixOperator();

        System.out.println(cal1.a);
        System.out.println(cal2.a);
        System.out.println(cal3.a);
    }
}