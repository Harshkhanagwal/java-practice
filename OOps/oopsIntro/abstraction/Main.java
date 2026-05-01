abstract class Payment {
    abstract void pay(double amount);  
    void receipt(double amount) {
        System.out.println("Payment of " + amount + " received");
    }
}

class CreditCardPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Processing credit card payment of " + amount);
    }
}

class UPIPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Processing UPI payment of " + amount);
    }
}

public class Main {
    public static void main(String[] args) {

        Payment p;

        p = new CreditCardPayment();
        p.pay(1000);
        p.receipt(1000);

        p = new UPIPayment();
        p.pay(500);
        p.receipt(500);
    }
}