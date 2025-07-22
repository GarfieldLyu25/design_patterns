package pattern.factory.static_fat;


public class CoffeeStore {
    public Coffee orderCoffee(String Type) {
        Coffee coffee = SimpleCoffeeFactory.createCoffee(Type);
        coffee.addMilk();
        coffee.addsugar();
        return coffee;
    }
}
