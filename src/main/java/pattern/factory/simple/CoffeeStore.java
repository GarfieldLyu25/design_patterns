package pattern.factory.simple;

public class CoffeeStore {
    public Coffee orderCoffee(String Type) {
        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();
        Coffee coffee = simpleCoffeeFactory.createCoffee(Type);
        coffee.addMilk();
        coffee.addsugar();
        return coffee;
    }
}
