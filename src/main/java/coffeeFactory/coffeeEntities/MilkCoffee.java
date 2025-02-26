package coffeeFactory.coffeeEntities;

/**
 * Expresso Coffee implementation.
 */
public class MilkCoffee implements Coffee {
    @Override
    public String renderCoffee() {
        return "This is an Milk Coffee!";
    }
}