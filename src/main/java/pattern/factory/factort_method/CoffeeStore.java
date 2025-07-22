package pattern.factory.factort_method;


import pattern.factory.static_fat.SimpleCoffeeFactory;

public class CoffeeStore {

    private CoffeeFactory factory;
    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addsugar();
        return coffee;
    }

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }
}
