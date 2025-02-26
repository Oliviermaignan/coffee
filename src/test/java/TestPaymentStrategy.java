import coffeeFactory.CoffeeFactory;
import coffeeFactory.coffeeEntities.Coffee;
import coffeeFactory.coffeeEntities.MilkCoffee;
import common.PaymentMethod;
import org.junit.jupiter.api.Test;
import paymentStrategy.PaymentStrategy;
import paymentStrategy.paymentEntities.PaymentMethodInterface;

import static org.junit.jupiter.api.Assertions.*;

public class TestPaymentStrategy {

    @Test
    public void testPaymentStrategy() {
        PaymentMethodInterface payment = PaymentStrategy.executePayment(PaymentMethod.CREDIT_CARD);
        assertNotNull(payment);
    }

}
