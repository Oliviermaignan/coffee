package paymentStrategy;

import common.PaymentMethod;
import paymentStrategy.paymentEntities.BankTransfer;
import paymentStrategy.paymentEntities.CreditCard;
import paymentStrategy.paymentEntities.PaymentMethodInterface;
import paymentStrategy.paymentEntities.Paypal;

public class PaymentStrategy {

    public static PaymentMethodInterface executePayment(PaymentMethod paymentMethod){
        if (paymentMethod.equals(PaymentMethod.CREDIT_CARD)){
            return new CreditCard();
        } else if (paymentMethod.equals(PaymentMethod.BANK_TRANSFER)) {
            return new BankTransfer();
        } else if (paymentMethod.equals(PaymentMethod.PAYPAL)) {
            return new Paypal();
        } else {
            throw new IllegalStateException("Payment method is not set.");
        }
    };
}
