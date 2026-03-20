package Lab08_Tasks.Task01;

public class BankTransfer implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Payment processed using Bank Transfer.");
    }
}
