package coffeeDecorator;

import coffeeFactory.coffeeEntities.Coffee;

public class CoffeeWithChocolate extends CoffeeDecorator{

    public CoffeeWithChocolate(Coffee coffee){
        super(coffee);
    }

    @Override
    public String renderCoffee() {
        return this.coffee.renderCoffee() + " with chocolate";
    }
}
