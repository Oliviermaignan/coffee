package coffeeFactory.coffeeEntities;

/**
 * Expresso Coffee implementation.
 */
public class ExpressoCoffee implements Coffee {
    @Override
    public String renderCoffee() {
        return "This is an Expresso!";
    }
}