package paymentStrategy.paymentEntities;

public class BankTransfer implements PaymentMethodInterface {
    @Override
    public String pay() {
        return "pay by bank transfer";
    }
}