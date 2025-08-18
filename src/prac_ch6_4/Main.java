package prac_ch6_4;

class Coffeemachine {
    private int been;
    Coffeemachine(int been) {
        if (been < 0) this.been = 0;
        else this.been = been;
    }
    void orderCoffee(String menu, int count, int been){
        if(this.been < been) {
            System.out.printf("원두가 부족합니다. 현재 원두: %dg\n", this.been);
        }
        else {
            this.been -= been;
            System.out.printf("%s %d잔이 준비되었습니다. 남은 원두: %dg\n", menu, count, this.been);
        }
    }
    void setBeen(int been) {
        this.been += been;
    }
    int getBeen() {
        return this.been;
    }
}

public class Main {
    public static void main(String[] args) {
        Coffeemachine coffeemachine = new Coffeemachine(100);
        coffeemachine.setBeen(10);                                                  // setter로 원두 추가

        coffeemachine.orderCoffee("아메리카노", 1, 20);              // 메뉴명, 개수, 원두 사용량 입력
        coffeemachine.orderCoffee("라떼", 1, 20);
        coffeemachine.orderCoffee("카푸치노", 1, 20);

        coffeemachine.orderCoffee("자바칩프라푸치노", 1, 60);
        System.out.printf("남은 원두량: %dg\n", coffeemachine.getBeen());
    }
}
