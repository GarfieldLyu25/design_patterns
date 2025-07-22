package pattern.factory.factort_method;

public class user {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        AmericanCoffeeFactory americanCoffeeFactory = new AmericanCoffeeFactory();
        coffeeStore.setFactory(americanCoffeeFactory);
        Coffee american = coffeeStore.orderCoffee();
        System.out.println(american.getName());
    }
}
