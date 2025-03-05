import coffeeObserver.Observer;

public class OrderView implements Observer {

    @Override
    public String update() {
        return "j'ai été appelé ici orderView";
    }

}
