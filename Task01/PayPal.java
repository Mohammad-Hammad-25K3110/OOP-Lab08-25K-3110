package Lab08_Tasks.Task01;

public class PayPal implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Payment processed using PayPal.");
    }
}
