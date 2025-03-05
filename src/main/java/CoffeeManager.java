import coffeeFactory.coffeeEntities.Coffee;
import coffeeObserver.Observer;
import common.OrderStatus;

public class CoffeeManager {
    private static CoffeeManager CoffeeManagerInstance;
    Observer[] observers;
    OrderStatus orderStatus;
    private final OrderView orderView = new OrderView();
    Coffee coffee;

    public static CoffeeManager getInstance() {
        if (CoffeeManagerInstance == null) {
            CoffeeManagerInstance = new CoffeeManager();
        }
        return CoffeeManagerInstance;
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
    public void setStatus(OrderStatus newOrderStatus){
        this.orderStatus = newOrderStatus;
    }
}
