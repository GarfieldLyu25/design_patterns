package pattern.factory.factort_method;

public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
