package coffeeFactory;

import coffeeFactory.coffeeEntities.Coffee;
import coffeeFactory.coffeeEntities.ExpressoCoffee;
import coffeeFactory.coffeeEntities.MilkCoffee;

public class CoffeeFactory {

    public static Coffee createCoffee(String coffeeType){
        if (coffeeType.equals("MilkCoffee")){
            return new MilkCoffee();
        } else if (coffeeType.equals("ExpressoCoffee")) {
            return new ExpressoCoffee();
        }  else {
            throw new IllegalArgumentException("Unknown coffee type: " + coffeeType);
        }
    }
}
