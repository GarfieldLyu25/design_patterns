package pattern.factory.AbstractFactory;

public class customer {
    public static void main(String[] args) {
        ItalyDessertFactory italyDessertFactory = new ItalyDessertFactory();
        Dessert dessert = italyDessertFactory.createDessert();
        Coffee coffee = italyDessertFactory.createCoffee();
        System.out.println(coffee.getName());
        dessert.show();
    }
}
