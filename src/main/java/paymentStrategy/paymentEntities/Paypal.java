package paymentStrategy.paymentEntities;

public class Paypal implements PaymentMethodInterface {
    @Override
    public String pay() {
        return "pay by paypal";
    }
}