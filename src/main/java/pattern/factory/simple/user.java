package pattern.factory.simple;

public class user {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee american = coffeeStore.orderCoffee("american");
        System.out.println(american.getName());
    }
}
