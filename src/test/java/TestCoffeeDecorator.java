import coffeeDecorator.CoffeeDecorator;
import coffeeDecorator.CoffeeWithChocolate;
import coffeeDecorator.CoffeeWithSugar;
import coffeeFactory.CoffeeFactory;
import coffeeFactory.coffeeEntities.Coffee;
import coffeeFactory.coffeeEntities.ExpressoCoffee;
import coffeeFactory.coffeeEntities.MilkCoffee;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCoffeeDecorator {
    @Test
    public void testMilkCoffee() {
        Coffee milkCoffee = CoffeeFactory.createCoffee("MilkCoffee");
        assertNotNull(milkCoffee);
        assertInstanceOf(MilkCoffee.class, milkCoffee);
    }

    @Test
    public void testCoffeWithChocolate() {
        Coffee milkCoffee = CoffeeFactory.createCoffee("MilkCoffee");
        assertInstanceOf(Coffee.class, milkCoffee);
        assertInstanceOf(MilkCoffee.class, milkCoffee);
        CoffeeWithChocolate coffeeWithChocolate = new CoffeeWithChocolate(milkCoffee);
        assertInstanceOf(CoffeeWithChocolate.class, coffeeWithChocolate);
        assertEquals("This is an Milk Coffee! with chocolate", coffeeWithChocolate.renderCoffee(), "Le message ne correspond pas au message attendu.");
    }

    @Test
    public void testCoffeWithSugar() {
        Coffee espressoCoffee = CoffeeFactory.createCoffee("ExpressoCoffee");
        assertInstanceOf(Coffee.class, espressoCoffee);
        assertInstanceOf(ExpressoCoffee.class, espressoCoffee);
        CoffeeWithSugar coffeeWithSugar = new CoffeeWithSugar(espressoCoffee);
        assertInstanceOf(CoffeeWithSugar.class, coffeeWithSugar);
        assertEquals("This is an Expresso Coffee! with sugar", coffeeWithSugar.renderCoffee(), "Le message ne correspond pas au message attendu.");
    }
}

