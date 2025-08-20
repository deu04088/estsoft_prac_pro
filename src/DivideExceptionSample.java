public class DivideExceptionSample {
    public static void main(String[] args) {
        int result;
        try {
            result = 5/0;
        } catch (ArithmeticException e) {
            result = -1;
            System.out.println("숫자는 0으로 나눌 수 없습니다.");
        } finally {
            System.out.println("test");
        }
    }
}
