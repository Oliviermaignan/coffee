import coffeeFactory.CoffeeFactory;
import coffeeFactory.coffeeEntities.Coffee;
import coffeeFactory.coffeeEntities.ExpressoCoffee;
import coffeeFactory.coffeeEntities.MilkCoffee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCoffeeFactory {

    @Test
    public void testMilkCoffee() {
        Coffee milkCoffee = CoffeeFactory.createCoffee("MilkCoffee");
        assertNotNull(milkCoffee);
        assertInstanceOf(MilkCoffee.class, milkCoffee);
    }
    @Test
    public void testExpressoCoffee() {
        Coffee milkCoffee = CoffeeFactory.createCoffee("ExpressoCoffee");
        assertNotNull(milkCoffee);
        assertInstanceOf(ExpressoCoffee.class, milkCoffee);
//        assertInstanceOf(Coffee, milkCoffee);
    }

}
