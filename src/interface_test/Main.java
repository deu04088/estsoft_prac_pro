package interface_test;

public class Main {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCard("1234567890");
        Payment paypalPayment = new Paypal("1234567890");

        creditCardPayment.processPayment(10000);
        paypalPayment.processPayment(10000);
    }
}