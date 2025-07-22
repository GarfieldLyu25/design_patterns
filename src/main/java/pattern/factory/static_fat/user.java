package pattern.factory.static_fat;

public class user {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee american = coffeeStore.orderCoffee("american");
        System.out.println(american.getName());
    }
}
