import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestCoffeeManager {

    @Test // Tag fourni par JUnit
    public void testSingletonSingleInstance() {
        CoffeeManager instance1 = CoffeeManager.getInstance();
        CoffeeManager instance2 = CoffeeManager.getInstance();
        assertSame(instance1, instance2, "Les deux instances doivent être identiques (Singleton)");
    }

    @Test
    public void testSingletonNotNull() {
        CoffeeManager instance = CoffeeManager.getInstance();
        assertNotNull(instance, "L'instance ne doit pas être nulle");
    }
}

