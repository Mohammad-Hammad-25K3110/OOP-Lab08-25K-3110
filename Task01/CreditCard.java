package Lab08_Tasks.Task01;

public class CreditCard implements Payment {
    @Override
    public void processPayment() {
            System.out.println("Payment processed using Credit Card.");
    }
}
