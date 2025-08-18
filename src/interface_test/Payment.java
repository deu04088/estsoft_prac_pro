package interface_test;

import javax.security.auth.login.CredentialException;
import java.nio.file.CopyOption;

public interface Payment {
    void processPayment(double amount);
}

class CreditCard implements Payment {
    private String cardNumber;

    // 생성자
    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("payment: " + amount + " using card number: " + cardNumber);
    }
}

class Paypal implements Payment {
    private String email;

    public Paypal(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("payment: " + amount + "Paypal using email: " + email);
    }
}

