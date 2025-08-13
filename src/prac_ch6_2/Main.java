package prac_ch6_2;

class BankAccount {
    private int money;
    BankAccount(int money) {
        if (money < 0) this.money = 0;
        else this.money = money;
    }
    void deposit(int money) {
        if (money < 0) {
            System.out.println("음수는 입급할 수 없습니다.");
        }
        else {
            this.money += money;
            System.out.printf("입금 완료: %d원, 잔액: %d원\n", money, this.money);
        }
    }
    void withdraw(int money) {
        if (money < 0) {
            System.out.println("음수는 입급할 수 없습니다.");
        }
        else {
            if (this.money >= money) {
                this.money -= money;
                System.out.printf("출금 완료: %d원, 잔액: %d원\n", money, this.money);
            } else {
                System.out.printf("잔액이 부족합니다. 잔액: %d\n", this.money);
            }
        }
    }

    public int getBalance() {
        return this.money;
    }
}

public class Main {
    public static void main(String[] args) {
        // 생성자의 인자는 최초 금액
        BankAccount account = new BankAccount(5000);

        account.deposit(2000);
        account.withdraw(1000);
        account.withdraw(10000); // 잔액 부족

        System.out.println("최종 잔액: " + account.getBalance() + "원");
        System.out.println();

        // 마이너스 통장은 고려하지 말고.. 음수가 들어오면 0원으로 초기화
        BankAccount account2 = new BankAccount(-10000);

        System.out.println("최종 잔액: " + account2.getBalance() + "원");
        System.out.println();

        BankAccount account3 = new BankAccount(0);
        account3.deposit(-5000); // 음수 입금 불가
        account3.deposit(2000);
        account3.withdraw(-5000); // 음수 출금 불가
        account3.withdraw(500);

        System.out.println("최종 잔액: " + account3.getBalance() + "원");
    }
}

