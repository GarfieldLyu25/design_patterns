package pattern.factory.configFactory;

public class customer {
    public static void main(String[] args) {
        Coffee american = CoffeeFactory.createCoffee("american");
        System.out.println(american.getName());
    }
}
