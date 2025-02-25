public class CoffeeManager {
    private static CoffeeManager CoffeeManagerInstance;

    public static CoffeeManager getInstance() {
        if (CoffeeManagerInstance == null) {
            CoffeeManagerInstance = new CoffeeManager();
        }
        return CoffeeManagerInstance;
    }

}
