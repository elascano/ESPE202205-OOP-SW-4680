package template;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public abstract class CaffeineBeverage {

    void prepareRecipe() { // template method
        boilWater();
        brew();
        pourInCup();
        if (wantsCondiments()) {
            addCondiments();
        }
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    abstract void brew();

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    abstract void addCondiments();

    boolean wantsCondiments() {
        return true;
    }
// a hook operation
}

