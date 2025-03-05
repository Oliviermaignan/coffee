package coffeeDecorator;

import coffeeFactory.coffeeEntities.Coffee;

public class CoffeeWithSugar extends CoffeeDecorator{

    public CoffeeWithSugar(
    Coffee coffee){
        super(coffee);
    }

    @Override
    public String renderCoffee() {
        return this.coffee.renderCoffee() + " with sugar";
    }
}
