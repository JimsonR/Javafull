package Strategy;
// Enables selecting an algorithm's behavior at runtime
public interface PaymentStrategy {
    void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy{
    public void pay(int amount){
        System.out.println("Paid with credit card: "+ amount);
    }
}

class PayPalPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paid with PayPal: "+ amount );
    }

}
class ShoppingCart{
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;

    }
    public void checkout(int amount){
        paymentStrategy.pay(amount);
    }
}
