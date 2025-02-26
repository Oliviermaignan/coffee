package paymentStrategy.paymentEntities;

public class CreditCard implements PaymentMethodInterface {
    @Override
    public String pay() {
        return "pay by card";
    }
}
