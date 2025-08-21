import java.util.Stack;

class Coin {
    private int value;

    public Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> stack = new Stack<>();
        stack.push(new Coin(1));
        stack.push(new Coin(2));
        stack.push(new Coin(3));
        int cnt = 0;

        while(!stack.isEmpty()){
            if (cnt ==3) break;

            Coin coin = stack.peek();
            System.out.println(coin.getValue());

            cnt++;
        }

        while(!stack.isEmpty()){
            Coin coin = stack.pop();
            System.out.println(coin.getValue());
        }
    }
}
